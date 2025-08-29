package jogo.entidades.menu.opcoes;

import jogo.entidades.Jogador;
import jogo.entidades.Simbolo;

import java.util.*;

public class OpcaoNovaPartida extends Opcao {
	
	public OpcaoNovaPartida() {
		super("NOVA PARTIDA");
	}

	@Override
	public boolean executar(List<Jogador> jogadores) {
		System.out.println("\nLOG - Iniciando nova partida!\n");
		coletaSimbolos(jogadores);
		
		
		return true;
	}

	private void coletaSimbolos(List<Jogador> jogadores) {
		for (Jogador jogador : jogadores) {
			System.out.println("LOG - Coletando símbolo do jogador " + jogadores.indexOf(jogador));
			System.out.println("Escolha um símbolo: " + jogadores.indexOf(jogador));

			jogador.simboloEscolhido = obterSimbolo(Opcao.scanner);
		}
		

		
	}

	private Simbolo obterSimbolo(Scanner scanner) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
