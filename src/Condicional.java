public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String mensagem;
        String tipoPlano = "Plus";

        mensagem = anoDeLancamento >= 2022 ? "Lançamento que os clientes estão curtindo" : "Filme retro que " +
                "vale a pena assistir" ;

        System.out.println(mensagem);

        if (incluidoNoPlano && tipoPlano.equalsIgnoreCase("Plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a alocação");
        }

    }
}
