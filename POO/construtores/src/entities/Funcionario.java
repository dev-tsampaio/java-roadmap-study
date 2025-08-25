package entities;

public class Funcionario {
    public String nome;
    public Double salario;

    public Funcionario(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirInfo(){
        System.out.println("Funcionário: " + nome + " | Salário: " + salario);
    }


}
