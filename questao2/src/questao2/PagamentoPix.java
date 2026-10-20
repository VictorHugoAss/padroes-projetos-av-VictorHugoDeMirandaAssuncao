package questao2;

public final class PagamentoPix implements Pagamento<Brasil> {
    PagamentoPix() { }

    @Override
    public String processar(double valorTotal) {
        return "Pagamento: Pix | Valor processado: R$ "
                + String.format("%.2f", valorTotal);
    }
}
