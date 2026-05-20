
package exercicio7;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Alunos> listaAlunos = new ArrayList<>();
        try {
            AlunoBolsista bolsita1 = new AlunoBolsista("André", 10, 90);
            listaAlunos.add(bolsita1);
            Alunos alunoNovo = new Alunos("André", 6);
            listaAlunos.add(alunoNovo);
            Alunos alunoNovo2 = new Alunos("Ferreira", 4);
            listaAlunos.add(alunoNovo2);
            Alunos alunoNovo3 = new Alunos("Lopes", 15);
            listaAlunos.add(alunoNovo3);
            for (Alunos aluno : listaAlunos) {
                System.out.println(aluno.gerarRelatorio());
            }
        }
        catch(IllegalArgumentException) {
            System.out.println("Nota inválida: deve ser entre 0 e 10");
        }
    }
}

class Alunos implements Relatorio {
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
        if(nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota inválida: deve ser entre 0 e 10");
        };
    }
    public String getNome() {
        return this.nome;
    }
    public double getNota() {
        return this.nota;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    public void setNota(double novaNota) {
        this.nota = novaNota;
    }

    @Override
    public String gerarRelatorio() {
        return "Aluno:" + getNome() + "| Nota:" + getNota() + "| Situação:" + situacao() ;
    }

}

class AlunoBolsista extends Alunos implements Relatorio {
    double bolsa;
    public AlunoBolsista(String nome, double nota, double bolsa) {
        super(nome,nota);
        this.bolsa = bolsa;
    }

    @Override
    public String situacao() {
        if (getNota() >= 6) {
            return "Aprovado"+" - Bolsa: R$ " + bolsa;
        }
        else {
            return "Reprovado";
        }
    }

    @Override
    public String gerarRelatorio() {
        return "Aluno:" + getNome() + "| Nota:" + getNota() + "| Situação:" + situacao() + "- Bolsa: R$" + bolsa;
    }
}

interface Relatorio {
    String gerarRelatorio();
}