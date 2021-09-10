package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.malos.Zombie;
public class PruebaHerencia{
	public static void main(String[] args){

		Personaje personajes[] = {new Personaje("Omar",99), new Planta("Karen",50)
			, new Zombie("Hanna",80,false), new Personaje("Omar",99), new Planta("Karen",50)
			, new Zombie("Hanna",80,false)};

		int i = 0;
		System.out.println(personajes[2].getIdVida());
		while (i<personajes.length){
			for(Personaje p: personajes){
				if(personajes[i] == p){
					System.out.println("***" + personajes[i].toString() + " identicos "
						+ p.toString() + " son el mismo objeto***");
					continue;
				}
				if(personajes[i].equals(p)){
					System.out.println("**" + personajes[i].toString() + " es igual a "
						+ p.toString() + " son difrentes objetos**");
					continue;
				}
				System.out.println(personajes[i].toString() + " != " + p.toString());
				System.out.println();
			}
			i++;
		}
	}
}