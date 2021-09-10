package mx.com.softgame.poo1game.utils;
import mx.com.softgame.poo1game.personajes.*;
public class Tablero{
	public final static int MAX_LINE = 10;
	private static int idx = -1;
	private static Personaje[] personajes = new Personaje [MAX_LINE];

	//metodos
	private static boolean addPersonaje(Personaje p){
		boolean result = false;
		if (idx == -1){
			result = true;
		}
		return result;
	}
	private static boolean delPersonaje(){
		
	}
}
//