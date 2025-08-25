Este projeto é uma calculadora simples, desenvolvida em Java, que opera em um loop contínuo permitindo que o usuário execute múltiplas operações matemáticas sem precisar reiniciar o programa. A aplicação demonstra o uso de estruturas de controle de fluxo, como while e switch, para criar uma interação dinâmica e robusta.

Funcionalidades Principais

    Loop Infinito Controlado (while): O coração da aplicação é um loop while (true), que mantém a calculadora em execução. A única forma de sair é através da palavra-chave sair, que aciona a instrução break para finalizar o loop.

    Seleção de Operações (switch): O código utiliza a estrutura switch-case para identificar o operador (+, -, *, /) digitado pelo usuário e executar a operação correspondente. Isso torna o código mais limpo e legível do que uma longa cadeia de if-else if.

    Entrada de Dados (Scanner): A classe Scanner é utilizada para ler os números e o operador que o usuário digita no console.

    Tratamento de Erros:

        Divisão por Zero: O código inclui uma verificação explícita para evitar a divisão por zero, exibindo uma mensagem de erro em vez de causar uma exceção de tempo de execução (ArithmeticException).

        Operador Inválido: Caso o usuário digite um operador que não está previsto nos cases do switch, o bloco default é executado, informando que a operação é inválida.

    Gerenciamento de Recursos: A chamada sc.close() é uma boa prática para fechar o objeto Scanner ao final da execução, liberando os recursos do sistema.

    Saída Elegante: O usuário pode sair do programa a qualquer momento digitando a palavra sair, o que encerra a aplicação de forma limpa e controlada.
