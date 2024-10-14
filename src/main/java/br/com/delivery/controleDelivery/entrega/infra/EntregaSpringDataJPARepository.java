package br.com.delivery.controleDelivery.entrega.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.delivery.controleDelivery.entrega.domain.Entrega;

public interface EntregaSpringDataJPARepository extends JpaRepository<Entrega, UUID> {
	List<Entrega> findByIdPedidos(UUID idPedido);

}
