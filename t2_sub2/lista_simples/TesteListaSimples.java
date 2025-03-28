public class TesteListaSimples {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        System.out.println("lista foi criada\n" + lista);
        try {
            System.out.println(lista.removeInicio() + " foi removido do inicio");
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        lista.insereInicio(10);
        lista.insereInicio(20);
        lista.insereInicio(30);
        System.out.println("lista depois das insercoes de inicio\n" + lista);

        System.out.println(lista.removeInicio() + " foi removido do inicio");
        System.out.println("lista depois da remocao de inicio\n" + lista);

        lista.insereFim(15);
        lista.insereFim(25);
        lista.insereFim(35);
        System.out.println("lista depois das insercoes de fim\n" + lista);

        try {
            System.out.println(lista.removeFim() + " foi removido do final");
            System.out.println("lista depois da remocao de fim\n" + lista);
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
