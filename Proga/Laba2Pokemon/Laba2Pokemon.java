import Pokemons.Farfetch_d;
import Pokemons.Vullaby;
import Pokemons.Mandibuzz;
import Pokemons.Deino;
import Pokemons.Zweilous;
import Pokemons.Hydreigon;
import Lib.Mes;
import ru.ifmo.se.pokemon.Battle;

public class Laba2Pokemon {
	public static void main (String[] args) {
		Battle battle = new Battle();

		Farfetch_d Tolya = new Farfetch_d(new String(Mes.Tolya), 1);
		Vullaby Voryga = new Vullaby("Voryga", 1);
		Mandibuzz Pikachu = new Mandibuzz("Pikachu", 1);
		Deino Vafla = new Deino(new String(Mes.Vafla), 1);
		Zweilous Mortis = new Zweilous(new String(Mes.Mortis), 1);
		Hydreigon Fermer = new Hydreigon(new String(Mes.Fermer), 1);

		battle.addAlly(Fermer);
		battle.addAlly(Voryga);
		battle.addAlly(Pikachu);
		battle.addFoe(Vafla);
		battle.addFoe(Mortis);
		battle.addFoe(Tolya);

		battle.go();
	}
}