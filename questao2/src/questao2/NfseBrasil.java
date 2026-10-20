package questao2;

public final class NfseBrasil implements DocumentoFiscal<Brasil> {
    NfseBrasil() { }

    @Override
    public double calcularImposto(double valorCurso) {
        return valorCurso * 0.05;
    }

    @Override
    public String descrever(DadosMatricula dados) {
        double imposto = calcularImposto(dados.getValorCurso());
        double total = dados.getValorCurso() + imposto;
        return "Documento fiscal: NFS-e"
                + " | Valor do curso: R$ " + String.format("%.2f", dados.getValorCurso())
                + " | ISS (5%): R$ " + String.format("%.2f", imposto)
                + " | Total: R$ " + String.format("%.2f", total);
    }
}
