package br.com.delivery.controleDelivery.entrega.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.delivery.controleDelivery.entrega.application.api.EntregaAlterecaoRequest;
import br.com.delivery.controleDelivery.entrega.application.api.EntregaRequest;
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
public class Entrega {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idEntrega", updatable = false, unique = true, nullable = false)
	private UUID idEntrega;
	@NotNull
	@Column(columnDefinition = "uuid", name = "idPedido", nullable = false)
	private UUID idPedido;
	@NotBlank
	private String nomeCliente;
	private String pontoRefencia;
	@NotBlank
	private String enderecoEntrega;
	@NotBlank
	private String numeroCasa;
	

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime getDataHoraDaUltimaAlteracao;
	

	public Entrega(UUID idPedido, @Valid EntregaRequest entregaRequest) {
		this.idPedido = idPedido;
		this.nomeCliente = entregaRequest.getNomeCliente();
		this.pontoRefencia = entregaRequest.getPontoRefencia();
		this.enderecoEntrega = entregaRequest.getEnderecoEntrega();
		this.numeroCasa = entregaRequest.getNumeroCasa();
		this.dataHoraDoCadastro = LocalDateTime.now();

	}


	public void altera(@Valid EntregaAlterecaoRequest entregaRequest) {
		this.pontoRefencia = entregaRequest.getPontoRefencia();
		this.enderecoEntrega = entregaRequest.getEnderecoEntrega();
		this.numeroCasa = entregaRequest.getNumeroCasa();
		this.getDataHoraDaUltimaAlteracao = LocalDateTime.now();
		
	}	


}
