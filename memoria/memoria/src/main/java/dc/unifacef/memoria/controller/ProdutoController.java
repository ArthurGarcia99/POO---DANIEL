package dc.unifacef.memoria.controller;

import dc.unifacef.memoria.model.Produto;
import dc.unifacef.memoria.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController // controlador de requisicao REST
@RequestMapping("/produto") // mapeamento da requisicao
public class ProdutoController {

    //injencao de dependencia
    //chamar metodos de um objeto sem instacia-lo
    @Autowired
    ProdutoService service;

    //ResponseEntity é um tipo de dado de retorno do controller para FRONT END (FE)
    @GetMapping
    public ResponseEntity<List<Produto>> consulta(){
        return ResponseEntity.ok(service.consulta());
    }

    @PostMapping
    public ResponseEntity<Produto> cria(@RequestBody Produto produto){
        Produto novo = service.cria(produto);
        //URI uniforme resource identifier
        URI uri = URI.create("/produto/" + novo.getId());
        return ResponseEntity.created(uri).body(novo);
    }
}
