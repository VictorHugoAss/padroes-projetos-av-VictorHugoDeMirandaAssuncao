package questao1;

public class Main {
    public static void main(String[] args) {
        EmissorPassagem aereo = new EmissorAereo();
        EmissorPassagem rodoviario = new EmissorRodoviario();
        EmissorPassagem ferroviario = new EmissorFerroviario();

        aereo.emitir("Victor", 1000.00);
        System.out.println();
        rodoviario.emitir("Hugo", 200.00);
        System.out.println();
        ferroviario.emitir("Assunção", 300.00);
    }
}
