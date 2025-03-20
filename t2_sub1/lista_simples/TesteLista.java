public class TesteLista {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        System.out.println("lista criada\n" + lista);
        try {
            System.out.println(lista.removeInicio() + " saiu do inicio");
            System.out.println("lista depois da remocao vazia\n" + lista);
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        lista.insereInicio(5);
        lista.insereInicio(8);
        lista.insereInicio(7);
        lista.insereInicio(12);
        System.out.println("lista depois das insercoes de inicio\n" + lista);

        try {
            System.out.println(lista.removeInicio() + " foi removido do inicio");
            System.out.println("lista depois da remocao de inicio\n" + lista);
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        lista.insereFim(10);
        lista.insereFim(20);
        lista.insereFim(30);
        System.out.println("lista depois das insercoes de fim\n" + lista);

        try {
            System.out.println(lista.removeFim() + " foi removido do fim da lista");
            System.out.println("lista depois da remocao de fim\n" + lista);
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
