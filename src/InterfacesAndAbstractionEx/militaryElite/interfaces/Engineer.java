package InterfacesAndAbstractionEx.militaryElite.interfaces;

import InterfacesAndAbstractionEx.militaryElite.Repair;

import java.util.Collection;

public interface Engineer {
    void addRepair(Repair repair);

    Collection<Repair> getRepairs();
}
