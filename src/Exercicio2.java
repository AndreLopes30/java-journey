import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Alunos> listaAlunos = new ArrayList<>();
        Alunos alunoNovo = new Alunos();
        for(Alunos aluno : listaAlunos) {
            listaAlunos.append(aluno);
            System.out.println(aluno.nome + " - " + aluno.situacao());
        }
    }
}

class Alunos {
    String nome;
    double nota;
    public String situacao() {
        if (nota >= 6) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }
}