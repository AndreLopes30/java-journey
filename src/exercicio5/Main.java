
package exercicio5;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Alunos> listaAlunos = new ArrayList<>();
        AlunoBolsista bolsita1 = new AlunoBolsista(setNome("André"), setNota(10), 90);
        listaAlunos.add(bolsita1);
        Alunos alunoNovo = new Alunos(setNome("André"), setNota(6));
        listaAlunos.add(alunoNovo);
        Alunos alunoNovo2 = new Alunos(setNome("Ferreira"), setNota(4));
        listaAlunos.add(alunoNovo2);
        Alunos alunoNovo3 = new Alunos(setNome("Lopes"), setNota(8));
        listaAlunos.add(alunoNovo3);
        for(Alunos aluno : listaAlunos) {
            System.out.println(aluno.nome + " - " + aluno.situacao());
        }
    }
}

class Alunos {
    private String nome;
    private double nota;
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
    public String getNome() {
        return this.nome;
    }
    public double getNota() {
        return this.nota;
    }
    public String setNome(String novoNome) {
            this.nome = novoNome;
    }
    public double setNota(double novaNota) {
        this.nota = novaNota;
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