package secao5;

public class Switch {

    public static void main(String[] args) {
        int diaDaSemana = 1;

        switch (diaDaSemana) {
             
            case 1:
                System.out.println("DOMINGO");                
                break;        
            case 2: 
                System.out.println("SEGUNDA-FEIRA");
                break;
            case 3:
                System.out.println("TERÇA-FEIRA");
                break;
        }

        //default 

        int n = 10;
        
        switch (n) {
            case 1:
                System.out.println("È 1");                
                break;
            case 2:
                System.out.println("È 2");
            default:
                System.out.println("Numero não encontrado");
                break;
        }
        


        
    }
    
}
