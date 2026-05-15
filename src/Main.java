//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        new Alunos(nome="André", nota=6);
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