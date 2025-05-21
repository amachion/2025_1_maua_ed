import java.util.List;
public class RegistroNotas {
    public static void main(String[] args) {
        NossoHash<String, Double> boletim = new NossoHash<>();
        boletim.put("Bia", 2.0);
        boletim.put("Carlos", 4.0);
        boletim.put("Ana", 8.0);
        boletim.put("Bia", 7.0);
        boletim.put("Carlos", 5.0);
        boletim.put("Ana", 6.0);
        boletim.imprime();
        List<Double> notas = boletim.getListaValores("Ana");
        for (double nota: notas) {
            System.out.println(nota);
        }
    }
}
