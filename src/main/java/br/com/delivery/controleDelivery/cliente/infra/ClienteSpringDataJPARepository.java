package br.com.delivery.controleDelivery.cliente.infra;

import br.com.delivery.controleDelivery.cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID> {
}
