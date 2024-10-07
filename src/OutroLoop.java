import java.text.DecimalFormat;
import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        double avaliacao = 0;
        double nota;
        int continua = 1;
        int numDeNotas = 0;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("### BEM VINDO AO CALCULADOR DE MEDIAS! ###");

        while (continua == 1) {
            numDeNotas += 1;
            System.out.println("informe sua " + numDeNotas + " nota:");
            nota = teclado.nextDouble();
            System.out.println(numDeNotas + " nota armezada com o valor de " + df.format(nota));
            avaliacao += nota;
            System.out.println("O que gostaria de fazer agora?");
            System.out.println("1 - Lançar outra nota");
            System.out.println("2 - Calcular a média");
            continua = teclado.nextInt();
        }

        avaliacao = avaliacao / numDeNotas;

        System.out.println("A média de notas é igual a " + df.format(avaliacao));
    }
}
