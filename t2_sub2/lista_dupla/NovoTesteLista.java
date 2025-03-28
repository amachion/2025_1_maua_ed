import java.util.Random;

public class NovoTesteLista {
    public static void main(String[] args) {
        ListaDupla listaDupla = new ListaDupla();
        Random random = new Random();
        for (int i=1; i <= 100; i++) {
            if (random.nextBoolean()) {//inserir
                if (random.nextBoolean()) {//início
                    listaDupla.insereInicio(random.nextInt(100));
                }
                else {//fim
                    listaDupla.insereFim(random.nextInt(100));
                }
            }
            else {//remover
                try {
                    if (random.nextBoolean()) {//inicio
                        System.out.println(listaDupla.removeInicio() + " saiu do inicio");
                    }
                    else {//fim
                        System.out.println(listaDupla.removeFim() + " saiu do final");
                    }
                }
                catch (RuntimeException rt) {
                    System.out.println(rt.getMessage());
                }
            }
            System.out.println(listaDupla);
        }
    }
}
