package br.com.bloquinho.bloquinhocloud.repository;


import br.com.bloquinho.bloquinhocloud.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    Usuario findByUsuario(String usuario);

    Usuario findByUsuarioAndSenha(String usuario, String senha);

}