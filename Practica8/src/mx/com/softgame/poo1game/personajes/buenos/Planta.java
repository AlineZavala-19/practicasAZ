package mx.com.softgame.poo1game.personajes.buenos;
import mx.com.softgame.poo1game.personajes.*;
public class Planta extends Personaje{
	private char escudo;
	//metodos
	public char getEscudo(){
		return escudo;
	}
	//constructores
	public Planta(String nombre, int vida, char escudo){
		super(nombre,vida);
		this.escudo=escudo;
	}
	public Planta(String nombre, char escudo){
		this(nombre,3,escudo);
	}
	public Planta(String nombre, int vida){
		this(nombre,vida,'A');
	}
	public Planta(String nombre){
		this(nombre,3,'A');
	}
	public String getDetalle(){
		return super.getDetalle() + "\t" + escudo;
	}
	public void decVida(){
		decVida(1);
	}
	public void decVida(int vida){
		if(escudo =='A'){
			super.decVida(vida*2);
		}else{
			super.decVida(vida);
		}
	}
}