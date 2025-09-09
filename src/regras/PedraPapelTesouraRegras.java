package regras;

import java.util.EnumSet;
import java.util.Map;
import jogo.entidades.Simbolo;

public class PedraPapelTesouraRegras {

	public enum Resultado {VITORIA, DERROTA, EMPATE}
	public static final Map<Simbolo, EnumSet<Simbolo>> VENCE = Map.of(
			Simbolo.PEDRA, EnumSet.of(Simbolo.TESOURA),
			Simbolo.PAPEL, EnumSet.of(Simbolo.PEDRA),
			Simbolo.TESOURA, EnumSet.of(Simbolo.PAPEL)
			);
	//Bloquear instanciacao
	private PedraPapelTesouraRegras() {};
	
	public static Resultado resultado(Simbolo s1, Simbolo s2) {
		if (s1 == s2) return Resultado.EMPATE;
		return VENCE.get(s1).contains(s2) ? Resultado.VITORIA : Resultado.DERROTA;
	}
	
}
