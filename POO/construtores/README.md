# Exemplo de Herança em Java


Este repositório contém um exemplo simples de herança em Java, demonstrando como uma classe pode herdar propriedades e métodos de outra classe.


## Descrição do Programa


O programa consiste em duas classes principais: `Funcionario` e `Gerente`. A classe `Gerente` estende a classe `Funcionario`, permitindo que um gerente tenha todas as características de um funcionário, além de atributos e métodos adicionais.


### Classes


1. **Funcionario**

   - Atributos:

     - `nome`: Nome do funcionário.

     - `salario`: Salário do funcionário.

   - Métodos:

     - `exibirInfo()`: Exibe as informações do funcionário.


2. **Gerente**

   - Atributos:

     - `setor`: Setor em que o gerente trabalha.

   - Métodos:

     - `exibirInfo()`: Sobrescreve o método da classe `Funcionario` para incluir informações sobre o setor.