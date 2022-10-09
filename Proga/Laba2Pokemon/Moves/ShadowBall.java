package Moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;
import Lib.Mes;

public class ShadowBall extends SpecialMove {
    public ShadowBall() { super(Type.GHOST, 80, 100); }

    protected void applyOppEffects(Pokemon var1) {
        Effect var2 = new Effect().chance(0.2).turns(0).stat(Stat.SPECIAL_DEFENSE, -1);
        var1.addEffect(var2);
    }

    protected String describe() { return (new String(Mes.use) + " Shadow Ball"); }
}
