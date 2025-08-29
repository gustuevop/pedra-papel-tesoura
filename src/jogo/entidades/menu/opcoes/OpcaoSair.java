package jogo.entidades.menu.opcoes;

import java.util.List;

import jogo.entidades.Jogador;

public class OpcaoSair extends Opcao {

   public OpcaoSair() {
        super("SAIR");
    }
	
	@Override
	public boolean executar(List<Jogador> jogadores) {
		return false;
	}

}
