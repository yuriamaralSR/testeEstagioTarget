import java.util.Scanner;

public class questao02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, a = 0, b = 1, c;
        boolean encontrado = false;

        System.out.println("Informe um número: ");
        num = sc.nextInt();
         

        for(int i = 0; i < num; i++) {
            if (a == num) {
                encontrado = true;
                break;
            }

            c = a + b ;
            a = b;
            b = c;
        }

        if (encontrado == true) {
           
            System.out.printf("O numero %d pertence a sequência de Fibonacci!", num);
        }else {
            System.out.printf("O numero %d não pertence a sequência de Fibonacci!", num);
        } 
             
       sc.close();
    }
}
