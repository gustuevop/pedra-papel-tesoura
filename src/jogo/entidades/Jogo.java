package jogo.entidades;

import java.util.List;

import jogo.entidades.menu.Menu;
import jogo.entidades.menu.Opcao;

public class Jogo {

	private List<Opcao> opcoesMenu;
	private List<Jogador> jogadores;
	private Menu menu;
	
	public Jogo(List<Jogador> jogadores, List<Opcao> opcoesMenu) {
		this.jogadores = jogadores;
		this.opcoesMenu = opcoesMenu;
	}
	
	public void jogar() {
		this.menu = new Menu(opcoesMenu);
		Opcao opcao = menu.executar();
		opcao.executar(jogadores);
	}
}