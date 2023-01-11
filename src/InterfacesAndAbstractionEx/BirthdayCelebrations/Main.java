package InterfacesAndAbstractionEx.BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String input = "";

        List<Birthable> creatures = new ArrayList<>();

        while (!"End".equals(input = br.readLine())) {
            String[] tokens = input.split("\\s+");
            String type = tokens[0];
            switch (type) {
                case "InterfacesAndAbstractionEx.BirthdayCelebrations.Citizen":
                    creatures.add(new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]));
                    break;
                case "InterfacesAndAbstractionEx.BirthdayCelebrations.Pet":
                    creatures.add(new Pet(tokens[1], tokens[2]));
                    break;
            }
        }

        String yearToPrint = br.readLine();

        for (Birthable creature : creatures) {
            if (creature.getBirthDate().endsWith(yearToPrint)) {
                System.out.println(creature.getBirthDate());
            }
        }
    }
}
