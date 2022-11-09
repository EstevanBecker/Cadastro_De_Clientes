package Cadastro;

public class Responsavel {

    private String nomeResponsavel;
    private double cpfResponsavel;

    public Responsavel (String nomeResponsavel, double cpfResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
        this.cpfResponsavel = cpfResponsavel;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel (String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public double getCpfResponsavel() {
        return cpfResponsavel;
    }

    public void setCpfResponsavel(double cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
    }

    @Override
    public String toString() {
        return "Responsavel{" +
                "nomeResponsavel='" + nomeResponsavel + '\'' +
                ", cpfResponsavel='" + cpfResponsavel + '\'' +
                '}';
    }
}
