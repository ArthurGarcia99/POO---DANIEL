package dc.unifacef.bd.dentista;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DentistaRepository extends JpaRepository<Dentista, Long> {

    // save(), findAll(), findById(), existsById(), deleteById()

}
