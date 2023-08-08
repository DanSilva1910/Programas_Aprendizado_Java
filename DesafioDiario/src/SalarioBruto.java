import java.math.BigDecimal;

public class SalarioBruto {
    private String nomeFuncionario;
    private BigDecimal salarioFuncionarioHora;
    private int horasTrabalhadas;
    private static final double VALOR_HORA_EXTRA = 0.5;

    public SalarioBruto(String nomeFuncionario, double salarioFuncionarioHora, int horasTrabalhadas) {
        this.nomeFuncionario = nomeFuncionario;
        this.salarioFuncionarioHora = BigDecimal.valueOf(salarioFuncionarioHora);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularHorasExtras() {
        double numeroHorasExtra = Math.max(horasTrabalhadas - 40, 0);
        return numeroHorasExtra;
    }

    public BigDecimal calcularHorasExtrasPagas() {
        double numeroHorasExtra = calcularHorasExtras();
        BigDecimal totalHorasExtra = BigDecimal.valueOf(numeroHorasExtra * VALOR_HORA_EXTRA);
        return totalHorasExtra;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public BigDecimal getSalarioFuncionarioHora() {
        return salarioFuncionarioHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public BigDecimal salarioTotal() {
        BigDecimal salario = salarioFuncionarioHora.multiply(BigDecimal.valueOf(horasTrabalhadas));
        BigDecimal salarioExtra = calcularHorasExtrasPagas().multiply(getSalarioFuncionarioHora());
        return salario.add(salarioExtra);
    }
}
