import java.util.Date;
import java.util.Scanner;

public class TesteOrdenacao {
    public static void main(String[] args) {
        NossoVetor v;
        Scanner scanner = new Scanner(System.in);
        int t;
        long ini;
        long fim;
        System.out.print ("escolha o tamanho do vetor, 0 encerra: ");
        t = scanner.nextInt();
        while (t > 0) {
            v = new NossoVetor(t);
            // v.preencheVetor();
            // System.out.println("vetor original:\n" + v);
            // ini = new Date().getTime();
            // v.bubbleSort();
            // fim = new Date().getTime();
            // System.out.println("\nbubble demorou " + (fim - ini) + " milissegundos");
            // System.out.println("vetor ordenado pelo bubble:\n" + v);

            v.preencheVetor();
            //System.out.println("\noutro vetor original\n" + v);
            ini = new Date().getTime();
            v.quickSort(0, v.getTamanho()-1);
            fim = new Date().getTime();
            System.out.println("\nquick demorou " + (fim - ini) + " milissegundos");
            //System.out.println("\nvetor ordenado pelo quick:\n" + v);

            // ini = new Date().getTime();
            // v.quickSort(0, v.getTamanho()-1);
            // fim = new Date().getTime();
            // System.out.println("\nquick ordenado demorou " + (fim - ini) + " milissegundos");
            
            System.out.print("\nescolha o novo tamanho, 0 encerra: ");
            t = scanner.nextInt();
        }
        scanner.close();
    }
}
