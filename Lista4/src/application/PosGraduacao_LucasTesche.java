package application;

import entities.Pessoas;

public class PosGraduacao_LucasTesche extends Pessoas {
    private String cursoPosgraduacao;

    public PosGraduacao_LucasTesche(String nome, String cpf, String matricula, String cursoPosgraduacao) {
        super(nome, cpf, matricula);
        this.cursoPosgraduacao = cursoPosgraduacao;}

    public String getCursoPosgraduacao() {
     return cursoPosgraduacao;}

    public void setCursoPosgraduacao(String cursoPosgraduacao) {
       this.cursoPosgraduacao = cursoPosgraduacao;}

	@Override
	public String toString() {
		return super.toString() + ", [cursoPosgraduacao=" + cursoPosgraduacao + "]";
	}

}