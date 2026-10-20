package questao1;

public abstract class EmissorPassagem {
    protected abstract Passagem criarPassagem(String passageiro, double tarifa);

    public final String emitir(String passageiro, double tarifa) {
        Passagem passagem = criarPassagem(passageiro, tarifa);
        double taxa = passagem.calcularTaxaEmbarque();
        String resumo = "Modal: " + passagem.getModal()
                + "\nPassageiro: " + passagem.getPassageiro()
                + "\nTaxa de embarque: R$ " + String.format("%.2f", taxa).replace('.', ',')
                + "\nDocumentos exigidos: " + passagem.getDocumentosExigidos();
        System.out.println(resumo);
        return resumo;
    }
}
