import java.util.Date;
import java.util.Scanner;

public class TesteOrdenacao {
    public static void main(String[] args) {
        NossoVetor v;
        Scanner scanner = new Scanner(System.in);
        System.out.print("escolha o tamanho do vetor, 0 encerra: ");
        int t = scanner.nextInt();
        long ini, fim;
        while (t > 0) {
            v = new NossoVetor(t);
            v.preencheVetor();
            //System.out.println("vetor pronto");
            //System.out.println("vetor original:\n" + v);
            ini = new Date().getTime();
            v.bubbleSort();
            fim = new Date().getTime();
            System.out.println("bubble demorou " + (fim - ini) + " milissegundos");
            //System.out.println("vetor ordenado:\n" + v);
            
            v.preencheVetor();
            ini = new Date().getTime();
            v.selectionSort();
            fim = new Date().getTime();
            System.out.println("selection demorou " + (fim - ini) + " milissegundos");
                        
            v.preencheVetor();
            ini = new Date().getTime();
            v.insertionSort();
            fim = new Date().getTime();
            System.out.println("insertion demorou " + (fim - ini) + " milissegundos");
            
            ini = new Date().getTime();
            v.bubbleSort();
            fim = new Date().getTime();
            System.out.println("bubble ordenado demorou " + (fim - ini) + " milissegundos");
            
            ini = new Date().getTime();
            v.selectionSort();
            fim = new Date().getTime();
            System.out.println("selection ordenado demorou " + (fim - ini) + " milissegundos");
                        
            ini = new Date().getTime();
            v.insertionSort();
            fim = new Date().getTime();
            System.out.println("insertion ordenado demorou " + (fim - ini) + " milissegundos");
            
            System.out.print("\nescolha o novo tamanho, 0 encerra: ");
            t = scanner.nextInt();
        }
        scanner.close();
    }
}
