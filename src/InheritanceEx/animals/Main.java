package InheritanceEx.animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String type = "";

        List<Animal> animals = new ArrayList<>();

        while (!"Beast!".equals(type = br.readLine())) {
            String[] input = br.readLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            String gender = input[2];

            try {
                Animal animal = Animal.createAnimal(type, name, age, gender);
                animals.add(animal);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
