/**
import mx.com.softgame.poo1game.personajes.malos.Zombie;

public class ZombieCono extends Zombie {
    public ZombieCono(String nombre){
        super(nombre);
      -constructor Object in class Object cannot be applied to given types;
        super(nombre);
        - Esto se debe porque estamos llamando al atributo nombre y como la clase de zombie ya es final no se puede
          llamar.
        -  cannot inherit from final Zombie.
        - No puedo heredar la clase zombie por que ya es final.

    

    }
}
**/