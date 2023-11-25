import java.util.Map;

public class Imprimir implements Comando {
    private String variavel;
    private StringBuilder resultado;

    public Imprimir(String variavel, StringBuilder resultado) {
        this.variavel = variavel;
        this.resultado = resultado;
    }

    @Override
    public void executar(Map<String, Integer> contexto) {
        resultado.append(contexto.getOrDefault(variavel, 0)).append(" ");
    }
}