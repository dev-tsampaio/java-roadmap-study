import entities.Funcionario;
import entities.Gerente;

public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario("Thales", 2000.0);
        Gerente g1 = new Gerente("Carlos", 5500.0, "TI");

        f1.exibirInfo();
        g1.exibirInfo();
    }
}
