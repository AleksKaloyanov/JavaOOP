package InterfacesAndAbstractionEx.militaryElite.enums;

public enum State {
    INPROGRESS("inProgress"),
    FINISHED("finished");

    private String name;

    State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
