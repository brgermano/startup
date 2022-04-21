package br.com.fiap.startup.controller;

import br.com.fiap.startup.model.Empresa;
import br.com.fiap.startup.model.Ong;
import br.com.fiap.startup.repository.OngRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ong")
public class OngResource {
    @Autowired
    private OngRepository ongRepository;

    @GetMapping
    public List<Ong> listar() { return ongRepository.findAll(); }

    @GetMapping("{codigo}")
    public Ong buscar(@PathVariable int codigo) {
        return ongRepository.findById(codigo).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Ong cadastrar(@RequestBody Ong ong) {
        return ongRepository.save(ong);
    }

    @PutMapping("{id}")
    public Ong atualizar(@RequestBody Ong ong, @PathVariable int id) {
        ong.setCodigoOng(id);
        return ongRepository.save(ong);
    }

    @DeleteMapping("{codigo}")
    public void remover(@PathVariable int codigo) { ongRepository.deleteById(codigo); }
}
