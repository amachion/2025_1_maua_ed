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
            s += " = \\\\";
        }
        return s + "\n";
    }
    public void insereFim (int info) {
        NoDuplo novo = new NoDuplo(info);
        if (listaVazia()) {
            primeiro = novo;
        }
        else {
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
    public int removeInicio()  {
        if (listaVazia()) throw new RuntimeException("lista vazia, nao ha o que remover");
        int info = primeiro.getInfo();
        if (primeiro == ultimo) {
            primeiro = null;
            ultimo = null;
        }
        else {
            primeiro = primeiro.getProximo();
            primeiro.setAnterior(null);
        }
        return info;
    }
    public int removeFim()  {
        if (listaVazia()) throw new RuntimeException("lista vazia, nao ha o que remover");
        int info = ultimo.getInfo();
        if (primeiro == ultimo) {
            primeiro = null;
            ultimo = null;
        }
        else {
            ultimo = ultimo.getAnterior();
            ultimo.setProximo(null);
        }
        return info;
    }
}
