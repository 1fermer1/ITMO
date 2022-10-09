package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import Lib.Mes;

public class DoubleHit extends PhysicalMove {
	public DoubleHit() { super(Type.NORMAL, 35, 90); }

	protected void applyOppDamage(Pokemon var1, double var2) {
		super.applyOppDamage(var1, var2);
		super.applyOppDamage(var1, var2);
	}

	   
	protected String describe() { return (new String(Mes.use) + " Double Hit"); }
}