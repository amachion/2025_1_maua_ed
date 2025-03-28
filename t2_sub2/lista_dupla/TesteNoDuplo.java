public class TesteNoDuplo {
    public static void main(String[] args) {
        NoDuplo no1 = new NoDuplo(10);
        NoDuplo no2 = new NoDuplo(20);

        System.out.println("no1:\n" + no1);
        System.out.println("no2:\n" + no2);

        no1.setProximo(no2);
        no2.setAnterior(no1);

        no1.getProximo().setInfo(500);
        no2.getAnterior().setInfo(700);

        System.out.println("no1:\n" + no1);
        System.out.println("no2:\n" + no2);
    }
}
