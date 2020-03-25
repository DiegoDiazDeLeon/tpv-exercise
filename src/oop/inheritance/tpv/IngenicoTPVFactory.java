package oop.inheritance.tpv;

import oop.inheritance.ingenico.IngenicoCardSwipper;
import oop.inheritance.ingenico.IngenicoChipReader;
import oop.inheritance.ingenico.IngenicoDisplay;
import oop.inheritance.ingenico.IngenicoKeyboard;

public class IngenicoTPVFactory extends AbstractTPVFactory {

    @Override
    public IngenicoCardSwipper getCardSwipper() {
        return new IngenicoCardSwipper();
    }

    @Override
    public IngenicoChipReader getChipReader() {
        return new IngenicoChipReader();
    }

    @Override
    public IngenicoDisplay getDisplay() {
        return IngenicoDisplay.getInstance();
    }

    @Override
    public IngenicoKeyboard getKeyboard() {
        return new IngenicoKeyboard();
    }
}
