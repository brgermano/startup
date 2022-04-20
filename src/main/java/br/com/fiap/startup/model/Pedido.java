package br.com.fiap.startup.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@SequenceGenerator(name = "pedido", sequenceName = "SQ_PEDIDO", allocationSize = 1)
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido")
    private int codigoPedido;

    @NotNull(message = "Codigo da empresa obrigatório!")
    private int codigoEmpresa;

   @NotNull(message = "Quantidade de crédito obrigatório!")
    @Min(value=0, message = "Quantidade não pode ser negativo!")
    private int quantidadeCredito;

   @NotBlank(message = "Forma de pagamento obrigatório!")
   @Size(max = 70)
    private String formaPagamento;

   @ManyToOne
   private Empresa empresa;

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public int getcodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setcodigoEmpresa(int codigoEmpresa) {
        codigoEmpresa = codigoEmpresa;
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

    public Pedido(int codigoPedido, int codigoEmpresa, int quantidadeCredito, String formaPagamento) {
        this.codigoPedido = codigoPedido;
        this.codigoEmpresa = codigoEmpresa;
        this.quantidadeCredito = quantidadeCredito;
        this.formaPagamento = formaPagamento;
    }
}
