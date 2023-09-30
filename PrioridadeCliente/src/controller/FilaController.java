package controller;

import java.util.Queue;
import java.util.Scanner;

import entities.Cliente;

public class FilaController {
	Scanner sc = new Scanner(System.in);
	public FilaController() {
		super();
	}
	
	
	public void novaSenha(Queue<Cliente> fila) {
		System.out.println("Insira o nome do cliente: ");
		String nameNew = sc.nextLine();
		sc.nextLine();
			
		System.out.println("Insira a senha do cliente: ");
		int senhaNew = sc.nextInt();
		
		fila.add(new Cliente(senhaNew, nameNew));
	}
	
	public void novaSenhaPrio(Queue<Cliente> filaPrioritarios) {
		System.out.println("Insira o nome do cliente prioritário: ");
		String nameNewPrio = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Insira a senha do cliente prioritário: ");
		int senhaNewPrio = sc.nextInt();
		
		filaPrioritarios.add(new Cliente(senhaNewPrio, nameNewPrio));
	}
	
	
	public void chamado(Queue<Cliente> fila, Queue<Cliente> filaPrioritarios) {
	
		if(filaPrioritarios.isEmpty()) {
			System.out.println("Não há prioritários");
			chamadoNormal(fila);
		} else {
			int total = filaPrioritarios.size();
			
			for(int i = 0; i < total; i++) {
				
				if(total < 3 && total > 0) {
					for(int j = 0 ; j < total; j++) {
						chamadoNormal(fila);
					}
				} else {
						Cliente cliente = filaPrioritarios.remove();
						System.out.println("Chamada Prioritária: " +cliente.getNome() + " senha: " +cliente.getNumero());
			
						chamadoNormal(fila);
				}
			}
		}
	
	}



	private void chamadoNormal(Queue<Cliente> fila) {
		
		Cliente cliente = fila.remove();
		System.out.println("Chamada normal: " + cliente.getNome() + " senha: " + cliente.getNumero());
		
	}
	
	
		

}
