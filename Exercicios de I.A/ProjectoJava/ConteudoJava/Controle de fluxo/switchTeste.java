import java.util.Scanner;

/**
 * Prof :Nzuzi Rodolfo 
 * witch
 * Java oferece switch para controle de fluxo multivalorado
 * 
 */
public class switchTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int e = 0;
System.out.println("Digite um numero");  
    e = sc.nextInt();
       switch (e) {
        case 1:
           System.out.println("isto é dificil");
            break;
            case 2:
              System.out.println("isto esta ficando melhor");
            break;
            case 3:
                System.out.println("meio caminho ai");
            break;
            case 4:
                System.out.println("posso ver a luz");
            break;
            case 5:
                System.out.println("Agora estamos falando!");
            break;
       
        default:
             System.out.println("terminou o dia");
            break;
       }


        
    }
    
}