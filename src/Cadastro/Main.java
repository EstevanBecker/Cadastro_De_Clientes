package Cadastro;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner meuScanner = new Scanner(System.in);
        Cliente pessoa;
        Cliente pessoaComResponsavel;
        int menu;
        MenuDeClientes iniciar = new MenuDeClientes();

        String nome, dataDeNascimento, endereco, telefone, nomeResponsavel;
        double cpf, rg, pergunta, cpfResponsavel;


        do{
            iniciar.exibirMenu();
            menu = meuScanner.nextInt();

            switch (menu) {
                case 0:
                    System.out.println ("Até a próxima");
                    break;
                case 1:
                    System.out.println ("Digite o nome: ");
                    nome = meuScanner.next();

                    System.out.println ("Digite sua data de nascimento");
                    dataDeNascimento = meuScanner.next();

                    System.out.println ("Você é maior de idade? 1 para SIM e 2 para NAO");
                    pergunta = meuScanner.nextDouble();

                    if (pergunta == 2) {
                        System.out.println ("Digite o nome do responsável legal: ");
                        nomeResponsavel = meuScanner.next();

                        System.out.println ("Digite o CPF do responsável legal: ");
                        cpfResponsavel = meuScanner.nextDouble();

                        Responsavel responsavel = new Responsavel(nomeResponsavel, cpfResponsavel);

                        MenuDeClientes.adicionarResponsavel(responsavel);

                        System.out.println("Digite seu CPF: ");
                        cpf = meuScanner.nextDouble();

                        System.out.println("Digite seu rg");
                        rg = meuScanner.nextDouble();

                        System.out.println("Digite seu endereco");
                        endereco = meuScanner.next();

                        System.out.println("Digite seu telefone");
                        telefone = meuScanner.next();

                        Telefone contato = new Telefone(telefone);

                        MenuDeClientes.adicionarTelefone(contato);

                        pessoaComResponsavel = new Cliente (nome, dataDeNascimento, cpf, rg, endereco, contato, responsavel);
                        MenuDeClientes.adicionarCliente(pessoaComResponsavel);
                    }
                    else {
                        System.out.println("Digite seu CPF: ");
                        cpf = meuScanner.nextDouble();

                        System.out.println("Digite seu rg");
                        rg = meuScanner.nextDouble();

                        System.out.println("Digite seu endereco");
                        endereco = meuScanner.next();

                        System.out.println("Digite seu telefone");
                        telefone = meuScanner.next();

                        Telefone contato = new Telefone(telefone);

                        MenuDeClientes.adicionarTelefone(contato);

                        pessoa = new Cliente(nome, dataDeNascimento, cpf, rg, endereco, contato);

                        // Guardar o cliente

                        MenuDeClientes.adicionarCliente(pessoa);
                    }
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
