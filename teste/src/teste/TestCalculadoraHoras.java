import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalculadoraHoras {

    public static String calcularHorasTrabalhadas(String entrada, String saida) {
        // Implemente a lógica para calcular as horas trabalhadas aqui
        return "Horas trabalhadas: 8 horas e 30 minutos"; // Substitua pelo cálculo real
    }
    public void testCalcularHorasTrabalhadas() {
        String entrada = "09:00";
        String saida = "17:30";
        String resultadoEsperado = "Horas trabalhadas: 8 horas e 30 minutos";
        String resultadoCalculado = calcularHorasTrabalhadas(entrada, saida);
        assertEquals(resultadoEsperado, resultadoCalculado);
    }

    private void assertEquals(String resultadoEsperado, String resultadoCalculado) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
        String entrada = "09:00";
        String saida = "17:30";
        String resultado = calcularHorasTrabalhadas(entrada, saida);
        System.out.println(resultado);
    }
}
