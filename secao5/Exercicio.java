package secao5;
import java.util.Scanner;

public class Exercicio {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digiete o preço do produto");

    double preco = scanner.nextDouble();

    if (preco < 50) {
      System.out.println("Categoria: Barato");
    } else if (preco >= 50 && preco <= 100) {
      System.out.println("Categoria: Medio");
    } else {
      System.out.println("Categoria: Caro");
    }

    // Exer2
    System.out.println("Digite o nome de Usuario");
    String usuario = scanner.next();

    System.out.println("Digite a senha do usuario ");
    String senha = scanner.next();

    if (usuario.equals("admin") && senha.equals("1234")) {
      System.out.println("Acesso permitido");
    } else {
      System.out.println("Acesso negado");
    }

    // exercicio3
    System.out.println("Digite um numero:");
    int numero = scanner.nextInt();

    String resultado = "";

    if (numero % 2 == 0) {
      resultado = "par";
    } else {
      resultado = "impar";
    }

    System.out.println("O numero é: " + resultado);

    // exercicio4
    System.out.println("Insira um numero de 1 a 7 (referente ao dia da semana):");

    int dia = scanner.nextInt();

    switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    case 3:
        System.out.println("Terça-feira");
        break;
    case 4:
        System.out.println("Quarta-feira");
        break;
    case 5:
        System.out.println("Quinta-feira");
        break;
    case 6:
        System.out.println("Sexta-feira");
        break;
    case 7:
        System.out.println("Sábado");
        break;
    default:
        System.out.println("Número inválido. Por favor, insira um número de 1 a 7.");
    }

    // exercicio5
    System.out.println("Insira um numero:");

    int n = scanner.nextInt();

    if (n >= 10 && n <= 20) {
      System.out.println("Dentro do intervalo");
    } else {
      System.out.println("Fora do intervalo");
    }

    // exercicio6
    System.out.println("Insira uma letra:");

    String letra = scanner.next();

    switch (letra) {
      case "a":
      case "e":
      case "i":
      case "o":
      case "u":
        System.out.println("Vogal");
        break;

      default:
       break;
    }

    scanner.close();
  }
}
    

