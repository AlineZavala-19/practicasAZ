package mx.com.softgame.poo1game.personajes;
import mx.com.softgame.poo1game.utils.*;
public class Personaje{
	//atributos
	protected String nombre;
	protected int vida;
	private final int id;
	//constructores
	public Personaje (String nombre, int vida, int id){
		this.nombre = nombre;
		this.vida = vida;
		this.id = getID();
	}
	public Personaje (String nombre){
		this(nombre,3,id);
	}
	//metodos
	public String getNombre(){
		return nombre;
	}
	public int getVida(){
		return vida;
	}
	public String toString(){
		return id + nombre + " " + vida; 
	}
	public void setNombre(String nombre){
		if (nombre.length() >=3 && nombre.length() < 10){
			this.nombre = nombre;
		}
	}
	public boolean setVida(int vida){
		boolean inicio = false;
		if (vida > 0 && vida < 101 ){
			this.vida = vida;
			inicio = true;
		}
		return inicio;
	}
	public void saludar(){
		System.out.println("Hola Alumno de POO " + nombre);
	}
	public void decVida(){
		decVida(1);
	}
	public void decVida(int decrecer){
		if((this.vida-decrecer) > 0){
			this.vida -= decrecer; 
		}
	}
	public boolean equals(Object x){
		boolean iguales = false;
		if(x != null && (x instanceof Personaje)){
			Personaje y = (Personaje) x;
			if (this.nombre.equals(y.nombre) && vida == y.vida){
				iguales = true;
			}
		}
		return iguales;
	}
	public final String getIdVida(){
		vida = (String) vida;
		return (id + vida);
	}
}