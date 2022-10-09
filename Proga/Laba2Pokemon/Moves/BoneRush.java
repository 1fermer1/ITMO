package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import Lib.Mes;

public class BoneRush extends PhysicalMove {
    public BoneRush() { super(Type.GROUND, 25, 90); }

    protected void applyOppDamage(Pokemon var1, double var2) {
        int var3 = (int)(Math.random() * 4 + 2);
        if (var3 == 2) {
            applyOppDamage(var1, var2);
            applyOppDamage(var1, var2);
        } 
        else if (var3 == 3) {
            applyOppDamage(var1, var2);
            applyOppDamage(var1, var2);
            applyOppDamage(var1, var2);
        } 
        else if (var3 == 4) {
            applyOppDamage(var1, var2);
            applyOppDamage(var1, var2);            
            applyOppDamage(var1, var2);
            applyOppDamage(var1, var2);
        } 
        else {
            applyOppDamage(var1, var2);
            applyOppDamage(var1, var2);
            applyOppDamage(var1, var2);
            applyOppDamage(var1, var2);
            applyOppDamage(var1, var2);
        }
    }

    protected String describe() { return (new String(Mes.use) + " Bone Rush"); }
}
