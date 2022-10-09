package Moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import Lib.Mes;

public class DragonPulse extends SpecialMove {
	public DragonPulse() { super(Type.DRAGON, 85, 100); }

	protected void applyOppDamage(Pokemon var1, double var2) {
		super.applyOppDamage(var1, var2);
	}

	   
	protected String describe() { return (new String(Mes.use) + " Dragon Pulse"); }
}