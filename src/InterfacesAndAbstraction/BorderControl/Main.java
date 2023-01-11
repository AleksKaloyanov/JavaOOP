package InterfacesAndAbstraction.BorderControl;

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

        List<Identifiable> identifiables = new ArrayList<>();

        while (!"End".equals(input = br.readLine())) {
            String[] tokens = input.split("\\s+");
            if (tokens.length == 3) {
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String id = tokens[2];
                identifiables.add(new Citizen(name, age, id));
            } else {
                String model = tokens[0];
                String id = tokens[1];
                identifiables.add(new Robot(model, id));
            }
        }

        String pattern = br.readLine();

        for (Identifiable identifiable : identifiables) {
            if (identifiable.getId().endsWith(pattern)) {
                System.out.println(identifiable.getId());
            }
        }
    }
}
