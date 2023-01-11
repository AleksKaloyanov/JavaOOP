package InterfacesAndAbstractionEx.militaryElite.interfaces;

import InterfacesAndAbstractionEx.militaryElite.Mission;

import java.util.Collection;

public interface Commando {
    void addMission(Mission mission);

    Collection<Mission> getMissions();
}
