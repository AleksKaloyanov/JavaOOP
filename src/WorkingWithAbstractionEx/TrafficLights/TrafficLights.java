package WorkingWithAbstractionEx.TrafficLights;

public enum TrafficLights {
    RED(0),
    GREEN(1),
    YELLOW(2);

    private int position;

    TrafficLights(int position) {
        this.position = position;
    }
}
