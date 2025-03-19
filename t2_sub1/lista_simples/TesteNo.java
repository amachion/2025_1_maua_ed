public class TesteNo {
    public static void main(String[] args) {
        No no1 = new No(3);
        No no2 = new No(4);

        System.out.println("no1 criado:\n" + no1);
        System.out.println("no2 criado:\n" + no2);

        no1.setProximo(no2);
        System.out.println("no1 alterado:\n" + no1);

    }
}
