package questao2;

public final class BoletaChile implements DocumentoFiscal<Chile> {
    BoletaChile() { }

    @Override
    public double calcularImposto(double valorCurso) {
        return valorCurso * 0.19;
    }

    @Override
    public String descrever(DadosMatricula dados) {
        double imposto = calcularImposto(dados.getValorCurso());
        double total = dados.getValorCurso() + imposto;
        return "Documento fiscal: Boleta eletronica"
                + " | Valor do curso: CLP " + String.format("%.2f", dados.getValorCurso())
                + " | IVA (19%): CLP " + String.format("%.2f", imposto)
                + " | Total: CLP " + String.format("%.2f", total);
    }
}
