package WorkingWithAbstractionEx.CardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String card = br.readLine();
        String suit = br.readLine();

        System.out.printf("Card name: %s of %s; Card power: %d", card, suit, Rank.valueOf(card).getPower() + Suit.valueOf(suit).getPower());
    }
}

