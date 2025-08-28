package jogo;

import java.util.ArrayList;
import java.util.List;

import jogo.entidades.Jogador;
import jogo.entidades.Jogo;
import jogo.entidades.menu.NovaPartida;
import jogo.entidades.menu.Opcao;

public class Main {

	public static void main(String[] args) {
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		
		Opcao op1 = new NovaPartida();
		
		List<Opcao> opcoesMenu = new ArrayList<Opcao>();
		opcoesMenu.add(op1);
		
		List<Jogador> jogadores = new ArrayList<Jogador>();
		jogadores.add(j1);
		jogadores.add(j2);
		
		Jogo jogo = new Jogo(jogadores, null);
		jogo.jogar();
	}
}
