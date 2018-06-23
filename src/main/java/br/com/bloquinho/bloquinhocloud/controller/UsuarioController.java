package br.com.bloquinho.bloquinhocloud.controller;

        import br.com.bloquinho.bloquinhocloud.component.UsuarioComponent;
        import br.com.bloquinho.bloquinhocloud.model.Usuario;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    UsuarioComponent usuarioComponent;

    @GetMapping("/usuario/{usuario}/{senha}")
    public Usuario buscarUsuario(@PathVariable(value = "usuario") String usuario,
                                 @PathVariable(value = "senha") String senha){
        return usuarioComponent.buscarUsuario(usuario, senha);
    }

    @PostMapping
    public void salvar(@RequestBody Usuario usuario) {
        usuarioComponent.salvar(usuario);
    }

    @DeleteMapping
    private void deleteAll() {
        usuarioComponent.deleteAll();
    }

}