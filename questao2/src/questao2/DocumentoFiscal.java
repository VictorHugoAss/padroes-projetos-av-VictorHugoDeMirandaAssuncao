package questao2;

public interface DocumentoFiscal<P extends Pais> {
    double calcularImposto(double valorCurso);
    String descrever(DadosMatricula dados);
}
