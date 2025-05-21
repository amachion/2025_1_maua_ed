import java.util.List;

public class RegistroNotas {
    
    private NossoHash <String, Double> boletim;
    @SuppressWarnings("uncheked")
    public RegistroNotas () {
        boletim = new NossoHash<>();
    }
    public void cadastraNota (String aluno, Double nota) {
        boletim.put(aluno, nota);
    }
    public List<Double> getNotas (String aluno) {
        return boletim.getListaValores(aluno);
    }
    public String notasAluno (String aluno) {
        List<Double> notas = getNotas(aluno);
        if (notas == null || notas.isEmpty())
            return aluno + " nao realizou avaliacoes\n";
        String s = "";
        for (double nota: notas) {
            s = s + nota + " ";
        }
        return s + "\n";
    }
    public void exibe () {
        boletim.imprime();
    }
    public double mediaAluno (String aluno) {
        List<Double> notas = getNotas(aluno);
        if (notas == null || notas.isEmpty())
            return 0;
        double soma = 0;
        for (double nota: notas) {
            soma+=nota;
        }
        return soma / notas.size();
    }

    public static void main(String[] args) {
        RegistroNotas boletim = new RegistroNotas();
        boletim.cadastraNota("Ana", 8.5);
        boletim.cadastraNota("Ana", 9.0);
        boletim.cadastraNota("Bruno", 7.0);
        boletim.cadastraNota("Bruno", 6.0);
        boletim.cadastraNota("Carlos", 5.0);
        boletim.cadastraNota("Carlos", 9.0);
        boletim.exibe();
        System.out.println("notas do Carlos:\n" + boletim.notasAluno("Carlos"));
        System.out.println("media da Ana: " + boletim.mediaAluno("Ana"));
    }
}