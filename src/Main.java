import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Jorge";
        String tipoDeConta = "Corrente";
        double saldo = 1500.00;
        int opcao = 0;

        System.out.println("***************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("tipo da conta: " + tipoDeConta);
        System.out.println("saldo do cliente: " + saldo);
        System.out.println("\n***************************");

        String menu = """
                    ** Digite sua opção **
                    1 - Saldo em conta
                    2 - Tranferir valor
                    3 - Deposito
                    4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente" + saldo);

                } else {
                    saldo -= valor;
                    System.out.println("Transferencia realizada com sucesso, seu saldo restante é: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Depósito realizado com sucesso, seu saldo restante é: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção invalida");
            }
        }
    }
}