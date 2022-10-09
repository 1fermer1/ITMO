package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;
import Lib.Mes;

public class AerialAce extends PhysicalMove {
    public AerialAce() { super(Type.FLYING, 60, 0); }

    protected void applySelfEffects(Pokemon var1) {
        Effect var2 = (new Effect()).turns(0).stat(Stat.ACCURACY, 100);
        var1.addEffect(var2);
    }

    protected String describe() { return (new String(Mes.use) + " Aerial Ace"); }
}
