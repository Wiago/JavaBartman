package br.ufrpe.bartman_system.gui;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import br.ufrpe.bartman_system.negocio.beans.Funcionario;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		String nome = "Henrique";
		String nascimento = "01/05/1999";
		String login = "henrique";
		String senha = "145";
		LocalDate data = LocalDate.parse(nascimento, formato);
		String op = "1";
		
		Funcionario a = new Funcionario(nome, data, login, senha, op);
		System.out.println(a.toString());
	}

}
