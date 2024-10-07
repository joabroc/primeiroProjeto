import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        int anoDeLancamento = 2024;
        boolean incluidoNoPlano = false;
        String nomeDoFilme = "Top Gun";
        double nota1, nota2, nota3;
        double media;
        String sinopse = "Filme de aventura com galã dos anos 80";

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: " + nomeDoFilme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Liberado para o plano? " + (incluidoNoPlano ? "Sim" : "Não"));

        nota1 = 8.1;
        nota2 = 9.6;
        nota3 = 7.1;

        media = Media3Numeros(nota1, nota2, nota3);

        System.out.println("Nota Média = " + df.format(media));
        System.out.println("Sinopse: " + sinopse);

        int classificacao = (int) Math.round(media);

        System.out.println("Classificação média: " + classificacao);

    }

    public static double Media3Numeros (double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
}