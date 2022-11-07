package Cadastro;
public class Cliente {
    private String nome;
    private String dataDeNascimento;
    private double cpf;
    private double rg;
    private String endereco;
    private String telefone;


    public Cliente(String nome, String dataDeNascimento, double cpf, double rg, String endereco, String telefone) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento () {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public double getRg() {
        return rg;
    }

    public void setRg(double rg) {
        this.rg = rg;
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

    public String imprimir() {
        return "Nome: " + nome + "Data de Nascimento: " + dataDeNascimento + "cpf: " + cpf +
                "RG: " + rg + "Endereco: " + endereco + "Contato: " + telefone;
    }

}


