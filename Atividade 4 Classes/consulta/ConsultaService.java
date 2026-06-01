package dc.unifacef.bd.consulta;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService {

    private ConsultaRepository repo;

    public ConsultaService(ConsultaRepository repo) {
        this.repo = repo;
    }

    public List<Consulta> listar() {
        return repo.findAll();
    }

    public Optional<Consulta> buscarPorId(Long id) {
        return repo.findById(id);
    }

    public boolean remove(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }

    public Consulta atualiza(Long id, Consulta alterado) {
        if (repo.existsById(id)) {
            alterado.setId(id);
            return repo.save(alterado);
        }
        return null;
    }

    public Consulta salva(Consulta consulta) {
        return repo.save(consulta);
    }
}
