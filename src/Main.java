//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Alunos alunoNovo = new Alunos();
        alunoNovo.nota = 6;
        alunoNovo.nome = "André";
        System.out.println(alunoNovo.nome, alunoNovo.situacao());
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