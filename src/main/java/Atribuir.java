import java.util.Map;

public class Atribuir implements Comando {
    private String variavel;
    private int valor;

    public Atribuir(String variavel, int valor) {
        this.variavel = variavel;
        this.valor = valor;
    }

    @Override
    public void executar(Map<String, Integer> contexto) {
        contexto.put(variavel, valor);
    }
}