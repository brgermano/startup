package br.com.fiap.startup.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@SequenceGenerator(name = "ong", sequenceName = "SQ_ONG", allocationSize = 1)
public class Ong {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ong")
    private int codigoOng;

    @NotBlank(message = "Nome da ong obrigatório!")
    @Size(max = 50)
    private String nome;

    @NotBlank(message = "Descrição da ong obrigatória!")
    @Size(max = 250)
    private String descricao;

    @NotBlank(message = "Endereço da ong obrigatório!")
    @Size(max = 150)
    private String endereco;

    @NotBlank(message = "Email da ong obrigatório!")
    @Size(max = 100)
    private String email;

    @NotBlank(message = "Telefone obrigatório")
    @Size(max = 11)
    private String telefone;

    public int getCodigoOng() {
        return codigoOng;
    }

    public void setCodigoOng(int codigoOng) {
        this.codigoOng = codigoOng;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
