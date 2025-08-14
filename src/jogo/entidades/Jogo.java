package jogo.entidades;

import java.util.List;

import jogo.entidades.menu.Menu;
import jogo.entidades.menu.Opcao;

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
		
		this.menu = new Menu();
		Opcao opcao = menu.executar();
		opcao.executar();
		
		
	}
}


//Jogar nova partida
//Ver historico
//Sair