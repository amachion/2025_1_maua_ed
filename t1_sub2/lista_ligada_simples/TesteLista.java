public class TesteLista {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        System.out.println("lista criada:\n" + lista);
        try{
            System.out.println(lista.removeInicio() + " foi removido");
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        lista.insereInicio(5);
        lista.insereInicio(8);
        lista.insereInicio(15);
        System.out.println("lista depois das insercoes:\n" + lista);
        try{
            System.out.println(lista.removeInicio() + " foi removido");
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("lista depois da remocao:\n" + lista);
    }
}
