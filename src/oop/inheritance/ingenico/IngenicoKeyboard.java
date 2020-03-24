package oop.inheritance.ingenico;

public class IngenicoKeyboard {

    private static IngenicoKeyboard  uniqueInstance= null; //instancia empieza en null

    private IngenicoKeyboard(){

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
