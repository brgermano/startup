package br.com.fiap.startup.controller;

import br.com.fiap.startup.model.Pedido;
import br.com.fiap.startup.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pedido")
public class PedidoResource{
    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public List<Pedido>listar() { return pedidoRepository.findAll(); }

    @GetMapping("{codigo}")
    public Pedido buscar(@PathVariable int codigo) { return pedidoRepository.findById(codigo).get(); }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public Pedido cadastrar(@RequestBody Pedido pedido) { return pedidoRepository.save(pedido); }

    @PutMapping("{id}")
    public Pedido atualizar(@RequestBody Pedido pedido, @PathVariable int id) {
        pedido.getCodigoPedido();
        return pedidoRepository.save(pedido);
    }

    @DeleteMapping("{codigo}")
    public void remover(@PathVariable int codigo) { pedidoRepository.deleteById(codigo); }

}
