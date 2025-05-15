public class TesteHash {
    public static void main(String[] args) {
        NossoHash <String, String> mapa = new NossoHash<>();
        mapa.put("11111111111", "Jorge Aragao");
        mapa.put("22222222222", "Ana Maria Braga");
        mapa.put("33333333333", "Joao Santana");
        mapa.put("44444444444", "Tiago Luz");
        mapa.put("11111111112", "Jorge Cidade");
        mapa.put("22222222223", "Ana Maria Oliveira");
        mapa.put("33333333334", "Joao Santos");
        mapa.put("44444444445", "Tiago Silva");
        mapa.put("23222222223", "Ana Oliveira");
        mapa.put("33343338334", "Carlos Santos");
        mapa.put("44444544445", "Roberto Silva");
        mapa.imprime();
        System.out.println(mapa.get("33333333333"));
    }
}
