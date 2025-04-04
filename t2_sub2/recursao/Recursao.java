public class Recursao {
    //entrada: int n; saída: fatorial de n
    //iterativo
    static long fatorialIterativo (int n) {
        long f = 1;
        // for (int i=2; i<=n; i++)
        //     f = f * i;
        while (n > 1)
            f *= n--;
        // for ( ; n>1; f *= n--); 
        return f;
    }
    static long fatorialRecursivo (int n) {
        if (n <= 1) return 1;
        return n * fatorialRecursivo(n-1);
    }
    static long fibonacciRec (int n) {
        if (n <= 1) return 1;
        return fibonacciRec(n-1) + fibonacciRec(n-2);
    }
    static long[] fibonacciDin (int n) {
        long[] fibonacci = new long[n+1];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i=2; i<=n; i++)
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        return fibonacci;
    }
    static int potenciaRec (int k, int n) {
        if (n == 0) return 1;
        if (n == 1) return k;
        return k * potenciaRec(k, n-1);   
    }
    static int multiplicaRec (int n1, int n2) {
        if (n1==0 || n2==0) return 0;
        if (n1==1) return n2; //esta linha pode ser suprimida
        return n2 + multiplicaRec(n1-1, n2);
    }
    static void exibe1aNv1 (int n) {//recursão de cauda
        System.out.print(n + " ");
        if (n > 0) exibe1aNv1(n-1);//a última instrução é uma chamada recursiva
    }
    static void exibe1aNv2 (int n) {
        if (n>0) exibe1aNv2(n-1);
        System.out.print(n + " ");
    }
    static void exibe1aNv3 (int i, int n) {
        System.out.print(i + " ");
        if (i < n) exibe1aNv3(i+1, n);
    }
    static void exibe1aNv4 (int i, int n) {
        if (i < n) exibe1aNv4(i+1, n);
        System.out.print(i + " ");
    }
    public static void main(String[] args) {
        for (int i=0; i<=20; i++)
            System.out.println("fatorial de " + i + " = " + fatorialIterativo(i));
        for (int i=0; i<=20; i++)
            System.out.println("fatorial de " + i + " = " + fatorialRecursivo(i));
        for (int i=0; i<=20; i++)
            System.out.println("fibonacci em " + i + " = " + fibonacciRec(i));

        long[] fibonacci = fibonacciDin(50);
        for (int i=0; i<=50; i++) 
            System.out.println("fibonacci em " + i + " = " + fibonacci[i]);
        System.out.println();
        System.out.println("3 elevado a 4 = " + potenciaRec(3, 4));
        System.out.println("3 x 4 = " + multiplicaRec(3, 4));
        System.out.println("\nexibe1aNv1");
        exibe1aNv1(4);
        System.out.println("\nexibe1aNv2");
        exibe1aNv2(4);
        System.out.println("\nexibe1aNv3");
        exibe1aNv3(0, 4);
        System.out.println("\nexibe1aNv4");
        exibe1aNv4(0, 4);
    }
    
}