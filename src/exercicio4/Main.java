/* Exercício 4 — Herança e Polimorfismo
 * Extensão do sistema de alunos com uma classe AlunoBolsista
 * que herda de Alunos, adiciona o atributo bolsa e sobrescreve
 * o método situacao() para exibir informações adicionais.
 * Praticando extends, super, @Override e polimorfismo em Java.
 */

package exercicio4;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Alunos> listaAlunos = new ArrayList<>();
        AlunoBolsista bolsita1 = new AlunoBolsista("André", 10, 90);
        listaAlunos.add(bolsita1);
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
    public AlunoBolsista(String nome, double nota, double bolsa) {
        super(nome,nota);
        this.bolsa = bolsa;
    }

    @Override
    public String situacao() {
        if (nota >= 6) {
            return "Aprovado"+" - Bolsa: R$ " + bolsa;
        }
        else {
            return "Reprovado";
        }
    }
}