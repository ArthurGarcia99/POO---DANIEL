package dc.unifacef.bd.dentista;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dentistas")
public class DentistaController {

    private DentistaService service;

    public DentistaController(DentistaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Dentista>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Dentista>> buscarPorId(@PathVariable Long id) {
        Optional<Dentista> dentista = service.buscarPorId(id);
        if (dentista.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(dentista);
    }

    @PostMapping
    public ResponseEntity<Dentista> salva(@RequestBody Dentista dentista) {
        Dentista novo = service.salva(dentista);
        if (novo != null) {
            URI uri = URI.create("/dentistas/" + novo.getId());
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
    public ResponseEntity<Dentista> atualiza(@PathVariable Long id,
                                             @RequestBody Dentista alterado) {
        Dentista resposta = service.atualiza(id, alterado);
        if (resposta != null) {
            return ResponseEntity.ok(resposta);
        }
        return ResponseEntity.notFound().build();
    }
}
