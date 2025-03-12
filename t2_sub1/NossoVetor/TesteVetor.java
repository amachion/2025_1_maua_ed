public class TesteVetor {
    public static void main(String[] args) {
        NossoVetor v1 = new NossoVetor();
        NossoVetor v2 = new NossoVetor(5);

        // v1.ocupacao = 10; é atributo privado = encapsulamento
        int i=1;
        while (!v1.estaCheio()) {
            // System.out.println(i);
            v1.insere(i++);
        }
        System.out.println(v1);
        System.out.println();
        while (!v2.estaCheio()) {
            // System.out.println(i);            
            v2.insere(++i);
        }
        System.out.println(v2);

        System.out.println(v1.remove() + " saiu de v1");
        System.out.println("v1:");
        System.out.println(v1);
        System.out.println(v2.remove() + " saiu de v2");
        System.out.println("v2:");
        System.out.println(v2);
    }
}
