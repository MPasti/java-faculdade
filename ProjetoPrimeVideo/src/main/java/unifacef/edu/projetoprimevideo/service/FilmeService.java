package unifacef.edu.projetoprimevideo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unifacef.edu.projetoprimevideo.model.dto.FilmDTO;
import unifacef.edu.projetoprimevideo.model.entity.FilmEntity;
import unifacef.edu.projetoprimevideo.model.repository.FilmeRepository;

@Service
public class FilmeService {

    @Autowired
    FilmeRepository injecao;

    public FilmDTO insere(FilmDTO filmDTO){

        FilmEntity resposta = injecao.save(converteDTO(filmDTO));
        return converteEntity(resposta)
    }

    public FilmeEntity converteDTO(FilmDTO filmDTO){
        return new FilmDTO(filmDTO.getId(), filmDTO.getNome(), filmDTO.getAnoLancamento(), filmDTO.getNota());
    }

    public FilmDTO converteEntity(FilmEntity filmEntity){
        return new FilmDTO(filmEntity.getId(), filmEntity.getNome(), filmDTO)
    }
}
