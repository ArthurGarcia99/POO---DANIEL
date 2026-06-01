package dc.unifacef.bd.dentista;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DentistaService {

    private DentistaRepository repo;

    public DentistaService(DentistaRepository repo) {
        this.repo = repo;
    }

    public List<Dentista> listar() {
        return repo.findAll();
    }

    public Optional<Dentista> buscarPorId(Long id) {
        return repo.findById(id);
    }

    // exclusão lógica: seta ativo = false, nunca deleta o registro
    public boolean remove(Long id) {
        Optional<Dentista> dentista = repo.findById(id);
        if (dentista.isPresent()) {
            Dentista d = dentista.get();
            d.setAtivo(false);
            repo.save(d);
            return true;
        }
        return false;
    }

    public Dentista atualiza(Long id, Dentista alterado) {
        if (repo.existsById(id)) {
            alterado.setId(id);
            return repo.save(alterado);
        }
        return null;
    }

    public Dentista salva(Dentista dentista) {
        return repo.save(dentista);
    }
}
