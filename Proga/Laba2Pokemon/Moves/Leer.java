package Moves;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;
import Lib.Mes;

public class Leer extends StatusMove {
    public Leer() { super(Type.NORMAL, 0, 100); }

    protected void applyOppEffects(Pokemon var1) {
        Effect var2 = new Effect().turns(0).stat(Stat.DEFENSE, -1);
        var1.addEffect(var2);
    }

    protected String describe() { return (new String(Mes.use) + " Leer"); }
}
