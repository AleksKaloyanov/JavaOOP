package InterfacesAndAbstractionEx.militaryElite;

import InterfacesAndAbstractionEx.militaryElite.enums.Corp;
import InterfacesAndAbstractionEx.militaryElite.interfaces.Engineer;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {

    private Set<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corp corp) {
        super(id, firstName, lastName, salary, corp);
        this.repairs = new LinkedHashSet<>();
    }

    @Override
    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public Collection<Repair> getRepairs() {
        return this.repairs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f", getFirstName(),
                getLastName(), getId(), getSalary())).append(System.lineSeparator());
        sb.append("Corps: ").append(getCorp().getName()).append(System.lineSeparator());
        sb.append("Repairs: ").append(System.lineSeparator());
        repairs.forEach(e -> sb.append("  ").append(e).append(System.lineSeparator()));
        return sb.toString();

    }
}
