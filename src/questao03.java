public class questao03 {

    public static void main(String[] args) {
        sequenciaA(5);
        sequenciaB(7);
        sequenciaC(8);
        sequenciaD(5);
        sequenciaE(7);
    }

    public static void sequenciaA(int n) {
        int current = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(current + " ");
            current += 2;
        }
        System.out.println();
    }

    public static void sequenciaB(int n) {
        int current = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(current + " ");
            current *= 2;
        }
        System.out.println();
    }

    public static void sequenciaC(int n) {
        int current = 0;
        for (int i = 0; i < n; i++) {
            current = i * i;
            System.out.print(current + " ");
        }
        System.out.println();
    }

    public static void sequenciaD(int n) {
        int current = 4;
        for (int i = 2; i <= n*2; i+=2) {
            current = i*i;
            System.out.print(current + " ");
        }
        System.out.println();
    }

    public static void sequenciaE(int n) {
        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < n-2; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }

}
