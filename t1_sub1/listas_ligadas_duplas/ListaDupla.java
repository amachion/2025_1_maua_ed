public class ListaDupla {
    private NoDuplo primeiro;
    private NoDuplo ultimo;
    //construtor é o padrão, primeiro e último são null
    public boolean listaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int info) {
        NoDuplo novo = new NoDuplo(info);
        if (listaVazia()) {
            ultimo = novo;
        }
        else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }
    @Override
    public String toString () {
        String s = "";
        if (listaVazia()) {
            s += "esta vazia";
        }
        else {
            s+= "\\\\";
            NoDuplo runner = primeiro;
            while (runner != null) {
                s+= " = " + runner ;
                runner = runner.getProximo();
            }
            s += "= \\\\";
        }
        return s + "\n";
    }
}
