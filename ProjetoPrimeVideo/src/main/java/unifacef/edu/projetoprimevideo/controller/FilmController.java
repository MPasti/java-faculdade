package unifacef.edu.projetoprimevideo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unifacef.edu.projetoprimevideo.model.dto.FilmDTO;
import unifacef.edu.projetoprimevideo.service.FilmeService;

@RestController
@RequestMapping("/film")
public class FilmController {

    // injeção de dependência
    @Autowired
    FilmeService injecao;

    @PostMapping
    public FilmDTO inserir(@RequestBody FilmDTO filmeDTO){
        return injecao.insere(filmeDTO);
    }
}