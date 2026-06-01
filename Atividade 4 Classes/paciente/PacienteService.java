package dc.unifacef.bd.paciente;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    private PacienteRepository repo;

    public PacienteService(PacienteRepository repo) {
        this.repo = repo;
    }

    public List<Paciente> listar() {
        return repo.findAll();
    }

    public Optional<Paciente> buscarPorId(Long id) {
        return repo.findById(id);
    }

    // exclusão lógica: seta ativo = false, nunca deleta o registro
    public boolean remove(Long id) {
        Optional<Paciente> paciente = repo.findById(id);
        if (paciente.isPresent()) {
            Paciente p = paciente.get();
            p.setAtivo(false);
            repo.save(p);
            return true;
        }
        return false;
    }

    public Paciente atualiza(Long id, Paciente alterado) {
        if (repo.existsById(id)) {
            alterado.setId(id);
            return repo.save(alterado);
        }
        return null;
    }

    public Paciente salva(Paciente paciente) {
        return repo.save(paciente);
    }
}
