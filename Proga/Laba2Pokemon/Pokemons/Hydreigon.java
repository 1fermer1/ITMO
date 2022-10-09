package Pokemons;

import ru.ifmo.se.pokemon.Type;
import Moves.StoneEdge;

public class Hydreigon extends Zweilous {
	public Hydreigon(String var1, int var2) {
		super(var1, var2);
		this.setStats(92, 105, 90, 125, 90, 98);
		this.setType(new Type[]{Type.DARK, Type.DRAGON});
		this.addMove(new StoneEdge());
	}
}