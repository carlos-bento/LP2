package br.com.ifgoiano.exe35;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Professor professor2 = new Professor();

        aluno.setNome("João");
        aluno.setSobreNome("Silva");
        aluno.setMatricula(123);

        professor.setNome("Maria");
        professor.setSobreNome("Antunes");
        professor.setDisciplina("Java");

        //professor.setNome ( "João" );
        professor2.setNome ( "Cléber" );
        professor2.setSobreNome ( "Rafael" );
        professor2.setDisciplina ( "Banco de Dados" );

        if (aluno.getNome().equals(professor.getNome())) {
            System.out.println("Não é permitido ter duas pessoas com nomes iguais!");
        }else{
            pessoas.add(aluno);
            pessoas.add(professor);
            pessoas.add(professor2);
            contaPessoas(pessoas);
        }


    }

    public static void contaPessoas(ArrayList<Pessoa> p){
        for (Pessoa pessoa : p) {
            if (pessoa instanceof Aluno) {
                System.out.printf ( "A pessoa %s é Aluno\n", pessoa.getNome ( ) );
            } else if (pessoa instanceof Professor) {
                System.out.printf ( "A pessoa %s é Professor\n", pessoa.getNome ( ) );
            }
        }
    }

}
