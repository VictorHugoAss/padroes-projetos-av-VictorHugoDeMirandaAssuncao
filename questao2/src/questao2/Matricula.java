package questao2;

public final class Matricula<P extends Pais> {
    private final DocumentoFiscal<P> documentoFiscal;
    private final Pagamento<P> pagamento;
    private final ComprovanteMatricula<P> comprovante;

    public Matricula(FabricaMatricula<P> fabrica) {
        this.documentoFiscal = fabrica.criarDocumentoFiscal();
        this.pagamento = fabrica.criarPagamento();
        this.comprovante = fabrica.criarComprovante();
    }

    public String confirmar(DadosMatricula dados) {
        double imposto = documentoFiscal.calcularImposto(dados.getValorCurso());
        double valorTotal = dados.getValorCurso() + imposto;
        String relatorio = "Matricula Confirmada"
                + "\n" + documentoFiscal.descrever(dados)
                + "\n" + pagamento.processar(valorTotal)
                + "\n" + comprovante.emitir(dados);
        System.out.println(relatorio);
        return relatorio;
    }
}
