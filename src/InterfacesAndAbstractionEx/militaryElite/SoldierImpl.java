package InterfacesAndAbstractionEx.militaryElite;

import InterfacesAndAbstractionEx.militaryElite.interfaces.Soldier;

public abstract class SoldierImpl implements Soldier {
    protected int id;
    protected String firstName;
    protected String lastName;

    public SoldierImpl(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
