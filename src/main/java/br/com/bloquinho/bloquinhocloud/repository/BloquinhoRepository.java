package br.com.bloquinho.bloquinhocloud.repository;


        import br.com.bloquinho.bloquinhocloud.model.Bloquinho;
        import org.springframework.data.mongodb.repository.MongoRepository;

        import java.util.List;

public interface BloquinhoRepository extends MongoRepository<Bloquinho, String>{

    Bloquinho findByNome(String nome);

    Bloquinho findBloquinhoById(String id);

    List<Bloquinho> findByNomeContaining(String nome);

}