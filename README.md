<h1 align="center">Interpreter</h1>

<p>O Interpreter é um padrão comportamental que define uma gramática para uma linguagem e fornece uma interpretação para as sentenças dessa linguagem. 
  Ele permite avaliar expressões na linguagem definida, convertendo-as em uma representação intermediária e interpretando essa representação. 
</p>

##

#### Exemplo 

<p>

O meu exemplo implementa um sistema básico de execução de scripts, onde os scripts consistem em uma sequência de comandos. Cada comando é uma operação 
sobre um contexto de variáveis, representado por um Map<String, Integer>.

- Comando

  Define um contrato para os comandos do script, garantindo que cada comando tenha um método executar que opera sobre um contexto de variáveis.

- Atribuir

  Implementa a interface Comando.
  Representa um comando que atribui um valor a uma variável no contexto.

- Adicionar

  Implementa a interface Comando.
  Representa um comando que adiciona um valor a uma variável existente no contexto.

- Imprimir

  Implementa a interface Comando.
  Representa um comando que imprime o valor de uma variável no contexto.

- ScriptRunnerTest

  Utiliza o framework de teste JUnit 5.
  Cria um contexto de variáveis (Map<String, Integer>) e um StringBuilder para capturar a saída.
  Executa uma sequência de comandos (atribuição, adição, impressão) e verifica se o resultado final é conforme o esperado.
</p>


