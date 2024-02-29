package oo.composicao.variosParaVarios;

public class CursoTeste {

    public static void main(String args[]) {
        Aluno aluno1 = new Aluno("Nycolas");
        Aluno aluno2 = new Aluno("Joao");
        Aluno aluno3 = new Aluno("Atylas");

        Curso curso1 = new Curso("Java avancado");
        Curso curso2 = new Curso("React");
        Curso curso3 = new Curso("JavaScript");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno3);
        curso1.adicionarAluno(aluno2);

        aluno1.adicionarCurso(curso2);
        aluno1.adicionarCurso(curso3);

        for (Aluno aluno: curso1.alunos) {
            System.out.println(aluno.nome);            
        }
    }
}
