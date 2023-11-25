import java.util.Map;

public class Adicionar implements Comando {
    private String variavel;
    private int valor;

    public Adicionar(String variavel, int valor) {
        this.variavel = variavel;
        this.valor = valor;
    }

    @Override
    public void executar(Map<String, Integer> contexto) {
        int valorAtual = contexto.getOrDefault(variavel, 0);
        contexto.put(variavel, valorAtual + valor);
    }
}