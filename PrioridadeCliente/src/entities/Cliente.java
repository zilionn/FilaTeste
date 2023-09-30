package entities;

import java.util.Scanner;

public class Cliente {
	public int Numero;
	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String Nome;
	
	Scanner sc = new Scanner(System.in);
	
	public Cliente(int Numero, String Nome) {
		this.Numero = Numero;
		this.Nome = Nome;
	}
	
	

}
