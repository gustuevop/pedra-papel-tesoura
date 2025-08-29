package jogo;

import java.util.ArrayList;
import java.util.List;

import jogo.entidades.Jogador;
import jogo.entidades.Jogo;

public class Main {

	public static void main(String[] args) {
		Jogo jogo = new Jogo(mockJogadores());
		jogo.jogar();
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
