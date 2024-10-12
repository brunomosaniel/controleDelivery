package br.com.delivery.controleDelivery.pedido.infra;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.delivery.controleDelivery.pedido.domain.Pedido;
import java.util.List;


public interface PedidoSpringDataJPARepository extends JpaRepository<Pedido, UUID> {
	List<Pedido> findByIdCliente(UUID idCliente);
}
