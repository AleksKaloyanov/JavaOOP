package WorkingWithAbstractionEx.CardRank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        for (Cards value : Cards.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", value.ordinal(), value.name());
        }
    }
}
