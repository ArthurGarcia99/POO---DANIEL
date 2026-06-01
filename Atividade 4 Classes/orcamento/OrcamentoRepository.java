package dc.unifacef.bd.orcamento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrcamentoRepository extends JpaRepository<Orcamento, Long> {

    // save(), findAll(), findById(), existsById(), deleteById()

}
