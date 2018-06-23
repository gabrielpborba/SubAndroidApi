package br.com.bloquinho.bloquinhocloud.component;


        import br.com.bloquinho.bloquinhocloud.model.Bloquinho;
        import br.com.bloquinho.bloquinhocloud.repository.BloquinhoRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import org.springframework.web.bind.annotation.RequestBody;

        import java.util.ArrayList;
        import java.util.List;

@Service
public class BloquinhoComponent {

    @Autowired
    BloquinhoRepository bloquinhoRepository;


    public void salvar(Bloquinho bloquinho) {
        Bloquinho bloquinhos = bloquinhoRepository.findByNome(bloquinho.getNome());
        if (bloquinhos != null) {
            bloquinho.setId(bloquinhos.getId());
        }

        bloquinhoRepository.save(bloquinho);
    }

    public void atualizar(@RequestBody Bloquinho bloquinho) {
        bloquinhoRepository.save(bloquinho);
    }

    public List<Bloquinho> buscarTodos(){
        return bloquinhoRepository.findAll();
    }


    public Bloquinho buscarBloquinhoNome(String nome) {
        Bloquinho bloquinhos = bloquinhoRepository.findByNome(nome);

        if (bloquinhos == null) {
            return new Bloquinho();
        } else {
            return bloquinhoRepository.findByNome(nome);
        }
    }


    public List<Bloquinho> findByNomeContaining(String nome) {
        List<Bloquinho> bloquinhos = bloquinhoRepository.findByNomeContaining(nome);

        if (bloquinhos == null) {
            return new ArrayList<>();
        } else {
            return bloquinhos;
        }
    }


    public Bloquinho buscarBloquinhoById(String idBloquinho) {
        Bloquinho bloquinho = bloquinhoRepository.findBloquinhoById(idBloquinho);
        return bloquinho;
    }


    public void deleteAll() {
        bloquinhoRepository.deleteAll();
    }


    public void deleteById(String idBloquinho) {
        Bloquinho bloquinho = buscarBloquinhoById(idBloquinho);

        if (bloquinho != null) {
            bloquinhoRepository.delete(bloquinho);
        }

    }

}