package oop.inheritance.ingenico;

import oop.inheritance.tpv.IngenicoDisplayInterface;

public class IngenicoDisplay implements IngenicoDisplayInterface {

    private static IngenicoDisplay  uniqueInstance= null; //instancia empieza en null

    private IngenicoDisplay(){

    }

    public static IngenicoDisplay getInstance(){
        if(uniqueInstance==null)          //verifica
        {
            uniqueInstance = new IngenicoDisplay(); //si esta en null crea la nueva
        }
        return uniqueInstance; //si ya existe solo regresa
    }

    /**
     * Prints a message to specied position
     *
     * @param x       horizontal position
     * @param y       vertical position
     * @param message message to be printed
     */
    public void showMessage(int x, int y, String message) {
    }

    /**
     * Clears the screen
     */
    public void clear() {

    }
}
