package jogo;

import java.util.List;

import jogo.entidades.Jogador;
import jogo.entidades.menu.Opcao;

public class OpcaoSair extends Opcao {

   public OpcaoSair() {
        super("SAIR");
    }
	
	@Override
	public boolean executar(List<Jogador> jogadores) {
		return false;
	}

}
