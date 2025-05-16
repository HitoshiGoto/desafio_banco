import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double saldo = 1500.00;
        int opcaoConta = 0;
        int opcao = 0;


        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String nome = leitura.nextLine();

        System.out.println("Escolha o tipo de conta: \n1 - Corrente \n2 - Poupança ");

        while ( opcaoConta != 1 && opcaoConta!= 2) {
            opcaoConta = leitura.nextInt();

            if (opcaoConta == 1 ) {
                System.out.println("Corrente");
                }
                else if (opcaoConta == 2 ) {
                    System.out.println("Poupança");
                 } else {
                     System.out.println("Opção inválida.\n \nEscolha uma opção válida para continuar. \n1 - Corrente \n2 - Poupança");
                 }

            }

        System.out.println("**********************************\n");
        System.out.println("Nome do Cliente: " + nome );
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n**********************************");


        String menu = """
                *** Digite sua opção ***
                1 - Consultar saldo.
                2 - Transferir valor.
                3 - Receber valor.
                4 - Sair.
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atualizado é: " + saldo);

            } else  if(opcao == 2) {
                System.out.println("Qual o valor que deseja transferir: ");
                double valor = leitura.nextDouble();
                if (saldo < valor ) {
                    System.out.println("Não foi possível transferir. \nSaldo insuficiente.\n");
                }  else {
                    saldo -= valor;
                    System.out.println("Seu saldo atualizado é: " + saldo);
                }
            } else  if (opcao == 3) {
                System.out.println("Qual o valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Seu saldo atualizado é: " + saldo);
            }  else  if (opcao !=4) {
                System.out.println("Opção inválida.");
            }


        }
        }
    }
