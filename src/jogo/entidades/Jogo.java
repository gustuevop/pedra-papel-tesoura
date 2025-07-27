package jogo.entidades;

import java.util.List;

public class Jogo {

	private List<Jogador> jogadores;
	private Menu menu;
	
	public Jogo(Jogador j1, Jogador j2) {
		this.jogadores.add(j1);
		this.jogadores.add(j2);
	}
	
	public void jogar() {
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		
		Menu menu = new Menu();
		menu.executar();
		
		System.out.println("Bem vindo ao jogo pedra-papel-tesoura!");
		System.out.println("1 - Jogar nova partida.");
		System.out.println("2 - Ver histórico de partidas.");
		
	}
}
