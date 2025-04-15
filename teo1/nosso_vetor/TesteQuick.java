import java.util.Date;
import java.util.Scanner;

public class TesteQuick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NossoVetor v;
        long ini, fim;
        System.out.println("digite o tamanho, 0 encerra");
        int t = sc.nextInt();
        while (t > 0) {
            v = new NossoVetor(t);
            // v.preencheVetor();
            // ini = new Date().getTime();
            // v.insertionSort();
            // fim = new Date().getTime();
            // System.out.println(v);
            // System.out.println("insertion para tamanho " + t + ", tempo = " + (fim-ini));
            v.preencheVetor();
            ini = new Date().getTime();
            v.quickSort(0, t-1);
            fim = new Date().getTime();
            //System.out.println(v);
            System.out.println("quick para tamanho " + t + ", tempo = " + (fim-ini));
            ini = new Date().getTime();
            v.quickSort(0, t-1);
            fim = new Date().getTime();
            //System.out.println(v);
            System.out.println("quick ordenado para tamanho " + t + ", tempo = " + (fim-ini));
            System.out.println("\ndigite o tamanho, 0 encerra");
            t = sc.nextInt();
        }
        sc.close();
    }
}
