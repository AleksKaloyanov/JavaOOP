package Skeletons.barracksWars.core.factories;

import Skeletons.barracksWars.interfaces.Unit;
import Skeletons.barracksWars.interfaces.UnitFactory;
import Skeletons.barracksWars.models.units.*;
import jdk.jshell.spi.ExecutionControl;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "Skeletons.barracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException {
        switch (unitType) {
            case "Archer":
                return new Archer();
            case "Gunner":
                return new Gunner();
            case "Horseman":
                return new Horseman();
            case "Pikeman":
                return new Pikeman();
            case "Swordsman":
                return new Swordsman();
        }
        throw new ExecutionControl.NotImplementedException("message");
    }
}
