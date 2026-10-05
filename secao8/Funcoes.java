package secao8;

public class Funcoes {

    public static void main(String[] args) {
        saudacao();
        soma(3, 5);        
        
        
        saudar("Douglas");
        saudar("Cristina");
        saudar("Luis");
        saudar("Zuri");
        saudar("Carolina");

        dobrar(4);
        int numero = 10;
        int numeroDobrado = dobrar(numero);
        System.out.println("O número dobrado é: " + numeroDobrado);
        System.out.println(dobrar(12));
    }
    
    public static void saudacao() {
        System.out.println("Olá,Bem vindo a classe Funções !");
    }

    public static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println(" o resultado da soma é: " + resultado);

    }

    public static void saudar(String nome) {
        System.out.println("Olá, " + nome +" ,Como está?");
    }

    public static int dobrar(int n){
        return n * 2;
    }
    

}
