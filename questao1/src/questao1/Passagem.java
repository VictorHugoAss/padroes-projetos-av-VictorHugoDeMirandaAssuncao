package questao1;

public abstract class Passagem {
    private final String passageiro;
    private final double tarifa;

    protected Passagem(String passageiro, double tarifa) {
        this.passageiro = passageiro;
        this.tarifa = tarifa;
    }

    public final String getPassageiro() { return passageiro; }
    public final double getTarifa() { return tarifa; }

    public abstract String getModal();
    public abstract double calcularTaxaEmbarque();
    public abstract String getDocumentosExigidos();
}
