package questao1;

public final class PassagemRodoviaria extends Passagem {
    public PassagemRodoviaria(String passageiro, double tarifa) {
        super(passageiro, tarifa);
    }

    @Override
    public String getModal() { return "Rodoviário"; }

    @Override
    public double calcularTaxaEmbarque() {
        return getTarifa() * 0.03;
    }

    @Override
    public String getDocumentosExigidos() {
        return "Documento de identidade com foto";
    }
}
