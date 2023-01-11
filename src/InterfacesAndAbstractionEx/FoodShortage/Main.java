package InterfacesAndAbstractionEx.FoodShortage;

import InterfacesAndAbstractionEx.FoodShortage.person.Buyer;
import InterfacesAndAbstractionEx.FoodShortage.person.Citizen;
import InterfacesAndAbstractionEx.FoodShortage.person.Rebel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, Buyer> buyers = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] tokens = input.split("\\s+");
            if (tokens.length == 3) {
                buyers.putIfAbsent(tokens[0], new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]));
            } else {
                buyers.putIfAbsent(tokens[0], new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]));
            }
        }

        String input = "";

        while (!"End".equals(input = br.readLine())) {
            if (buyers.containsKey(input)) {
                buyers.get(input).buyFood();
            }
        }
        int total = 0;
        for (Buyer value : buyers.values()) {
            total += value.getFood();
        }
        System.out.println(total);
    }
}
