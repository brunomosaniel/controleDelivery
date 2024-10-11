package br.com.delivery.controleDelivery.pedido.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.delivery.controleDelivery.pedido.application.api.PedidoRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idPedido", updatable = false, unique = true, nullable = false)
	private UUID idPedido;
	@NotNull
	private UUID idCliente;
	@NotBlank
	private String quantidade;
	@NotBlank
	private String descricao;
	@NotBlank
	private String metodoPagamento;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime getDataHoraDaUltimaAlteracao;

	public Pedido(UUID idCliente2, @Valid PedidoRequest pedidoRequest) {
		this.idCliente = idCliente;
		this.quantidade = pedidoRequest.getQuantidade();
		this.descricao = pedidoRequest.getDescricao();
		this.metodoPagamento = pedidoRequest.getMetodoPagamento();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
}