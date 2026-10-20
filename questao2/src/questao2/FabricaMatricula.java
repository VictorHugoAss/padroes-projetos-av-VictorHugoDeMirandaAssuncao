package questao2;

public interface FabricaMatricula<P extends Pais> {
    DocumentoFiscal<P> criarDocumentoFiscal();
    Pagamento<P> criarPagamento();
    ComprovanteMatricula<P> criarComprovante();
}
