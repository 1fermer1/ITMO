package Moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Status;
import Lib.Mes;

public class DragonBreath extends SpecialMove {
	public DragonBreath() { super(Type.DRAGON, 60, 100); }

	protected void applyOppEffects(Pokemon var1) {
		Effect var2 = (new Effect()).chance(0.3).condition(Status.PARALYZE);
		var1.setCondition(var2);
	}
	
	protected String describe() { return (new String(Mes.use) + " Dragon Breath"); }
}