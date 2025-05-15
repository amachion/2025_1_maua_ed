public class TesteNossoHash {
    public static void main(String[] args) {
        NossoHash<Integer, String> mapa = new NossoHash<>();
        mapa.put(12345, "Joao Goulart");
        mapa.put(13456, "Juscelino Kubitschek");
        mapa.put(14567, "Emilio Garrastazu Medici");
        mapa.put(15678, "Joao Figueiredo");
        mapa.imprime();
        mapa.remove(13456);
        mapa.imprime();
        mapa.put(13456, "Juscelino Kubitschek");
        mapa.imprime();
        System.out.println(mapa.get(12345));
        mapa.put(45678, "Paulo Maluf");
        mapa.put(76543, "Franco Montoro");
        mapa.put(24680, "Geraldo Alkmin");
        mapa.imprime();
        mapa.remove(15678);
        mapa.imprime();
        mapa.put(15678, "Joao Figueiredo");
        // if (mapa.containsKey(45678)) {
        //     System.out.println("chave encontrada");
        // }
        // else {
        //     System.out.println("chave não encontrada");
        // }
        String resposta = mapa.containsKey(45678);
        if (resposta != null) {
            System.out.println(resposta + " encontrado");
        }
        else {
            System.out.println("chave não encontrada");
        }
        if (mapa.containsValue("Franco Montoro")) {
            System.out.println("Franco Montoro pertence a lista");
        }
        else {
            System.out.println("Franco Montoro nao pertence a lista");
        }
    }
}
