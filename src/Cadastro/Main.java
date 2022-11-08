package Cadastro;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner meuScanner = new Scanner(System.in);

        Cliente pessoa;
        int menu;
        MenuDeClientes iniciar = new MenuDeClientes();

        String nome, dataDeNascimento, endereco, telefone;
        double cpf, rg;

        do{
            iniciar.exibirMenu();
            menu = meuScanner.nextInt();

            switch (menu) {
                case 0:
                    System.out.println ("Até a próxima");
                    break;
                case 1:
                    System.out.println ("Digite o nome: ");
                    nome = meuScanner.nextLine();
                    System.out.println ("Digite sua data de nascimento: ");
                    dataDeNascimento = meuScanner.next();
                    System.out.println ("Digite seu CPF: ");
                    cpf = meuScanner.nextDouble();
                    System.out.println ("Digite seu rg: ");
                    rg = meuScanner.nextDouble();
                    System.out.println ("Digite seu endereco: ");
                    endereco = meuScanner.nextLine();
                    System.out.println ("Digite seu telefone: ");
                    telefone = meuScanner.nextLine();

                    pessoa = new Cliente(nome,dataDeNascimento,cpf,rg,endereco,telefone);

                    // Guardar o cliente

                    MenuDeClientes.adicionarCliente(pessoa);

                    break;
                case 2:
                    System.out.println ("====== LISTAR CLIENTES======");
                    System.out.println(MenuDeClientes.listarClientes());
                    break;
                default:
                    System.out.println ("Digite um numero real");
                    iniciar.exibirMenu();
            }

        } while (menu !=0);


    }
}
