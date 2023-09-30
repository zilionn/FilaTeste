package view;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import controller.FilaController;
import entities.Cliente;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FilaController op = new FilaController();
		Queue<Cliente> fila = new LinkedList<>();
		Queue<Cliente> filaPrioritarios = new LinkedList<>();
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("Senha normal ou prioritária? n/p");
			char opc = sc.next().charAt(0);
			if(opc == 'n') {
				System.out.println("Insira o nome do cliente:");
				String name = sc.nextLine();
				sc.nextLine();
				
				System.out.println("Insira a senha: ");
				int senha = sc.nextInt();
				
				fila.add(new Cliente(senha, name));
			} else {
				System.out.println("Insira o nome do cliente prioritário: ");
				String namePrio = sc.nextLine();
				sc.nextLine();
				System.out.println("Insira a senha do cliente prioritário: ");
				int senhaPrio = sc.nextInt();
				
				filaPrioritarios.add(new Cliente(senhaPrio, namePrio));
			}
		}
		
		int opc;
		do {
		System.out.println("===Menu===");
		System.out.println("1 - Nova senha "
							+ " 2 - Nova senha prioritários "
							+ " 3 - Chamar próxima pessoa para atendimento "
							+ " 9 - sair");
		opc = sc.nextInt();
		
			switch(opc) {
			case 1:
				op.novaSenha(fila);
				break;
			case 2:
				op.novaSenhaPrio(filaPrioritarios);
			
				break;
			case 3:
				op.chamado(fila, filaPrioritarios);
				
				break;
				
			case 9:
				System.out.println("encerrado");
				System.exit(0);
				break;
			}
		
		}while(opc != 9);

	sc.close();
	}
	

}
