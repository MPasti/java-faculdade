package unifacef.edu.projetoprimevideo.service;

import org.springframework.stereotype.Service;
import unifacef.edu.projetoprimevideo.model.dto.FilmDTO;
import unifacef.edu.projetoprimevideo.model.entity.FilmEntity;

@Service
public class ConverserService {
    // converte FilmeDTO em FilmeEntity
    public FilmEntity converteFilmeDTO(FilmDTO filmeDTO){
        if (filmeDTO == null){
            return null;
        }
        FilmEntity aux =  new FilmEntity();
        aux.setId(filmeDTO.getId());
        aux.setNome(filmeDTO.getNome());
        aux.setAnoLancamento(filmeDTO.getAnoLancamento());
        aux.setNota(filmeDTO.getNota());
        return aux;
    }
    // converte FilmeEntity em FilmeDTO
    public FilmDTO converteFilmeEntity(FilmEntity filmeEntity){
        if (filmeEntity == null){
            return null;
        }
        FilmDTO aux =  new FilmDTO();

        aux.setId(filmeEntity.getId());
        aux.setNome(filmeEntity.getNome());
        aux.setAnoLancamento(filmeEntity.getAnoLancamento());
        aux.setNota(filmeEntity.getNota());
        return aux;
    }
}