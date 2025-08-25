import java.util.ArrayList;

import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Thales", 26));
        alunos.add(new Aluno("Joao", 19));
        alunos.add(new Aluno("roberto", 32));

        for (Aluno aluno : alunos){
            System.out.println("Aluno: "+ aluno.nome +" - Idade: " + aluno.idade);
        }
    }
}
