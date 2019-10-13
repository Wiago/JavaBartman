package br.ufrpe.bartman_system.negocio.beans;

import java.time.LocalDate;

public class Funcionario extends Usuarios {
	
	public Funcionario(String nome, LocalDate nascimento, String login, String senha, String op) {
		super(nome, nascimento, login, senha);
		super.gerarId(op);
		
	}
	
}
