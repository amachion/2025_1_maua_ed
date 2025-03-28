public class TesteListaDupla {
    public static void main(String[] args) {
        ListaDupla listaDupla = new ListaDupla();
        System.out.println("lista instanciada\n" + listaDupla);

        listaDupla.insereInicio(10);
        listaDupla.insereInicio(20);
        listaDupla.insereInicio(30);
        System.out.println("lista depois das insercoes de inicio\n" + listaDupla);

        listaDupla.insereFim(15);
        listaDupla.insereFim(25);
        listaDupla.insereFim(35);
        System.out.println("lista depois das insercoes de fim\n" + listaDupla);

        System.out.println(listaDupla.removeInicio() + " foi removido do inicio da lista");
        System.out.println(listaDupla);
        System.out.println(listaDupla.removeFim() + " foi removido do fim");
        System.out.println(listaDupla);
    }
}
