import java.util.Calendar;
import java.util.Scanner;

public class TesteOrdenacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NossoVetor v;
        int t;
        System.out.print("digite o tamanho do vetor, 0 encerra: ");
        t = scanner.nextInt();
        while (t > 0) {
            v = new NossoVetor(t);
            v.preecheVetor();
            //System.out.println("vetor original:\n" + v);
            long ini = Calendar.getInstance().getTimeInMillis();
            v.bubbleSort();
            long fim = Calendar.getInstance().getTimeInMillis();

            System.out.println("bubble demorou " + (fim - ini) + " milissegundos");
            //System.out.println("\nvetor ordenado:\n" + v);

            // System.out.println("agora: " + Calendar.getInstance().getTime());
            // System.out.println("agora em milissegundos: " + Calendar.getInstance().getTimeInMillis());

            System.out.print("digite o novo tamanho, 0 encerra: ");
            t = scanner.nextInt();
        }
        scanner.close();
    }
}
