package questao2;

public final class DadosMatricula {
    private final String aluno;
    private final String curso;
    private final String identificacao;
    private final double valorCurso;

    public DadosMatricula(String aluno, String curso, String identificacao, double valorCurso) {
        this.aluno = aluno;
        this.curso = curso;
        this.identificacao = identificacao;
        this.valorCurso = valorCurso;
    }

    public String getAluno() { return aluno; }
    public String getCurso() { return curso; }
    public String getIdentificacao() { return identificacao; }
    public double getValorCurso() { return valorCurso; }
}
