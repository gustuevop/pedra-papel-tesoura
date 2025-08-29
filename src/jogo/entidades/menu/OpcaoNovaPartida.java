package jogo.entidades.menu;

import jogo.entidades.Jogador;
import java.util.*;

public class OpcaoNovaPartida extends Opcao {
	
	protected OpcaoNovaPartida() {
		super("NOVA PARTIDA");
	}

	@Override
	public boolean executar(List<Jogador> jogadores) {
		System.out.println("Você ganhou!");
		
		System.out.println("Voltar para tela inicial?");
		System.out.println("1 - SIM");
		new Scanner(System.in).nextInt();
		return true;
	}
	
}
