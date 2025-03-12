public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello, world");

        int[] v = new int[10];
        int i=0;
        try {
            for (i=0; i<100; i++) {
                v[i] = i;
                System.out.printf ("%d ", v[i]);
            }
        }
        catch (Exception e) {
            System.out.println("\nerro de acesso ao vetor na posicao " + i);
        }
    }
}