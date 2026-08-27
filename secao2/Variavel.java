package secao2;

public class Variavel {
    public static void main(String[] args) {
        String firstname = "Douglas";
        String lastName = " Estevão";
        int idade = 33; 
        System.out.println(firstname + lastName );
        System.out.println(idade + " anos de idade: ");


        //type casting

        int numero2 = 42; 

        long numeroLong = numero2;

        double numeroDouble = numero2;

        System.out.println(numeroLong);

        System.out.println(numeroDouble);

        //explicito (narrowing)

        double valorDouble = 9.78;

        int valorInt = (int) valorDouble;

        System.out.println(valorInt);

        // casting de char para int
        char letra3 ='A';

        int codigoAscii = (int) letra3;

        System.out.println(codigoAscii);


        //constante
        final int DIAS_DA_SEMANA = 7;

        System.out.println(DIAS_DA_SEMANA);


        
    }
    
}
