package jogo.entidades.menu;

import java.util.List;
import java.util.Scanner;

public class Menu {
	private List<Opcao> opcoes;
	
	public Menu(List<Opcao> opcoes) {
		this.opcoes = opcoes;
	}

	public Opcao executar() {
		System.out.println("Escolha uma opção:");
		
		for(Opcao opcao : opcoes) {
			System.out.println(opcao.getNome());
		}
		
		//int idOpcao = new Scanner(System.in).nex
		
		return null;
	}
}