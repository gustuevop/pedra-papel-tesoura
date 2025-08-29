package jogo;

import java.util.ArrayList;
import java.util.List;

import jogo.entidades.Jogador;
import jogo.entidades.Jogo;
import jogo.entidades.menu.OpcaoNovaPartida;
import jogo.entidades.menu.Opcao;

public class Main {

	public static void main(String[] args) {
		Jogo jogo = new Jogo(mockJogadores(), mockOpcoes());
		jogo.jogar();
	}
	
	public static List<Opcao> mockOpcoes() {
		Opcao op1 = new OpcaoNovaPartida();
		Opcao op2 = new OpcaoSair();
		
		List<Opcao> opcoesMenu = new ArrayList<Opcao>();
		opcoesMenu.add(op1);
		opcoesMenu.add(op2);
		
		return opcoesMenu;
	}
	
	public static List<Jogador> mockJogadores() {
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		
		List<Jogador> jogadores = new ArrayList<Jogador>();
		jogadores.add(j1);
		jogadores.add(j2);
		
		return jogadores;
	}
}
