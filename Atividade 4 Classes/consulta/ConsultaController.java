package dc.unifacef.bd.consulta;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    private ConsultaService service;

    public ConsultaController(ConsultaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Consulta>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Consulta>> buscarPorId(@PathVariable Long id) {
        Optional<Consulta> consulta = service.buscarPorId(id);
        if (consulta.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(consulta);
    }

    @PostMapping
    public ResponseEntity<Consulta> salva(@RequestBody Consulta consulta) {
        Consulta nova = service.salva(consulta);
        if (nova != null) {
            URI uri = URI.create("/consultas/" + nova.getId());
            return ResponseEntity.created(uri).body(nova);
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
    public ResponseEntity<Consulta> atualiza(@PathVariable Long id,
                                             @RequestBody Consulta alterado) {
        Consulta resposta = service.atualiza(id, alterado);
        if (resposta != null) {
            return ResponseEntity.ok(resposta);
        }
        return ResponseEntity.notFound().build();
    }
}
