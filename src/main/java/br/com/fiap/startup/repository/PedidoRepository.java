package br.com.fiap.startup.repository;

import br.com.fiap.startup.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
