package questao2;

public final class ComprovanteCpf implements ComprovanteMatricula<Brasil> {
    ComprovanteCpf() { }

    @Override
    public String emitir(DadosMatricula dados) {
        return "Comprovante de matricula | Aluno: " + dados.getAluno()
                + " | Curso: " + dados.getCurso()
                + " | CPF: " + dados.getIdentificacao();
    }
}
