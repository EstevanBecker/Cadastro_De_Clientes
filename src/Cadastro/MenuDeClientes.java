package Cadastro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuDeClientes {
    private static ArrayList<Cliente> clientes = new ArrayList<>();

    //metodo GET
    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    //Adicionar um cliente na lista

    static public void adicionarCliente (Cliente cliente) {
        clientes.add(cliente);
    }

    // listar os dados de todos os clientes
    static public String listarClientes() {
        String saida = "";

        for (Cliente cliente : clientes) {
            int i = 1;
            saida += ("\n ======== CLIENTE Nº" + (i++));
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



