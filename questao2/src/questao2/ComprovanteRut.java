package questao2;

public final class ComprovanteRut implements ComprovanteMatricula<Chile> {
    ComprovanteRut() { }

    @Override
    public String emitir(DadosMatricula dados) {
        return "Comprovante de matrícula | Aluno: " + dados.getAluno()
                + " | Curso: " + dados.getCurso()
                + " | RUT: " + dados.getIdentificacao();
    }
}
