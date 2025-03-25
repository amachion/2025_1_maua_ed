public class TesteNo {
    public static void main(String[] args) {
        No no1, no2;
        no1 = new No(5);
        no2 = new No(8);
        System.out.println("no1: " + no1);
        System.out.println("no2: " + no2);
        no1.setProximo(no2);
        System.out.println("no1 alterado\n" + no1);
    }
}
