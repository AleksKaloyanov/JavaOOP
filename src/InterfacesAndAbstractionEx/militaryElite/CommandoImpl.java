package InterfacesAndAbstractionEx.militaryElite;

import InterfacesAndAbstractionEx.militaryElite.enums.Corp;
import InterfacesAndAbstractionEx.militaryElite.interfaces.Commando;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private Set<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corp corp) {
        super(id, firstName, lastName, salary, corp);
        this.missions = new LinkedHashSet<>();
    }

    @Override
    public void addMission(Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public Collection<Mission> getMissions() {
        return missions;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f", getFirstName(),
                getLastName(), getId(), getSalary())).append(System.lineSeparator());
        sb.append("Corps: ").append(getCorp().getName()).append(System.lineSeparator());
        sb.append("Missions:").append(System.lineSeparator());
        missions.forEach(e -> sb.append(" ").append(e).append(System.lineSeparator()));
        return sb.toString();

    }
}
