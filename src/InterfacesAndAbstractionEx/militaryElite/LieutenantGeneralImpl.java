package InterfacesAndAbstractionEx.militaryElite;

import InterfacesAndAbstractionEx.militaryElite.interfaces.LieutenantGeneral;
import InterfacesAndAbstractionEx.militaryElite.interfaces.Private;

import java.util.HashSet;
import java.util.Set;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private Set<Private> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new HashSet<>();
    }

    @Override
    public void addPrivates(Private priv) {
        this.privates.add(priv);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f", getFirstName(),
                getLastName(), getId(), getSalary())).append(System.lineSeparator());
        sb.append("Privates:").append(System.lineSeparator());
        privates.stream().sorted((e1, e2) -> Integer.compare(e2.getId(), e1.getId()))
                .forEach(e -> sb.append(" ").append(e));
        return sb.toString();
    }
}
