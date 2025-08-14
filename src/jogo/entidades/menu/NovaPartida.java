package jogo.entidades.menu;

import jogo.entidades.Jogador;
import java.util.*;

public class NovaPartida extends Opcao {
	private String nome = "Nova Partida";
	private Resultado resultado;

	public Resultado executar() {
		//logica do jokenpo
		return Resultado.GANHOU;
	}
	
}
