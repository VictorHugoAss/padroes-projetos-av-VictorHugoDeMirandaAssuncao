package questao2;

public interface Pagamento<P extends Pais> {
    String processar(double valorTotal);
}
