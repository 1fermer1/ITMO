package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Type;
import Moves.Roost;
import Moves.Slash;
import Moves.BraveBird;
import Moves.Facade;

public class Farfetch_d extends Pokemon {
	public Farfetch_d(String var1, int var2) {
		super(var1, var2);
		this.setStats(52, 90, 55, 58, 62, 60);
		this.setType(new Type[]{Type.NORMAL, Type.FLYING});
		this.setMove(new Move[]{new Slash(), new Roost(), new BraveBird(), new Facade()});
	}
}
