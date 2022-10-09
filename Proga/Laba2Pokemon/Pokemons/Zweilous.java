package Pokemons;

import ru.ifmo.se.pokemon.Type;
import Moves.DoubleHit;

public class Zweilous extends Deino {
	public Zweilous(String var1, int var2) {
		super(var1, var2);
		this.setStats(72, 85, 70, 65, 70, 58);
		this.setType(new Type[]{Type.DARK, Type.DRAGON});
		this.addMove(new DoubleHit());
	}
}