package unifacef.edu.projetoprimevideo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unifacef.edu.projetoprimevideo.model.dto.FilmDTO;
import unifacef.edu.projetoprimevideo.service.FilmeService;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {

    // injeção de dependência
    @Autowired
    FilmeService injecao;

    @PostMapping
    public FilmDTO inserir(@RequestBody FilmDTO filmDTO){
        return injecao.insere(filmDTO);
    }

    @GetMapping
    public List<FilmDTO> consultaTodos(){
        return injecao.consultaTodos();
    }

    @GetMapping("/{id}")
    public FilmDTO consultaPorId(@PathVariable Long id){
        return injecao.consultaPorId(id);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable Long id){
        return injecao.remove(id);
    }

    @PutMapping
    public List<FilmDTO> atualizaNota10(){
        return injecao.atualizaNota10();
    }

    @PatchMapping("/{id}")
    public FilmDTO atualizaId(@PathVariable Long id, @RequestBody FilmDTO filmDTO){
        return injecao.atualizaId(id, filmDTO);
    }
}