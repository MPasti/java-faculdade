package unifacef.edu.projetoprimevideo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unifacef.edu.projetoprimevideo.model.entity.FilmEntity;

public interface FilmeRepository extends
        JpaRepository<FilmEntity, Long> {

    // esta interface vai herdar todos os métodos de CRUD
    // relacionado a FilmeEntity
    // create, retrieve, update, delete
}