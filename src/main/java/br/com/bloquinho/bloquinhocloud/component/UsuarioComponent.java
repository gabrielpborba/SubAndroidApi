package br.com.bloquinho.bloquinhocloud.component;


import br.com.bloquinho.bloquinhocloud.model.Usuario;
import br.com.bloquinho.bloquinhocloud.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioComponent {

    @Autowired
    UsuarioRepository usuarioRepository;

    public void salvar(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public Usuario buscarUsuario(String user, String senha) {
        Usuario usuario = usuarioRepository.findByUsuarioAndSenha(user, senha);
        return usuario;
    }

    public void deleteAll() {
        usuarioRepository.deleteAll();
    }

}