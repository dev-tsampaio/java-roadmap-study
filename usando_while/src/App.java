import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "sampaioTecnologia2025";
        Integer tentativas = 3;

        System.out.println("# Seja bem vindo à # ");
        System.out.print("# SAMPAIO TECNOLOGIA #");
        System.out.println();

        while (tentativas > 0) {
            System.out.print("Digite a senha para acessar o sistema: ");
            String senhaDigitada = sc.nextLine();

            if (senhaDigitada.equals(senhaCorreta)){
                System.out.println("Você acessou o terminal!");
                break;
            } else {
                tentativas--;
                System.out.println("ERRO: Você digitou a senha incorreta!");
                System.out.println("Você tem (" + tentativas + ") restantes.");
            }

            if (tentativas == 0){
                System.out.println("ERRO: Acesso bloqueado, numero de tentativas esgotado.");
            }

        }

        sc.close();
    }
}
