import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nome = "David Magalhães";
        String tipoConta = "Conta Corrente";
        double saldo = 1500.0;
        int opcaoMenu = 0;

        String menu = """
                Digite uma opção:
                1. Consultar saldo
                2. Retirar valor
                3. Despositar valor
                4. Sair
                """;

        while (opcaoMenu != 4) {
            System.out.println(menu);
            opcaoMenu = entrada.nextInt();

            if (opcaoMenu == 1) {
                System.out.println("Consulta Saldo");
                System.out.println("*****************************");
                System.out.println("Cliente: " + nome);
                System.out.println("Tipo de conta: " + tipoConta);
                System.out.println("Seu saldo atualizado é: " + saldo);
                System.out.println("*****************************");
            } else if (opcaoMenu == 2) {
                System.out.println("Retirar valor");
                System.out.println("Informe o valor que deseja retirar: ");
                double valorRetirada = entrada.nextDouble();
                if (valorRetirada > saldo) {
                    System.out.println("O valor informado ultrapassa o seu saldo!");
                    System.out.println("Informe um valor menor: ");
                    valorRetirada = entrada.nextDouble();
                    saldo -= valorRetirada;
                    System.out.println("Seu novo saldo é: " + saldo);
                } else {
                    saldo -= entrada.nextDouble();
                    System.out.println("Seu novo saldo é: " + saldo);
                }
            } else if (opcaoMenu == 3) {
                System.out.println("Depositar valor");
                System.out.println("Informe o valor que deseja depositar: ");
                double valorDeposito = entrada.nextDouble();
                saldo += valorDeposito;
                System.out.println("Seu novo saldo é: " + saldo);
            } else if (opcaoMenu == 4) {
                System.out.println("Sair");
                System.out.println("Até mais!");
            } else {
                System.out.println("Opção inválida");
                System.out.println("Tente novamente!");
                opcaoMenu = entrada.nextInt();
            }
            }
        }
    }
