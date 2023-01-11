package EncapsulationEx.PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));

            String input = "";

            Pizza pizza = null;
            while (!"END".equals(input = br.readLine())) {
                String[] tokens = input.split("\\s+");
                String type = tokens[0];
                if ("EncapsulationEx.PizzaCalories.Pizza".equals(type)) {
                    pizza = new Pizza(tokens[1], Integer.parseInt(tokens[2]));
                } else if ("EncapsulationEx.PizzaCalories.Dough".equals(type)) {
                    Dough dough = new Dough(tokens[1], tokens[2], Double.parseDouble(tokens[3]));
                    pizza.setDough(dough);
                } else {
                    Topping topping = new Topping(tokens[1], Double.parseDouble(tokens[2]));
                    pizza.addTopping(topping);
                }
            }

            System.out.println(String.format("%s - %.2f", pizza.getName(), pizza.getOverAllCalories()));
        } catch (IllegalStateException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
