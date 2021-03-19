package mx.com.softgame.poo1game.utils;
public class Utileria{
	public static int contadorID;
	private Utileria(){}//que nadie puede llamar al constructor de esta clase.

	//metodos
	public static int getID(){
		return (++contadorID);
	}
}