package dc.unifacef.bd.repository;

import dc.unifacef.bd.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // essa interface vai conter os metodos de CRUD da tabela produto
    // save(), findAll(), findById(), remove(), existsById(), count()
    // Essa é a classe que mais se aproxima do Banco De Dados


}
