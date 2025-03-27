import java.util.Random;

public class TesteListaDupla {
    public static void main(String[] args) {
        ListaDupla ld = new ListaDupla();
        // System.out.println("lista instanciada: " + ld);

        // ld.insereInicio(10);
        // ld.insereInicio(20);
        // ld.insereInicio(30);

        // System.out.println("lista depois das insercoes de inicio:\n" + ld);

        // ld.insereFim(15);
        // ld.insereFim(25);
        // ld.insereFim(35);

        // System.out.println("lista depois das insercoes de fim:\n" + ld);

        // System.out.println(ld.removeInicio() + " saiu do inicio");
        // System.out.println(ld.removeFim() + " saiu do final");
        // System.out.println("lista depois das remocoes:\n" + ld);
        Random r = new Random();
        for (int i=1; i<=100; i++) {
            if (r.nextBoolean()) {//insere
                if (r.nextBoolean()) { //no início
                    ld.insereInicio(r.nextInt(100));
                }
                else { //no final
                    ld.insereFim(r.nextInt(100));
                }
            }
            else {//remove
                try {
                    if (r.nextBoolean()) { //no início
                        System.out.println(ld.removeInicio() + " saiu do inicio");
                    }
                    else { // no final
                        System.out.println(ld.removeFim() + " saiu do final");
                    }
                }
                catch (RuntimeException rt) {
                    System.out.println(rt.getMessage());
                }
            }
            System.out.println(ld);
        }
    }
}
