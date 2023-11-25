import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScriptRunnerTest {

    @Test
    void testExecutarScript() {
        Map<String, Integer> contexto = new HashMap<>();
        StringBuilder resultado = new StringBuilder();

        Comando comando1 = new Atribuir("x", 5);
        Comando comando2 = new Adicionar("x", 3);
        Comando comando3 = new Imprimir("x", resultado);

        comando1.executar(contexto);
        comando2.executar(contexto);
        comando3.executar(contexto);

        String resultadoFinal = resultado.toString().trim();
        assertEquals("8", resultadoFinal);
    }
}