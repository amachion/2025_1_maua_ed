public class ListaDupla {
    private NoDuplo primeiro;
    private NoDuplo ultimo;
    //só o construtor padrão, ou seja, primeiro=null e ultimo=null;

    public boolean listaVazia () {
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
    @Override
    public String toString() {
        if (listaVazia()) return "lista vazia\n";
        NoDuplo runner = primeiro;
        String s = "\\\\ = ";
        while (runner != null) {
            s += runner + " = ";
            runner = runner.getProximo();
        }
        return s + "\\\\\n";
    }
    public int removeInicio () {
        if (listaVazia()) throw new RuntimeException("falha na remocao");
        int aux = primeiro.getInfo();
        if (primeiro == ultimo) {//tem um só, vai esvaziar
            primeiro = null;
            ultimo = null;
        }
        else {
            primeiro = primeiro.getProximo();
            primeiro.setAnterior(null);
        }
        return aux;
    }
    public int removeFim() {
        if (listaVazia()) throw new RuntimeException("falha na remocao");
        int aux = ultimo.getInfo();
        if(primeiro==ultimo) {// tem um só vai esvaziar
            primeiro = null;
            ultimo = null;
        }
        else {
            ultimo = ultimo.getAnterior();
            ultimo.setProximo(null);
        }
        return aux;
    }
}
