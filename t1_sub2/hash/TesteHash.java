public class TesteHash {
    public static void main(String[] args) {
        NossoHash<String, String> mapa = new NossoHash<>();
        mapa.put ("12345", "aaaaaa");
        mapa.put ("6789", "fghjk");
        mapa.put ("7654", "iuygtf");
        mapa.put ("87654", null);
        mapa.put ("8765", "afghydfd");
        mapa.put ("76767", "eertryrt");
        mapa.put ("255645", "gfytuty");
        mapa.put ("134454", "fgrttyrty");
        mapa.imprime();
        String retorno = mapa.get("8765");
        if (retorno != null) {
            System.out.println(retorno + " e o valor associado aa sua chave");
        }
        else {
            System.out.println("chave nao encontrada");
        }
    }
}
