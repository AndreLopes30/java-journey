/* Exercício 3 — Construtor
 * Evolução do exercício anterior: em vez de atribuir nome e nota
 * linha por linha, a classe Alunos passou a ter um construtor
 * que recebe os valores diretamente na instanciação com new.
 */

package exercicio3;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Alunos> listaAlunos = new ArrayList<>();
        Alunos alunoNovo = new Alunos("André", 6);
        listaAlunos.add(alunoNovo);
        Alunos alunoNovo2 = new Alunos("Ferreira", 4);
        listaAlunos.add(alunoNovo2);
        Alunos alunoNovo3 = new Alunos("Lopes", 8);
        listaAlunos.add(alunoNovo3);
        for(Alunos aluno : listaAlunos) {
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
    public Alunos(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
}

class AlunoBolsista extends Alunos {
    double bolsa;
    super.situacao();
    if(Alunos.nota > 6) {
        return "Aprovado"+" - Bolsa: R$ " + bolsa;
    }
}