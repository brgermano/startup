package br.com.fiap.startup.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@SequenceGenerator(name = "pedido", sequenceName = "SQ_PEDIDO", allocationSize = 1)
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido")
    private int codigoPedido;

    @NotBlank(message = "Id da empresa obrigatório!")
    private int IdEmpresa;

    @NotBlank(message = "Quantidade de crédito obrigatório!")
    private int quantidadeCredito;

    @NotBlank(message = "Forma de pagamento obrigatório!")
    private String formaPagamento;

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public int getIdEmpresa() {
        return IdEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        IdEmpresa = idEmpresa;
    }

    public int getQuantidadeCredito() {
        return quantidadeCredito;
    }

    public void setQuantidadeCredito(int quantidadeCredito) {
        this.quantidadeCredito = quantidadeCredito;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Pedido(){
    }

    public Pedido(int codigoPedido, int idEmpresa, int quantidadeCredito, String formaPagamento) {
        this.codigoPedido = codigoPedido;
        this.IdEmpresa = idEmpresa;
        this.quantidadeCredito = quantidadeCredito;
        this.formaPagamento = formaPagamento;
    }
}
