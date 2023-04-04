public class questao01 {
    public static void main(String[] args) throws Exception {
        
        int indice = 13, soma = 0, k = 0;

        while(k < indice) {
            k += 1;
            soma += k;
        }

        System.out.println("O valor da variavel soma será igual a: " + soma);
    }
}
