import java.util.Scanner;

public class questao05 {

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String palavra;

        System.out.print("Digite uma palavra para inverter: ");
        palavra = sc.nextLine();

        char [] letras = new char[palavra.length()];

        for(int i = 0; i < palavra.length(); i++) {
            letras[i] = palavra.charAt(i);
        }
        System.out.println("");

        System.out.print("Palavra antes de inverter: ");
        for(int i = 0; i < palavra.length(); i++) {
            
            System.out.print(letras[i] = palavra.charAt(i)); 
        }

        System.out.println(" ");

        System.out.print("Palavra invertida: ");
        for(int i = letras.length - 1; i >= 0; i--) {
            System.out.print(letras[i] = palavra.charAt(i)); 
        }
    }

}