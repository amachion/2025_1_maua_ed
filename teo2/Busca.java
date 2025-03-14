import java.util.Random;
import java.util.Scanner;

public class Busca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] v;
        int tamanho;
        System.out.print("escolha o tamanho do vetor, 0 encerra: ");
        tamanho = scanner.nextInt();
        while (tamanho > 0) {
            v = new int[tamanho];
            preencheVetor(v);
            exibeVetor(v);
            System.out.print("\nescolha o novo tamanho, 0 encerra: ");
            tamanho = scanner.nextInt();
        }
        scanner.close();
    }
    static void preencheVetor (int[] v) {
        Random random = new Random();
        for (int i=0; i < v.length; i++) {
            v[i] = random.nextInt(v.length * 10);
        }
    }
    static void exibeVetor (int[] v) {
        System.out.println("\ntamanho = " + v.length);
        for (int i=0; i<v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    static int buscaSimples (int[] v, int x) {
        for (int i=0; i<v.length; i++) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;
    }

}