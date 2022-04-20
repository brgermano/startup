package br.com.fiap.startup.controller;

import br.com.fiap.startup.model.Empresa;
import br.com.fiap.startup.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("empresa")
public class EmpresaResource {
    @Autowired
    private EmpresaRepository empresaRepository;
    @GetMapping
    public List<Empresa> listar() { return empresaRepository.findAll(); }

    @GetMapping("{codigo}")
    public Empresa buscar(@PathVariable int codigo) {
        return empresaRepository.findById(codigo).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Empresa cadastrar(@RequestBody Empresa empresa) {
        return empresaRepository.save(empresa);
    }
    @PutMapping("{id}")
    public Empresa atualizar(@RequestBody Empresa empresa, @PathVariable int id) {
        empresa.setCodigo(id);
        return empresaRepository.save(empresa);
    }

    @DeleteMapping("{codigo}")
    public void remover(@PathVariable int codigo) {
        empresaRepository.deleteById(codigo);
    }
}
