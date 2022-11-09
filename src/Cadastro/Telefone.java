package Cadastro;

public class Telefone {
    private String contato;

    public Telefone (String contato) {
        this.contato = contato;
    }

    public String getContato(){
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "contato='" + contato + '\'' +
                '}';
    }
}
