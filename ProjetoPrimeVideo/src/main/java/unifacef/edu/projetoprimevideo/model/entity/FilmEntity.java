package unifacef.edu.projetoprimevideo.model.entity;
//adicionando após o projetoprimevideo.model.entity -> podemos ir em more actions e mover esse arquivo
//para uma nova pasta
import jakarta.persistence.*;


@Entity
@Table(name="Filme")
public class FilmEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="anoLancamento")
    private int anoLancamento;
    @Column(name="nota")
    private float nota;
}
