import java.text.DecimalFormat;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        double avaliacao = 0;
        int numeroAvaliacoes = 5;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        for (int i = 0; i < numeroAvaliacoes; i++) {
            System.out.println("Informe sua " + (i + 1) + " avaliação: ");
            avaliacao += teclado.nextDouble();
        }

        avaliacao = calculoMedia(avaliacao, numeroAvaliacoes);
        System.out.println("A média das avaliações é igual a " + df.format(avaliacao));
    }

    public static double calculoMedia(Double somatoria, int divisor) {
        return (somatoria / divisor);
    }
}
