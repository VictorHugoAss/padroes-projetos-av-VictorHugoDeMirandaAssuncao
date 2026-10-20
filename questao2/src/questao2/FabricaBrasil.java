package questao2;

public final class FabricaBrasil implements FabricaMatricula<Brasil> {
    @Override
    public DocumentoFiscal<Brasil> criarDocumentoFiscal() { return new NfseBrasil(); }

    @Override
    public Pagamento<Brasil> criarPagamento() { return new PagamentoPix(); }

    @Override
    public ComprovanteMatricula<Brasil> criarComprovante() { return new ComprovanteCpf(); }
}
