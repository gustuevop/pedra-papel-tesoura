package jogo.entidades.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jogo.entidades.menu.opcoes.Opcao;
import jogo.entidades.menu.opcoes.OpcaoNovaPartida;
import jogo.entidades.menu.opcoes.OpcaoSair;

public class Menu {
	private List<Opcao> opcoes;
	private static final Scanner scanner = new Scanner(System.in);
	
	public Menu() {
		this.opcoes = mockOpcoes();
	}

	public Opcao executar() {
		System.out.println("\n====\nEscolha uma opção:\n");
		
		for (int i = 0; i < opcoes.size(); i++) {
			System.out.printf("%d - %s%n", i, opcoes.get(i).getNome());
		}
		
		int indiceOpcaoEscolhida = -1;
		
		while (indiceOpcaoEscolhida < 0 || indiceOpcaoEscolhida >= opcoes.size()) {
			if (scanner.hasNextInt()) {
				indiceOpcaoEscolhida = scanner.nextInt();
			} else {
				System.out.println("\nEntrada inválida! Tente novamente.\n");
				scanner.next();
			}
		}
		
	
		return opcoes.get(indiceOpcaoEscolhida);
	}
	
	public static List<Opcao> mockOpcoes() {
		Opcao op1 = new OpcaoNovaPartida();
		Opcao op2 = new OpcaoSair();
		
		List<Opcao> opcoesMenu = new ArrayList<Opcao>();
		opcoesMenu.add(op1);
		opcoesMenu.add(op2);
		
		return opcoesMenu;
	}
	
}