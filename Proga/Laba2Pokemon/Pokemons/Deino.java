package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Type;
import Moves.DragonPulse;
import Moves.DragonBreath;

public class Deino extends Pokemon {
	public Deino(String var1, int var2) {
		super(var1, var2);
		this.setStats(52, 65, 50, 45, 50, 38);
		this.setType(new Type[]{Type.DARK, Type.DRAGON});
		this.setMove(new Move[]{new DragonPulse(), new DragonBreath()});
	}
}