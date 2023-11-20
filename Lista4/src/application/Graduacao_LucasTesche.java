package application;

import entities.Pessoas;

public class Graduacao_LucasTesche extends Pessoas {
    private String cursoGraduacao;

    public Graduacao_LucasTesche(String nome, String cpf, String matricula, String cursoGraduacao) {
        super(nome, cpf, matricula);
        this.cursoGraduacao = cursoGraduacao;
    }

    public String getCursoGraduacao() {
        return cursoGraduacao;
    }

    public void setCursoGraduacao(String cursoGraduacao) {
        this.cursoGraduacao = cursoGraduacao;
    }

	@Override
	public String toString() {
      
        return super.toString() + ", [cursoGraduacao= " + cursoGraduacao + "]";
    }
}
    