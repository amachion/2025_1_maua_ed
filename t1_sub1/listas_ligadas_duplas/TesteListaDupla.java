public class TesteListaDupla {
    public static void main(String[] args) {
        ListaDupla ld = new ListaDupla();
        System.out.println("lista instanciada: " + ld);

        ld.insereInicio(10);
        ld.insereInicio(20);
        ld.insereInicio(30);

        System.out.println("lista depois das insercoes de inicio:" + ld);
    }
}
