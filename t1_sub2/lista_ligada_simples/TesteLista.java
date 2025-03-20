public class TesteLista {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        System.out.println("lista criada:\n" + lista);
        try{
            System.out.println(lista.removeInicio() + " foi removido do inicio");
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        lista.insereInicio(5);
        lista.insereInicio(8);
        lista.insereInicio(15);
        System.out.println("lista depois das insercoes de inicio:\n" + lista);
        try{
            System.out.println(lista.removeInicio() + " foi removido do inicio");
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("lista depois da remocao de inicio:\n" + lista);

        lista.insereFim(100);
        lista.insereFim(200);
        System.out.println("lista depois das insercoes de fim\n" + lista);
    }
}
