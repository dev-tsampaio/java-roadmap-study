Este código implementa uma classe simples de conta bancária em Java, chamada ContaBancaria. A classe possui os seguintes componentes:

    Atributos:
        titular: uma String que armazena o nome do titular da conta.
        saldo: um double que representa o saldo atual da conta.

    Construtor:
        O construtor ContaBancaria(String titular) inicializa o titular da conta e define o saldo como 0.0.

    Métodos:
        depositar(double valor): adiciona um valor ao saldo da conta.
        sacar(double valor): retira um valor do saldo, se houver saldo suficiente; caso contrário, exibe uma mensagem de "Saldo insuficiente".
        getSaldo(): retorna o saldo atual da conta.
