public class TesteHash {
    public static void main(String[] args) {
        NossoHash<Integer, String> mapa = new NossoHash<>();
        mapa.put(new Integer("1234"), "aaaaaa");
        mapa.put(new Integer("4567"), "bbbbbbb");
        mapa.put(new Integer("876543"), "werty");
        mapa.put(new Integer("23456"), "oiuyg");
        mapa.put(new Integer("765"), "mnbvc");
        mapa.put(new Integer("23956"), "iuy");
        mapa.put(new Integer("0987"), "werty");
        mapa.put(new Integer("34576"), "jbvc");
        mapa.imprime();
    }
}
