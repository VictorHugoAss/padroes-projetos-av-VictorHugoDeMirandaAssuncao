package questao1;

public final class PassagemFerroviaria extends Passagem {
    public PassagemFerroviaria(String passageiro, double tarifa) {
        super(passageiro, tarifa);
    }

    @Override
    public String getModal() { return "Ferroviário"; }

    @Override
    public double calcularTaxaEmbarque() {
        return getTarifa() * 0.05;
    }

    @Override
    public String getDocumentosExigidos() {
        return "Documento de identidade com foto, Comprovante de reserva";
    }
}
