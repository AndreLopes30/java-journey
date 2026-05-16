/* Exercício 2 — ArrayList e For-Each
 * Evolução do exercício anterior: em vez de variáveis soltas,
 * os objetos Aluno são armazenados em uma lista e percorridos
 * com for-each, praticando coleções e iteração em Java.
 */

package exercicio2;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Alunos> listaAlunos = new ArrayList<>();
        Alunos alunoNovo = new Alunos();
        alunoNovo.nota = 6;
        alunoNovo.nome = "André";
        listaAlunos.add(alunoNovo);
        Alunos alunoNovo2 = new Alunos();
        alunoNovo2.nota = 4;
        alunoNovo2.nome = "Ferreira";
        listaAlunos.add(alunoNovo2);
        Alunos alunoNovo3 = new Alunos();
        alunoNovo3.nota = 8;
        alunoNovo3.nome = "Lopes";
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
}