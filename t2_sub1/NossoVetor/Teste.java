import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        int i;
        int[] v;
        Scanner scanner = new Scanner(System.in); 
        i = scanner.nextInt();
        v = new int[i];
        for (int j=0; j<i; j++) 
            System.out.println(v[j]);
        scanner.close();
    }
}
