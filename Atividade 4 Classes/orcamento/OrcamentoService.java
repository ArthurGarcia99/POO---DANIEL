package dc.unifacef.bd.orcamento;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrcamentoService {

    private OrcamentoRepository repo;

    public OrcamentoService(OrcamentoRepository repo) {
        this.repo = repo;
    }

    public List<Orcamento> listar() {
        return repo.findAll();
    }

    public Optional<Orcamento> buscarPorId(Long id) {
        return repo.findById(id);
    }

    public boolean remove(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }

    // orçamento aprovado não pode ser alterado
    public Orcamento atualiza(Long id, Orcamento alterado) {
        Optional<Orcamento> existente = repo.findById(id);
        if (existente.isPresent()) {
            if (existente.get().getAprovado()) {
                return null;
            }
            alterado.setId(id);
            return repo.save(alterado);
        }
        return null;
    }

    // valor total nunca pode ser zero ou negativo
    public Orcamento salva(Orcamento orcamento) {
        if (orcamento.getValorTotal() == null || orcamento.getValorTotal() <= 0) {
            return null;
        }
        return repo.save(orcamento);
    }
}
