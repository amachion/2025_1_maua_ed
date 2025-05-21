public class TesteHash {
    public static void main(String[] args) {
        NossoHash <String, String> mapa = new NossoHash<>();
        //System.out.println("Jorge Aragao".hashCode());
        mapa.put("11111111111", "Jorge Aragao");
        //System.out.println("Ana Maria Braga".hashCode());
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
        System.out.println("estrutura do mapa");
        mapa.imprime();
        System.out.println("tamanho do mapa: " + mapa.size());
        System.out.println("valor associado a chave 33333333333: " + mapa.get("33333333333"));
        if (mapa.containsKey("33333333334")) 
            System.out.println("chave 33333333334 encontrada no mapa");
        else 
            System.out.println("chave 33333333334 nao encontrada no mapa");
        if (mapa.containsValue("Carlos Santos"))
            System.out.println("Carlos Santos encontrado no mapa");
        else 
            System.out.println("Carlos Santos nao encontrado no mapa");
    }
}
