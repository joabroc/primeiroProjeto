import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        String nome = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        double saldoInicial = 2500;
        int operacao = 0;

        System.out.println("");
        System.out.println("*******************************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("");
        System.out.println("Nome:          " + nome);
        System.out.println("Tipo conta:    " + tipoConta);
        System.out.println("Saldo incial:  " + "R$ " + df.format(saldoInicial));
        System.out.println("*******************************************************");

        while (operacao != 4) {
            System.out.println("");
            System.out.println("Operações");
            System.out.println("");
            System.out.println("1 - Consultar o Saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println("");
            System.out.println("O que deseja fazer: ");
            operacao = teclado.nextInt();
            if (operacao == 1) {
                System.out.println("Saldo: R$" + df.format(saldoInicial));
            } else if (operacao == 2) {
                System.out.println("Informe o valor que deseja receber: ");
                saldoInicial = receberValor(saldoInicial, teclado.nextDouble());
                System.out.println("Saldo atualizado: R$" + df.format(saldoInicial));
            } else if (operacao == 3) {
                System.out.println("Informe o valor que deseja trasnferir: ");
                saldoInicial = tranferirValor(saldoInicial, teclado.nextDouble());
                System.out.println("Saldo atualizado: R$" + df.format(saldoInicial));
            } else  if (operacao == 4){
                System.out.println("Até logo!");
            } else {
                System.out.println("Operação inválida!");
            }
        }
    }

    public static double receberValor(double saldoInicial, double valorDaTranferencia) {
        if (valorDaTranferencia >= 0) {
            System.out.println("Tranferência recebida com sucesso!");
            return saldoInicial + valorDaTranferencia;
        } else {
            System.out.println("Não é possivel realizar o recebimento de valor negativo!");
            return saldoInicial;
        }
    }

    public static double tranferirValor(double saldoInicial, double valorDaTranferencia) {
        if (saldoInicial >= valorDaTranferencia) {
            System.out.println("Transferência realizada com sucesso!");
            return saldoInicial - valorDaTranferencia;
        }
        else {
            System.out.println("Voce não tem saldo suficinete para esta transação!");
            return saldoInicial;
        }
    }

}
