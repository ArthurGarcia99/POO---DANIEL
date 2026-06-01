package dc.unifacef.bd.paciente;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private PacienteService service;

    public PacienteController(PacienteService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Paciente>> buscarPorId(@PathVariable Long id) {
        Optional<Paciente> paciente = service.buscarPorId(id);
        if (paciente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(paciente);
    }

    @PostMapping
    public ResponseEntity<Paciente> salva(@RequestBody Paciente paciente) {
        Paciente novo = service.salva(paciente);
        if (novo != null) {
            URI uri = URI.create("/pacientes/" + novo.getId());
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
    public ResponseEntity<Paciente> atualiza(@PathVariable Long id,
                                             @RequestBody Paciente alterado) {
        Paciente resposta = service.atualiza(id, alterado);
        if (resposta != null) {
            return ResponseEntity.ok(resposta);
        }
        return ResponseEntity.notFound().build();
    }
}
