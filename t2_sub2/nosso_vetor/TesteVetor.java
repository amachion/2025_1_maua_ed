public class TesteVetor {
    public static void main(String[] args) {
        NossoVetor v1 = new NossoVetor(5);
        NossoVetor v2 = new NossoVetor();
        int i=0;
        // try {
        //     for (i=0; i<100; i++) {
        //         v1.insere(i);
        //         System.out.println(i);
        //     }
        // }
        // catch (Exception exception) {
        //     System.out.println("erro ao acessar a posicao " + i);
        // }
        while (v1.insere(i++))
            System.out.println(v1);

        while (v2.insere(i++))
            System.out.println(v2);
        
        System.out.println(v1.remove() + " foi removido do v1");
        System.out.println(v1);

        System.out.println(v2.remove() + " foi removido de v2");
        System.out.println(v2);
    }
}
