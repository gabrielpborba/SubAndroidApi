package br.com.bloquinho.bloquinhocloud.controller;



        import br.com.bloquinho.bloquinhocloud.component.BloquinhoComponent;
        import br.com.bloquinho.bloquinhocloud.model.Bloquinho;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/bloquinho")
public class BloquinhoController {

    @Autowired
    BloquinhoComponent bloquinhoComponent;

    @GetMapping("/nome/{nome}")
    public Bloquinho buscarBloquinhoNome(@PathVariable(value = "nome") String nome){
        return bloquinhoComponent.buscarBloquinhoNome(nome);
    }

    @GetMapping("/nomeParcial/{nome}")
    public List<Bloquinho> findByNomeContaining(@PathVariable(value = "nome") String nome){
        return bloquinhoComponent.findByNomeContaining(nome);
    }

    @GetMapping("/id/{id}")
    public Bloquinho buscarItemId(@PathVariable(value = "id") String id)
    {
        return bloquinhoComponent.buscarBloquinhoById(id);
    }

    @GetMapping()
    public List<Bloquinho> buscarTodos(){
        return bloquinhoComponent.buscarTodos();
    }

    @PostMapping
    public void salvar(@RequestBody Bloquinho item) {
        bloquinhoComponent.salvar(item);
    }

    @PutMapping
    public void atualizar(@RequestBody Bloquinho item) {
        bloquinhoComponent.atualizar(item);
    }

    @DeleteMapping
    private void deleteAll() {
        bloquinhoComponent.deleteAll();
    }

    @DeleteMapping("/id/{id}")
    private void deleteById(@PathVariable(value = "id") String id) {
        bloquinhoComponent.deleteById(id);
    }

}