package dc.unifacef.bd.orcamento;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orcamentos")
public class OrcamentoController {

    private OrcamentoService service;

    public OrcamentoController(OrcamentoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Orcamento>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Orcamento>> buscarPorId(@PathVariable Long id) {
        Optional<Orcamento> orcamento = service.buscarPorId(id);
        if (orcamento.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(orcamento);
    }

    @PostMapping
    public ResponseEntity<Orcamento> salva(@RequestBody Orcamento orcamento) {
        Orcamento novo = service.salva(orcamento);
        if (novo != null) {
            URI uri = URI.create("/orcamentos/" + novo.getId());
            return ResponseEntity.created(uri).body(novo);
        }
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remove(@PathVariable Long id) {
        if (service.remove(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Orcamento> atualiza(@PathVariable Long id,
                                              @RequestBody Orcamento alterado) {
        Orcamento resposta = service.atualiza(id, alterado);
        if (resposta != null) {
            return ResponseEntity.ok(resposta);
        }
        return ResponseEntity.notFound().build();
    }
}
