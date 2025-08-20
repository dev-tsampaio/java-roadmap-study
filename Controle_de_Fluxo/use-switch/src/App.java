import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==========================================");
            System.out.println("              CALCULADORA JAVA");
            System.out.println("==========================================");
            System.out.println(" (+)Soma | (-)Subtracao | (*)Multiplicacao | (/)Divisao");

            // Mova a leitura do primeiro número para dentro do loop
            System.out.print("Digite o primeiro numero: ");
            Double num1 = sc.nextDouble();

            // Mova a leitura do operador para dentro do loop
            System.out.print("Digite o operador: (+)Soma | (-)Subtracao | (*)Multiplicacao | (/)Divisao | (sair): ");
            String operador = sc.next();
            
            // Verifique se o usuário quer sair, antes de pedir o segundo número
            if (operador.equalsIgnoreCase("sair")) {
                System.out.println("Fechando a calculadora...");
                break; // Sai do loop
            }

            System.out.println("Digite o segundo numero: ");
            Double num2 = sc.nextDouble();

            Double resultado = 0.0;
            boolean validoOperacao = true;

            switch (operador) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    // Adicione uma verificação para evitar divisão por zero
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro: Divisao por zero nao permitida.");
                        validoOperacao = false;
                    }
                    break;
                default:
                    System.out.println("Operador invalido!");
                    validoOperacao = false;
                    break;
            }

            if (validoOperacao) {
                System.out.println("Resultado: " + resultado);
                break;
            }
        }
        
        sc.close();
    }
}