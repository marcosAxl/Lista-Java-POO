package lista3;/*Crie uma classe Aluno com nome, matrícula e um array de notas. Implemente métodos para:
Cadastrar notas (máximo de 4).
Calcular a média.
Verificar se o aluno está aprovado (média ≥ 7.0).

Em seguida, crie uma classe Turma com um array de Aluno e métodos para listar alunos aprovados e reprovados.*/


public class Q1 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Pedro Odalves", 101);
        aluno1.cadastrarNota(8.0);
        aluno1.cadastrarNota(9.0);
        aluno1.cadastrarNota(7.0);
        aluno1.cadastrarNota(8.0);

        Aluno aluno2 = new Aluno("Nick Brayan", 102);
        aluno2.cadastrarNota(5.0);
        aluno2.cadastrarNota(6.0);
        aluno2.cadastrarNota(4.0);
        aluno2.cadastrarNota(7.0);

        Turma turma = new Turma(10);
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);

        turma.listarAprovados();
        turma.listarReprovados();
    }
}
