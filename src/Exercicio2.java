import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Alunos> listaAlunos = new ArrayList<>();
        Alunos alunoNovo = new Alunos();
        alunoNovo.nota = 6;
        alunoNovo.nome = "André";
        Alunos alunoNovo2 = new Alunos();
        alunoNovo2.nota = 4;
        alunoNovo2.nome = "Ferreira";
        Alunos alunoNovo3 = new Alunos();
        alunoNovo3.nota = 8;
        alunoNovo3.nome = "Lopes";
        for(Alunos aluno : listaAlunos) {
            listaAlunos.add(aluno);
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