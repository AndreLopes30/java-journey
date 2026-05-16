package exercicio1;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/* Exercício 1 — Classe e Objetos
 * Criação de uma classe Aluno com atributos e método de instância,
 * praticando instanciação de objetos e orientação a objetos básica em Java.
 */

public class Main {
    public static void main(String[] args) {
        Alunos alunoNovo = new Alunos();
        alunoNovo.nota = 6;
        alunoNovo.nome = "André";
        System.out.println(alunoNovo.nome + " - " + alunoNovo.situacao());
        Alunos alunoNovo1 = new Alunos();
        alunoNovo1.nota = 4;
        alunoNovo1.nome = "Ferreira";
        System.out.println(alunoNovo1.nome + " - " + alunoNovo1.situacao());
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