Este projeto é um exemplo prático de como utilizar a estrutura condicional if-else em Java para tomar decisões com base em valores de entrada. O programa solicita dois números ao usuário e, em seguida, compara-os para determinar qual deles é o maior.

Funcionalidades

    Entrada de Dados: O programa utiliza a classe Scanner para ler dois números decimais (do tipo Double) digitados pelo usuário no console.

    Comparação Condicional (if-else):

        A condição if (num1 > num2) verifica se o primeiro número (num1) é maior que o segundo (num2).

        Se a condição for verdadeira, o bloco de código dentro do if é executado, exibindo uma mensagem informando que o primeiro número é o maior.

        Se a condição for falsa (ou seja, num1 não é maior que num2), o bloco de código dentro do else é executado, exibindo uma mensagem informando que o segundo número é o maior.

    Tratamento de Localidade: A linha Locale.setDefault(Locale.US); é usada para garantir que a leitura de números decimais funcione corretamente, independentemente da configuração de idioma do sistema do usuário, utilizando o ponto (.) como separador decimal.

    Gerenciamento de Recursos: A chamada sc.close(); é uma boa prática para fechar o objeto Scanner e liberar os recursos do sistema, evitando possíveis vazamentos de memória.
