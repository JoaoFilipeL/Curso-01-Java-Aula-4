import java.util.Scanner;
public class DesafioContaBancaria {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "João Filipe";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;
        double valorTransferir = 0;
        double saldoFinal = 0;
        double valorDeposito = 0;

        System.out.println("****************************");
        System.out.println("\nCliente: " + nome);
        System.out.println("Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n****************************");

        String menu = """
                \n** Digite sua opção**
                1- Consultar Saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
                
                """;
        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1){
                System.out.println("Seu saldo é de R$" + saldo);
            }else if (opcao == 2){
                System.out.println("Qual o valor que deseja transferir: ");
                valorTransferir = leitura.nextDouble();
                saldoFinal = saldo - valorTransferir;
                System.out.println("Seu saldo é de R$" + saldoFinal);
            }else if (opcao == 3){
                System.out.println("Qual o valor de deposito: ");
                valorDeposito = leitura.nextDouble();
                saldoFinal = saldo + valorDeposito;
                System.out.println("Seu saldo é de R$ "+ saldoFinal);
            }else{
                System.out.println("Opção Invalida!");
            }
        }

    }
}
