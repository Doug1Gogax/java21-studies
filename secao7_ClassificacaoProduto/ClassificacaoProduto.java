package secao7_ClassificacaoProduto;

import java.util.Scanner;

public class ClassificacaoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String produto1 = "Tv80Polegadas";
        String produto2 = "Sofá3Lugares";
        String produto3 = "Playstation5";

        double preco = 0;  
        
        System.out.println("Digite o nome do produto: ");

         String nomeProduto = scanner.nextLine(); 

        if(produto1.equalsIgnoreCase(nomeProduto)|| 
        produto2.equalsIgnoreCase(nomeProduto) || 
        produto3.equalsIgnoreCase(nomeProduto)){

            System.out.println("Produto ja existe. Quer atualizar o preço? (sim/não ) ");
            String resposta = scanner.nextLine();

            if(resposta.equalsIgnoreCase("sim")) {
                System.out.println("Digite o novo preço: ");
                preco = scanner.nextDouble();
            }
        } else {
            System.out.println("Produto não encontrado.");
            scanner.close();
            return;
        }

        if(preco < 50) {
            System.out.println("Classificação: barato");
        } else if (preco >= 50 && preco <= 100) {
            System.out.println("Classificação: moderado");
        } else {
            System.out.println("Classificação: caro");
        }

        System.out.println("Produto: " + nomeProduto + " .Preço. " + preco );
        

        scanner.close();
        
    }     
}