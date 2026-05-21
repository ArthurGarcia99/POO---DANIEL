package dc.unifacef.memoria.service;

import dc.unifacef.memoria.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    //cria o arraylist
    private List<Produto> produtos = new ArrayList<Produto>();
    private Long id = 1l;

    //consulta os produtos na lista
    public List<Produto> consulta() {
        return this.produtos;
    }

    //inseri produto na lista
    public Produto cria(Produto produto){
        produto.setId(id);
        id++;
        this.produtos.add(produto);
        return produto;
    }

    //remove um produto com id
    public boolean remove(long id){
        //a funcao removeif faz o pra gente
        //para cada produto p, se o id do produto é igual ao id dos produtos do vetor
        return this.produtos.removeIf(produto -> produto.getId().equals(id));
    }

    //atualiza um produto por id
    public Produto atualiza(Long id, Produto novo){
        novo.setId(id);
        // percorre para atualizar o produto
        for(int i=0;i<this.produtos.size();i++){
            if (this.produtos.get(i).getId().equals(id)){
                // encontrei
                this.produtos.set(i, novo); // atualizado
                return novo;
            }
        }
        return null; // produto não encontrado para atualizar
    }
}
