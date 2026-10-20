package questao2;

public final class PagamentoWebpay implements Pagamento<Chile> {
    PagamentoWebpay() { }

    @Override
    public String processar(double valorTotal) {
        return "Pagamento: Webpay | Valor processado: CLP "
                + String.format("%.2f", valorTotal);
    }
}
