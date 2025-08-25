package entities;

public class Gerente  extends Funcionario{
    public String setor;

    public Gerente(String nome, Double salario, String setor){
        super(nome, salario);
        this.setor = setor;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Gerente: " + nome + " | Setor: " + setor + " | Salário: " + salario);

    }
}
