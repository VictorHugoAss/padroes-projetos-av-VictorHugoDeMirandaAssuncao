package questao2;

public final class FabricaChile implements FabricaMatricula<Chile> {
    @Override
    public DocumentoFiscal<Chile> criarDocumentoFiscal() { return new BoletaChile(); }

    @Override
    public Pagamento<Chile> criarPagamento() { return new PagamentoWebpay(); }

    @Override
    public ComprovanteMatricula<Chile> criarComprovante() { return new ComprovanteRut(); }
}
