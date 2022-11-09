package Cadastro;
import java.util.ArrayList;

public class MenuDeClientes {
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Responsavel> responsaveis = new ArrayList<>();

    private static ArrayList<Telefone> telefones = new ArrayList<>();

    //metodo GET
    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public static ArrayList<Responsavel> getResponsaveis(){
        return responsaveis;
    }

    public static ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    //Adicionar um cliente na lista

    static public void adicionarCliente (Cliente cliente) {
        clientes.add(cliente);
    }

    static public void adicionarResponsavel (Responsavel responsavel) {
        responsaveis.add(responsavel);
    }

    static public void adicionarTelefone (Telefone contato){
        telefones.add(contato);
    }

    // listar os dados de todos os clientes
    static public String listarClientes() {
        String saida = "";

        for (Cliente cliente : clientes) {
            int i = 1;
            saida += (" \n ======== CLIENTE Nº " + (i++) );
            saida += cliente.imprimir();
        }
        return saida;
    }

    public void exibirMenu() {
        System.out.println ("=============Seja bem vindo ao cadastro de clientes========");
        System.out.println ("0 - SAIR DO PROGRAMA");
        System.out.println ("1 - CADASTRAR");
        System.out.println ("2 - Listar Clientes");
    }
}



