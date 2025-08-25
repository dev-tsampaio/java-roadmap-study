public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta = new ContaBancaria("Thales Lopes Sampaio");
        conta.depositar(10000);
        conta.sacar(3200);

        System.out.println("Seu saldo atual é de: " + conta.getSaldo());
    }
}
