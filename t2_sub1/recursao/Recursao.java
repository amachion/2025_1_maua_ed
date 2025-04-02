public class Recursao {
    static long fatorialIterativo (int n) {
        long f = 1;
        // for (int i = 2; i <= n; i++) {
        //     f = f * i;
        // }
        while (n > 1) f *= n--;
        return f;
    }
    static long fatorialRecursivo (int n) {
        if (n<=1) return 1;
        return n * fatorialRecursivo(n-1);
    }
    static long fibonacciRec (int n) {
        if (n <= 1) return 1;
        return fibonacciRec(n-1) + fibonacciRec(n-2);
    }
    static long fibonacciDin(int n) {
        if (n <= 1) return 1;
        long[] v = new long[n+1];
        v[0] = 1;
        v[1] = 1;
        for (int i=2; i<=n; i++) {
            v[i]= v[i-1] + v[i-2];
        }
        return v[n];
    }
    public static void main(String[] args) {
        for (int i=0; i<=20; i++)
            System.out.println("fatorial de " + i + " = " + fatorialIterativo(i));
        for (int i=0; i<=20; i++)
            System.out.println("fatorial de " + i + " = " + fatorialRecursivo(i));
        for (int i=0; i<=50; i++)
            System.out.println("fibonacci em " + i + " = " + fibonacciRec(i));
    }
}