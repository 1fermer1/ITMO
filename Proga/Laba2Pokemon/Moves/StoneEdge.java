package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import Lib.Mes;

public class StoneEdge extends PhysicalMove {
    public StoneEdge() { super(Type.ROCK, 100, 80); }

    protected double calcCriticalHit(Pokemon var1, Pokemon var2) {
        if (var1.getStat(Stat.SPEED) / 256.0 > Math.random()) {
            System.out.println(new String(Mes.crit));
            return 2.0;
        } else {
            return 1.0;
        }
    }

    protected String describe() { return (new String(Mes.use) + " Stone Edge"); }
}
