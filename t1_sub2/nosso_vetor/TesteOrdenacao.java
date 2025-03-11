import java.util.Calendar;
import java.util.Scanner;
public class TesteOrdenacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NossoVetor v;
        int t;
        System.out.print("escolha o tamanho do vetor, 0 encerra: ");
        t = scanner.nextInt();
        while (t > 0) {
            v = new NossoVetor(t);
            v.preencheVetor();
            //System.out.println("vetor original:\n" + v);
            long ini = Calendar.getInstance().getTimeInMillis();
            //System.out.println(ini);
            v.bubbleSort();
            long fim = Calendar.getInstance().getTimeInMillis();
            //System.out.println(fim);
            System.out.println("bubble demorou " + (fim-ini) + " milissegundos");
            //System.out.println("\nvetor ordenado:\n" + v);
            System.out.print("\nescolha o novo tamanho, 0 encerra: ");
            t = scanner.nextInt();
        }
        scanner.close();
    }
}
