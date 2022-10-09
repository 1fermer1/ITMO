package Moves;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;
import Lib.Mes;

public class Roost extends StatusMove {
    public Roost() { super(Type.FLYING, 0, 0); }

    protected void applySelfEffects(Pokemon var1) {
        Effect var2 = (new Effect()).turns(0).stat(Stat.HP, (int)(var1.getStat(Stat.HP) * 1.5));
        var1.addEffect(var2);
    }

    protected String describe() { return (new String(Mes.use) + " Roost"); }
}
