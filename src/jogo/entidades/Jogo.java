package jogo.entidades;

import java.util.List;

import jogo.entidades.menu.Menu;
import jogo.entidades.menu.opcoes.Opcao;

public class Jogo {

	private List<Jogador> jogadores;
	private Menu menu;
	private boolean rodar = true;
	
	public Jogo(List<Jogador> jogadores) {
		this.jogadores = jogadores;
		this.menu = new Menu();
	}
	
	public void jogar() {
		while (rodar) {
			Opcao opcao = menu.executar();
			rodar = opcao.executar(jogadores);
		}
	}
}