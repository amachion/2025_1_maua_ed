import java.util.List;
public class RegistroNotasV2 {
    private NossoHash<String, Double> boletim;

    @SuppressWarnings("unchecked")
    public RegistroNotasV2 () {
        boletim  = new NossoHash<>();
    }
    public void cadastraNotas (String aluno, Double nota) {
        boletim.put(aluno, nota);
    }
    public List<Double> getNotas (String aluno) {
        return boletim.getListaValores(aluno);
    }
    public String notasAluno (String aluno) {
        List<Double> notas = getNotas(aluno);
        if (notas == null || notas.isEmpty())
            return aluno + " nao realizou avaliacoes";
        String s = "";
        for (double nota: notas)
            s += nota + " ";
        return s + "\n";
    }
    public double mediaAluno (String aluno) {
        List<Double> notas = getNotas(aluno);
        if (notas.isEmpty()) return 0.0;
        double soma=0.0;
        for (double nota: notas) {
            soma += nota;
        }
        return soma / notas.size();
    }
    public int size() {
        return boletim.size();
    }
    public void mostraBoletim() {
        boletim.imprime();
    }
    public static void main(String[] args) {
        RegistroNotasV2 registroNotas = new RegistroNotasV2();
        registroNotas.cadastraNotas("Bia", 2.0);
        registroNotas.cadastraNotas("Carlos", 4.0);
        registroNotas.cadastraNotas("Ana", 8.0);
        registroNotas.cadastraNotas("Bia", 7.0);
        registroNotas.cadastraNotas("Carlos", 5.0);
        registroNotas.cadastraNotas("Ana", 6.0);
        registroNotas.cadastraNotas("Denis", 5.0);
        registroNotas.mostraBoletim();
        System.out.println("Notas da Ana:\n" + registroNotas.notasAluno("Ana"));
        System.out.println("Media da Ana:\n" + registroNotas.mediaAluno("Ana"));

        System.out.println("quantidade total de registros: " + registroNotas.size());
    }
}
