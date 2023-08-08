public class SalarioBrutoTest {
    public static void main(String[] args) {
        SalarioBruto func1 = new SalarioBruto("Danilo", 8.8, 45);

        System.out.printf(
                "\nNome: %s\nSalario Hora: %.2f\nHoras Trabalhadas: %d\nHoras Extras: %.2f\nSalario Total: %.2f\n",
                func1.getNomeFuncionario(), func1.getSalarioFuncionarioHora(), func1.getHorasTrabalhadas(),
                func1.calcularHorasExtras(), func1.salarioTotal());

        SalarioBruto func2 = new SalarioBruto("Daniel", 15, 40);

        System.out.printf(
                "\nNome: %s\nSalario Hora: %.2f\nHoras Trabalhadas: %d\nHoras Extras: %.2f\nSalario Total: %.2f\n",
                func2.getNomeFuncionario(), func2.getSalarioFuncionarioHora(), func2.getHorasTrabalhadas(),
                func2.calcularHorasExtras(), func2.salarioTotal());

        SalarioBruto func3 = new SalarioBruto("Daniel", 27.3, 40);

        System.out.printf(
                "\nNome: %s\nSalario Hora: %.2f\nHoras Trabalhadas: %d\nHoras Extras: %.2f\nSalario Total: %.2f\n",
                func3.getNomeFuncionario(), func3.getSalarioFuncionarioHora(), func3.getHorasTrabalhadas(),
                func3.calcularHorasExtras(), func3.salarioTotal());
    }

}
