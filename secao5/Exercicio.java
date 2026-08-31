package secao5;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digiete o preço do produto");

        double preco = scanner.nextDouble();

        if(preco <50){
            System.out.println("Categoria: Barato");
        }else if(preco >= 50 && preco <= 100) {
             System.out.println("Categoria: Medio");
        }else{
            System.out.println("Categoria: Caro");
        }
        

        //Exer2

          System.out.println("Digite o nome de Usuario");
          String usuario = scanner.next();

          System.out.println("Digite a senha do usuario ");
          String senha = scanner.next();

          if(usuario.equals("admin")&& senha.equals("1234")){
            System.out.println("Acesso permitido");
          }else{
            System.out.println("Acesso negado");
          }
          scanner.close();   
    
        
    }
    
}
