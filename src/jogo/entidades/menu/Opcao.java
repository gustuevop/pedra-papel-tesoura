package jogo.entidades.menu;

import java.util.List;

import jogo.entidades.Jogador;

public abstract class Opcao {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}