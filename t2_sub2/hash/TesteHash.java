public class TesteHash {
    public static void main(String[] args) {
        NossoHash<Integer, String> mapa = new NossoHash<>();
        mapa.put(1234, "aaaaaa");
        mapa.put(4567, "bbbbbbb");
        mapa.put(876543, "werty");
        mapa.put(23456, "oiuyg");
        mapa.put(765, "mnbvc");
        mapa.put(23956, "iuy");
        mapa.put(987, "werty");
        mapa.put(34576, "jbvc");

        mapa.imprime();

        String valor = mapa.get(23956);
        if (valor != null) {
            System.out.println("Chave encontrada, valor = " + valor);
        }
        else {
            System.out.println("chave nao encontrada");
        }

        if (mapa.containsKey(4567)) {
            System.out.println("chave encontrada");
        }
        else {
            System.out.println("chave NAO encontrada");
        }
        if (mapa.containsValue("FFFFF")) {
            System.out.println("valor encontrado");
        }
        else {
            System.out.println("valor NAO encontrado");
        }
        System.out.println("tamanho da estrutura: " + mapa.size());
    }
}
