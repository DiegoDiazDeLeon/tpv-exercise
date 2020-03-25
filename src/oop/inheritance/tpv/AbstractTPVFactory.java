package oop.inheritance.tpv;

import oop.inheritance.data.SupportedTerminal;
import oop.inheritance.ingenico.IngenicoCardSwipper;
import oop.inheritance.ingenico.IngenicoChipReader;
import oop.inheritance.ingenico.IngenicoDisplay;
import oop.inheritance.ingenico.IngenicoKeyboard;

public abstract class AbstractTPVFactory {

    public static Object getFactory(SupportedTerminal supportedTerminal) {
        switch (supportedTerminal) {
            case INGENICO:
                return new IngenicoTPVFactory();
            case VERIFONE:
                return new VerifoneV240Factory();
        }
        return null;
    }

    public abstract IngenicoCardSwipper getCardSwipper();

    public abstract IngenicoChipReader getChipReader();

    public abstract IngenicoDisplay getDisplay();

    public abstract IngenicoKeyboard getKeyboard();
}
