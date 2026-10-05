package secao8;

public class FuncoesB {

    public static void main(String[] args) {

        String r1 = verificarAcesso(19, true, false);

        System.out.println(r1);

        String r2 = verificarAcesso(25, true, false);
        System.out.println(r2);

        System.out.println(obterDiaDaSemana(1));

    }

    public static String verificarAcesso(
            int idade,
            boolean temCarteira,
            boolean temHistoricoNegativo) {

        if (idade >= 18 && !temHistoricoNegativo) {
            return "Acesso permitido: todos os criterios atendidos";
        } else if (idade >= 18 && temCarteira && temHistoricoNegativo) {
            return "Acesso negado: Historico negativo detectado";
        } else {
            return "Acesso negado: criterios não atendidos!";

        }

    }

    public static String obterDiaDaSemana (int dia ) {

        switch (dia) {

            case 1:
                return "Domingo";
            case 2:
                return "Segunda-feira";
            case 3:
                return "Terça-feira";
            case 4:
                return "Quarta-feira";
            case 5:
                return "Quinta-feira";
            case 6:
                return "Sexta-feira";
            case 7:
                return "Sábado";
            default:
                return "Dia inválido";
    }

}

}
