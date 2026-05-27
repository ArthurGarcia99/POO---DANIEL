package dc.unifacef.bd.service;

import dc.unifacef.bd.model.Produto;
import dc.unifacef.bd.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    // a injeção de dependencia sera pelo construtor
    private ProdutoRepository repo;

    public ProdutoService(ProdutoRepository repo){
        this.repo = repo;
    }
    // listar os produtos da tabela produtos
    public List<Produto> Lista(){
        return repo.findAll();
    }
    // listar os produtos da tabela produtos por id
    public Optional<Produto> BuscarPorId(Long id){
        return repo.findById(id);
    }
    //remove o produto da tabela produtos
    public boolean remove(Long id){
        if(repo.existsById(id)) {
            repo.deleteById(id);
            return true; // remove o produto
        }
        return false; // nao remove
    }

}
