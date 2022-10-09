package Pokemons;

import Pokemons.Vullaby;
import ru.ifmo.se.pokemon.Type;
import Moves.BoneRush;

public class Mandibuzz extends Vullaby {
	public Mandibuzz(String var1, int var2) {
		super(var1, var2);
		this.setStats(110, 65, 105, 55, 95, 80);
		this.setType(new Type[]{Type.DARK, Type.FLYING});
		this.addMove(new BoneRush());
	}
}