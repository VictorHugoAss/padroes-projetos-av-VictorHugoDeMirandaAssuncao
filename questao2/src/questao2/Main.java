package questao2;

public class Main {
    public static void main(String[] args) {
        Matricula<Brasil> brasil = new Matricula<>(new FabricaBrasil());
        brasil.confirmar(new DadosMatricula(
                "Victor Hugo", "Java", "123.456.789-00", 1000.00));
        System.out.println();
        Matricula<Chile> chile = new Matricula<>(new FabricaChile());
        chile.confirmar(new DadosMatricula(
                "Miranda Assunção", "C++", "12.345.678-9", 100000.00));
    }
}
