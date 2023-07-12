package PolymorphismEx.Zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String input = "";

        while (!"End".equals(input = br.readLine())) {
            String[] foodLine = br.readLine().split("\\s+");
            String[] tokens = input.split("\\s+");
            String type = tokens[0];

            switch (type) {
                case "PolymorphismEx.Zoo.Cat":
                    //TODO
                    break;
                case "PolymorphismEx.Zoo.Tiger":
                    break;
                case "PolymorphismEx.Zoo.Mouse":
                    break;
                case "PolymorphismEx.Zoo.Zebra":
                    break;
            }
        }
    }
}
