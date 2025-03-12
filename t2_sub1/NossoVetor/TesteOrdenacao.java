import java.util.Date;
import java.util.Scanner;

public class TesteOrdenacao {
    public static void main(String[] args) {
        NossoVetor v;
        Scanner scanner = new Scanner(System.in);
        int t;
        System.out.print ("escolha o tamanho do vetor, 0 encerra: ");
        t = scanner.nextInt();
        while (t > 0) {
            v = new NossoVetor(t);
            v.preencheVetor();
            //System.out.println("vetor original:\n" + v);
            long ini = new Date().getTime();
            v.bubbleSort();
            long fim = new Date().getTime();
            System.out.println("\nbubble demorou " + (fim - ini) + " milissegundos");
            //System.out.println("vetor ordenado pelo buble:\n" + v);
            System.out.print("\nescolha o novo tamanho, 0 encerra: ");
            t = scanner.nextInt();
        }
        scanner.close();
    }
}
