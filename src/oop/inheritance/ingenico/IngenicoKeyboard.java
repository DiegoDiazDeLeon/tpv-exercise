package oop.inheritance.ingenico;

import oop.inheritance.tpv.IngenicoKeyboardInterface;

public class IngenicoKeyboard implements IngenicoKeyboardInterface {

    private static IngenicoKeyboard  uniqueInstance= null; //instancia empieza en null

    public IngenicoKeyboard(){

    }

    public static IngenicoKeyboard getInstance(){
        if(uniqueInstance==null)          //verifica
        {
            uniqueInstance = new IngenicoKeyboard(); //si esta en null crea la nueva
        }
        return uniqueInstance; //si ya existe solo regresa
    }

    /**
     * @return key pressed
     */
    public String get() {
        return "Key pressed";
    }
}
