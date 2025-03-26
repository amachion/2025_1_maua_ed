public class TesteLista {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        System.out.println("lista foi criada\n" + lista);

        try {
            System.out.println(lista.removeInicio() + " foi removido do inicio");
            System.out.println("lista depois da remocao\n" + lista);
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        lista.insereInicio(5);
        lista.insereInicio(8);
        lista.insereInicio(15);
        lista.insereInicio(20);
        System.out.println("lista depois das insercoes de inicio\n" + lista);

        try {
            System.out.println(lista.removeInicio() + " foi removido do inicio");
            System.out.println("lista depois da remocao\n" + lista);
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        lista.insereFim(12);
        lista.insereFim(30);
        System.out.println("lista depois das insercoes de fim\n" + lista);

        lista.inserePosicao(200, 0);
        System.out.println("inseri o 200 na pos 0\n" + lista);

        lista.inserePosicao(300, 3);
        System.out.println("inseri o 300 na pos 3\n" + lista);

        lista.inserePosicao(400, 10);
        System.out.println("inseri o 400 na pos 10\n" + lista);

        //o ideal é chamar as remoções de elemento usando if-else
        lista.removeElemento(200);
        System.out.println("removi o 200\n" + lista);

        lista.removeElemento(5);
        System.out.println("removi o 5\n" + lista);

        lista.removeElemento(400);
        System.out.println("removi o 400\n" + lista);

        lista.removeElemento(500);
        System.out.println("removi o 500\n" + lista);
    }
}
