package mx.com.softgame.poo1game.personajes;
public class Personaje{
	//atributos
	private String nombre;
	private int vida;
	//constructor
	public Personaje (String nombre){
		this.nombre = nombre;
		this.vida = vida;
	}
	//metodos
	public String getNombre(){
		return nombre;
	}
	public int getVida(){
		return vida;
	}
	public String getDetalle(){
		return nombre + "\t" + vida; 
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
}