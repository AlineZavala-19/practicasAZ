package mx.com.softgame.poo1game.personajes.malos;
import mx.com.softgame.poo1game.personajes.*;
public class Zombie extends Personaje{
	//atributos
	boolean ataque;
	//constructores
	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre,vida);
		this.ataque = ataque;
	}
	public Zombie(String nombre, boolean ataque){
		this(nombre,3,ataque);
	}
	public Zombie(String nombre){
		this(nombre,3,false);
	}
	//metodos
	public boolean getAtaque(){
		return ataque;
	}
	public String toString(){
		return super.toString() + "\t" + ataque;
	}
	public void decVida(){
		if(!ataque){
			super.decVida(3);
		}else{
			super.decVida(2);
		}
	}
	public void decVida(int decrecer){
		if(!ataque){
			super.decVida(decrecer*3);
		}else{
			super.decVida(decrecer*2);
		}
	}
	/*public boolean equals(Object x){
		boolean iguales = false;
		if (super.equals(x) && x instanceof Zombie){
			Zombie y = (Zombie) x;
			if (ataque == y.ataque){
				iguales = true;
			}
		}
		return iguales;
	}*/
	//sustitui el metodo equals anterior para no tener que mandar llamar a super, pues me salia error
	public boolean equals(Object x){
		boolean iguales = false;
		if ((x != null) && (x instanceof Zombie)){
			Zombie y = (Zombie) x;
			if (this.nombre.equals(y.nombre) && vida == y.vida && ataque == y.ataque){
				iguales = true;
			}
		}
		return iguales;
	}
	/*public static String getIdVida(){
    	getIdVida() in Planta cannot override getIdVida() in Personaje
       		return (getIdVida()+" "+ ataque);
    }*/
    public void setNombre(String nombre){
		if (nombre.length() >=3 && nombre.length() <=8){
			this.nombre = nombre;
		}
	}

}