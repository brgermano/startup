package model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@SequenceGenerator(name = "empresa", sequenceName = "SQ_EMPRESA", allocationSize = 1)
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empresa")
    private int codigo;

    @NotBlank(message = "Nome fantasia obrigatório!")
    @Size(max = 50)
    private String nomeFantasia;

    @NotBlank(message = "Razão Social obrigatório")
    @Size(max = 70)
    private String razaoSocial;

    @NotBlank(message = "Cnpj obrigatório")
    @Size(max = 14)
    private String cnpj;

    @NotBlank(message = "Endereço obrigatório")
    @Size(max = 100)
    private String endereco;

    @NotBlank(message = "Telefone obrigatório")
    @Size(max = 11)
    private String telefone;

    @NotBlank(message = "Email obrigatório")
    @Size(max = 40)
    private String email;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
