import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero:  ");
        Double num1 = sc.nextDouble();

        System.out.print("Digite um segundo numero");
        Double num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println("O primeiro numero: " + num1 + " é maior.");
        }
        else {
            System.out.println("O  segundo numero: " + num2 + " é maior.");
        }
        sc.close();
    }
}
