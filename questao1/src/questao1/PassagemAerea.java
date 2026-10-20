package questao1;

public final class PassagemAerea extends Passagem {
    public PassagemAerea(String passageiro, double tarifa) {
        super(passageiro, tarifa);
    }

    @Override
    public String getModal() { return "Aéreo"; }

    @Override
    public double calcularTaxaEmbarque() {
        return getTarifa() * 0.08;
    }

    @Override
    public String getDocumentosExigidos() {
        return "Documento de identidade com foto, bilhete eletrônico";
    }
}
