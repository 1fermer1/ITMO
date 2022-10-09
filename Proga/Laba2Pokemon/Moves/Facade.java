package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;
import Lib.Mes;

public class Facade extends PhysicalMove {
    public Facade() { super(Type.NORMAL, 70, 100); }

    protected void  applySelfEffects(Pokemon var1) {
        if (var1.getCondition() == Status.BURN || var1.getCondition() == Status.PARALYZE || var1.getCondition() == Status.POISON) {
            Effect var2 = (new Effect()).turns(0).stat(Stat.ATTACK, (int)(var1.getStat(Stat.ATTACK) * 2));
            var1.addEffect(var2);
        }
    }

    protected String describe() { return (new String(Mes.use) + " Facade"); }
}
