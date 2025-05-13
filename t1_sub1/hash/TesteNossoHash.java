public class TesteNossoHash {
    public static void main(String[] args) {
        NossoHash<Integer, String> mapa = new NossoHash<>();
        mapa.put(1234567890, "Joao Goulart");
        mapa.put(1345678901, "Juscelino Kubitschek");
        mapa.put(1456789012, "Emilio Garrastazu Medici");
        mapa.put(1567890123, "Joao Figueiredo");
        mapa.imprime();
        mapa.remove(1345678901);
        mapa.imprime();
        mapa.put(1345678901, "Juscelino Kubitschek");
        mapa.imprime();
        System.out.println(mapa.get(1234567890));
    }
}
