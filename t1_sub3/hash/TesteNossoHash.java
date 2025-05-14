public class TesteNossoHash {
    public static void main(String[] args) {
        NossoHash<Integer, String> mapa = new NossoHash<>();
        mapa.put(1234567890, "Sao Caetano do Sul");
        mapa.put(1345678901, "Sao Bernardo do Campo");
        mapa.put(1456789012, "Santo Andre");
        System.out.println(mapa.get(1234567890));
        mapa.imprime();
        System.out.println(mapa.get(1234567890));
        mapa.put(345678567, "Maua");
        mapa.put(87654547, "Jau");
        mapa.put(78667575, "Itu");
        mapa.put(754389876, "Cotia");
        mapa.imprime();
        String cidade = mapa.remove(78667575);
        if (cidade != null) {
            System.out.println(cidade + " removida");
        }
        else {
            System.out.println("chave nao encontrada");
        }
        mapa.imprime();
        cidade = mapa.remove(87654547);
        if (cidade != null) {
            System.out.println(cidade + " removida");
        }
        else {
            System.out.println("chave nao encontrada");
        }
        mapa.imprime();
        if (mapa.containsKey(754389876)){
            System.out.println(754389876 + " esta no mapa");
        }
        else {
            System.out.println(754389876 + " nao esta no mapa");
        }
        mapa.imprime();
        if (mapa.containsKey(754389876))
            System.out.println(754389876 + " esta no mapa");
        else 
            System.out.println(754389876 + " nao esta no mapa");
        if (mapa.containsValue("Maua"))
            System.out.println("Maua esta no mapa");
        else
            System.out.println("Maua nao esta no mapa");
    }
}
