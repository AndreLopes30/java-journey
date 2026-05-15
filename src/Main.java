//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Alunos alunoNovo = new Alunos();
        alunoNovo.nota = 6;
        alunoNovo.nome = "André";
        System.out.println(alunoNovo.nome + " - " + alunoNovo.situacao());
        Alunos alunoNovo2 = new Alunos();
        alunoNovo2.nota = 4;
        alunoNovo2.nome = "Ferreira";
        System.out.println(alunoNovo2.nome + " - " + alunoNovo2.situacao());
        Alunos alunoNovo3 = new Alunos();
        alunoNovo3.nota = 8;
        alunoNovo3.nome = "Lopes";
        System.out.println(alunoNovo3.nome + " - " + alunoNovo3.situacao());
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