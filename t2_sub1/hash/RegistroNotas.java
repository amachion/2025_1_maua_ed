import java.util.List;
public class RegistroNotas {

    private NossoHash<String, Double> boletim;

    @SuppressWarnings("unchecked")
    public RegistroNotas() {
        boletim = new NossoHash<>();
    }
    public void cadastraNotas (String aluno, Double nota) {
        boletim.put(aluno, nota);
    }
    public List<Double> getNotasAluno (String aluno) {
        return boletim.getListaValores(aluno);
    }
    public String notasAluno (String aluno) {
        List<Double> notas = getNotasAluno(aluno);
        if (notas == null || notas.isEmpty())
            return "aluno nao realizou avaliacoes";
        String s = "";
        for (double n: notas)
            s += n + " ";
        return s + "\n";
    }
    public double mediaAluno (String aluno) {
        List<Double> notas = getNotasAluno(aluno);
        if (notas == null || notas.isEmpty())
            return 0.0;
        double s = 0;
        for (double n: notas)
            s += n;
        return s / notas.size();
    }
    public void mostraBoletim() {
        boletim.imprime();
    }

    public static void main(String[] args) {
        RegistroNotas registroNotas = new RegistroNotas();
        registroNotas.cadastraNotas("Ana", 4.5);
        registroNotas.cadastraNotas("Bia", 6.7);
        registroNotas.cadastraNotas("Caio", 7.5);
        registroNotas.cadastraNotas("Ana", 8.5);
        registroNotas.cadastraNotas("Bia", 8.3);
        registroNotas.cadastraNotas("Caio", 8.0);
        registroNotas.cadastraNotas("Carlos", 8.5);
        registroNotas.cadastraNotas("Carlos", 8.3);
        
        System.out.println("Notas do Carlos: " + registroNotas.notasAluno("Carlos")); 
        System.out.println("Media do Carlos = " + registroNotas.mediaAluno("Carlos"));

        registroNotas.mostraBoletim();

    }
}
