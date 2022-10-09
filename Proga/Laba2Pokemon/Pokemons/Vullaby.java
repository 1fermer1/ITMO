package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Type;
import Moves.AerialAce;
import Moves.Leer;
import Moves.ShadowBall;

public class Vullaby extends Pokemon {
	public Vullaby(String var1, int var2) {
		super(var1, var2);
		this.setStats(70, 55, 75, 45, 65, 60);
		this.setType(new Type[]{Type.DARK, Type.FLYING});
		this.setMove(new Move[]{new AerialAce(), new Leer(), new ShadowBall()});
	}
}