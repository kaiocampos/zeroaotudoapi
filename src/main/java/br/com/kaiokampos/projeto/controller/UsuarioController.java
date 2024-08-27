package br.com.kaiokampos.projeto.controller;

import br.com.kaiokampos.projeto.dto.UsuarioDTO;
import br.com.kaiokampos.projeto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioDTO> listarTodos(){
        return usuarioService.listarTodos();
    }

    @PostMapping
    public void inserir(@RequestBody UsuarioDTO usuario){
        usuarioService.inserir(usuario);
    }

    @PutMapping
    public UsuarioDTO alterar(@RequestBody UsuarioDTO usuario){
        return usuarioService.alterar(usuario);
    }

    @DeleteMapping
    public ResponseEntity<Void> excluir(Long id){
        usuarioService.excluir(id);
        return ResponseEntity.ok().build();
    }


}
