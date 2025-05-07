import java.util.Scanner;
public class TestePessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.next();
        int id = scanner.nextInt();
        Pessoa p = new Pessoa(id, nome);
        //scanner.nextLine(); //consumindo o <enter> da leitura anterior
        System.out.println(p);
        scanner.close();
    }
}
