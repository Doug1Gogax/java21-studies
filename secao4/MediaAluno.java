package secao4;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do Aluno:");
    String nome = scanner.nextLine();
        
    System.out.println("Digite a primeira nota:");
    double nota1 = scanner.nextDouble();

    System.out.println("Digite a segunda nota:");
    double nota2 = scanner.nextDouble();

    System.out.println("Digite a terceira nota:");
    double nota3= scanner.nextDouble();

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.println("O nome do alune é:" + nome + ". E sua medio foi:" + media);

    if(media >= 7){
        System.out.println("Aluno aprovado");

    }else{
        System.out.println("Aluno reprovado");
    }

    scanner.close();
        
    }

   



    
}