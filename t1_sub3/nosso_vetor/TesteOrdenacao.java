import java.util.Date;
import java.util.Scanner;
public class TesteOrdenacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t;
        NossoVetor v;
        System.out.print("digite o tamanho do vetor, 0 encerra: ");
        t = scanner.nextInt();
        while (t > 0) {
            v = new NossoVetor(t);
            v.preencheVetor();
            //System.out.println("vetor original\n" + v);
            long ini = new Date().getTime();
            v.bubbleSort();
            long fim = new Date().getTime();
            System.out.println("bubble demorou " + (fim-ini) + " milissegundos");
            
            v.preencheVetor(); 
            ini = new Date().getTime();
            v.selectionsort();
            fim = new Date().getTime();
            System.out.println("selection demorou " + (fim-ini) + " milissegundos");
            
            //System.out.println("\nvetor ordenado\n" + v);
            
            System.out.print("\nescolha o novo tamanho, encerra: ");
            t = scanner.nextInt();
        }
        scanner.close();
    }
}
