package jogo.entidades;

import java.util.List;

import jogo.entidades.menu.Menu;
import jogo.entidades.menu.Opcao;

public class Jogo {

	private List<Opcao> opcoesMenu;
	private List<Jogador> jogadores;
	private Menu menu;
	private boolean rodar;
	
	public Jogo(List<Jogador> jogadores, List<Opcao> opcoesMenu) {
		this.jogadores = jogadores;
		this.opcoesMenu = opcoesMenu;
	}
	
	public void jogar() {
		while (rodar) {
			this.menu = new Menu(opcoesMenu);
			Opcao opcao = menu.executar();
			rodar = opcao.executar(jogadores);
		}
	}
}