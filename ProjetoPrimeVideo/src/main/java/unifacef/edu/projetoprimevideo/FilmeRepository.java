package unifacef.edu.projetoprimevideo;

import org.springframework.data.jpa.repository.JpaRepository;
import unifacef.edu.projetoprimevideo.model.entity.FilmEntity;

public interface FilmeRepository extends JpaRepository<FilmEntity, Long> {
}
