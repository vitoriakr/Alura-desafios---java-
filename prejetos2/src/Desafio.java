import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Vitória";
        String tipoConta = "Corrente";
        double saldo = 5000.00;
        int opcao = 0;

        System.out.println("***********");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("tipo de conta: " + tipoConta);
        System.out.println("saldo atual: " + saldo);
        System.out.println("\n*************");
        String menu;
        menu = """
                **Digite sua opção**
                1-Consultar saldo
                2-Tranferir valor
                3-Receber valor
                4-Sair
                """;
        Scanner leitura = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1){
                System.out.println("O saldo atual é: "+ saldo);
            } else if (opcao == 2){
                System.out.println("Qual o valor que deseja transferir: ");
                double valor = leitura.nextDouble();
                if (valor>saldo){
                    System.out.println("não há saldo para essa transferencia");
                }else{
                    saldo -= valor;
                    System.out.println("novo saldo: "+saldo);
                }
            } else if (opcao == 3) {
                System.out.println("valor recebido:");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("novo saldo"+saldo);
            } else if ( opcao != 4) {
                System.out.println("opção invalida");
            }
        }
    }
}
