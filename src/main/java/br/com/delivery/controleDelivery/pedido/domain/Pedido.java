package br.com.delivery.controleDelivery.pedido.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idPedido", updatable = false, unique = true, nullable = false)
    private UUID idPedido;
    @NotBlank
    private String quantidade;
    @NotBlank
    private String descricao;
    @NotBlank
    private String metodoPagamento;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime getDataHoraDaUltimaAlteracao;

    public Pedido(UUID idPedido, String quantidade, String descricao, String enderecoCliente, String metodoPagamento, LocalDateTime dataHoraDoCadastro, LocalDateTime getDataHoraDaUltimaAlteracao) {
        this.idPedido = idPedido;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.metodoPagamento = metodoPagamento;
        this.dataHoraDoCadastro = dataHoraDoCadastro;
        this.getDataHoraDaUltimaAlteracao = getDataHoraDaUltimaAlteracao;
    }
}
