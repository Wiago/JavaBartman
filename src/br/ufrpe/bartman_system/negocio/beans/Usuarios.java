package br.ufrpe.bartman_system.negocio.beans;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Usuarios {
	private static String id;
	private String nome;
	private LocalDate nascimento;
	private String login;
	private String senha;
	public DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
	
	public Usuarios() {
		
	}
	
	public void gerarId(String op) {
		Usuarios.id = IdGerador.gerarId(op);
	}
	
	public Usuarios(String nome, LocalDate nascimento, String login, String senha) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.login = login;
		this.senha = senha;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getId() {
		return id;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + ", Data de nascimento: " + getNascimento() + ", Login : "+ getLogin() + ", Id: " + getId();
	}
	
	
}
