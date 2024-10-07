import java.text.DecimalFormat;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        String filmeFavorito;
        int anoDeLancamento;
        float avaliacao;
        int avaliacaoInteiro;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Digite seu filme favorito: ");
        filmeFavorito = teclado.nextLine();
        System.out.println("Agora me informe o ano de lançamento desse filme: ");
        anoDeLancamento = teclado.nextInt();
        System.out.println("Agora me informe qual a sua avaliação do filme (Nota de 0 a 10): ");
        avaliacao = teclado.nextFloat();
        avaliacaoInteiro = Math.round(avaliacao);
        System.out.println("Seu filme favoritoi é " + filmeFavorito + ", com ano de " +
                "lançamento em " + anoDeLancamento + ".");
        System.out.println("Sua nota de avaliação dele foi " + df.format(avaliacao));
        System.out.println("Sua avaliação arredondada é de " + avaliacaoInteiro);

    }
}
