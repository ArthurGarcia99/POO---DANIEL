package dc.unifacef.bd.paciente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    // save(), findAll(), findById(), existsById(), deleteById()

}
