public class Fatorial {
    static long fatorial(int n) {
        if (n <= 1) return 1;
        long f = 1;
        for (int i = 2; i <= n; f *= i++);
        return f;
    }
    public static void main(String[] args) {
        for (int i=0; i<50; i++)
            System.out.println("fatorial de " + i + " = " + fatorial(i));
    }
}
