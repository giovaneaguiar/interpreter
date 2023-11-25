import java.util.Map;

public interface Comando {
    void executar(Map<String, Integer> contexto);
}