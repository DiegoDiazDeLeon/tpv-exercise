package oop.inheritance.ingenico;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;
import oop.inheritance.tpv.CardSwipperInterface;
import oop.inheritance.tpv.IngenicoDisplayInterface;

public class IngenicoCardSwipper implements CardSwipperInterface {

    public Card readCard(){

        return new Card("1246578514563698", new ExpirationDate(23,10), EntryMode.SWIPED);
    }
}
