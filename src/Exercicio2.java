import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<AlunosEx2> listaAlunos = new ArrayList<>();
        AlunosEx2 alunoNovo = new AlunosEx2();
        alunoNovo.nota = 6;
        alunoNovo.nome = "André";
        listaAlunos.add(alunoNovo);
        AlunosEx2 alunoNovo2 = new AlunosEx2();
        alunoNovo2.nota = 4;
        alunoNovo2.nome = "Ferreira";
        listaAlunos.add(alunoNovo2);
        AlunosEx2 alunoNovo3 = new AlunosEx2();
        alunoNovo3.nota = 8;
        alunoNovo3.nome = "Lopes";
        listaAlunos.add(alunoNovo3);
        for(AlunosEx2 aluno : listaAlunos) {
            listaAlunos.add(aluno);
            System.out.println(aluno.nome + " - " + aluno.situacao());
        }
    }
}

class AlunosEx2 {
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