package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import Lib.Mes;

public class BraveBird extends PhysicalMove {
    public BraveBird() { super(Type.FLYING, 120, 100); }

    protected void applySelfDamage(Pokemon att, double damage) {
        super.applySelfDamage(att, (damage / 3));
    }

    protected String describe() { return (new String(Mes.use) + " Brave Bird"); }
}
