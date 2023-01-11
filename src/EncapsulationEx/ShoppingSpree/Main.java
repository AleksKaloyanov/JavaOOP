package EncapsulationEx.ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> people = new LinkedHashMap<>();
        String[] inputPeople = br.readLine().split(";");

        for (String inputPerson : inputPeople) {
            String[] persons = inputPerson.split("=");
            String name = persons[0];
            double money = Double.parseDouble(persons[1]);
            try {
                Person person = new Person(name, money);
                people.putIfAbsent(name, person);
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());

            }
        }

        Map<String, Product> products = new LinkedHashMap<>();
        String[] inputProducts = br.readLine().split(";");

        for (String inputProduct : inputProducts) {
            String[] product = inputProduct.split("=");
            String name = product[0];
            double cost = Double.parseDouble(product[1]);
            try {
                Product product1 = new Product(name, cost);
                products.putIfAbsent(name, product1);
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());

            }
        }

        String input = "";

        while (!"END".equals(input = br.readLine())) {
            String[] tokens = input.split("\\s+");
            String personName = tokens[0];
            String productName = tokens[1];
            try {
                people.get(personName).buyProduct(products.get(productName));
                System.out.println(personName + " bought " + productName);

            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());

            }
        }

        people.forEach((key, value) ->

        {
            System.out.print(key + " - ");
            if (value.getProducts().isEmpty()) {
                System.out.println("Nothing bought");
            } else {
                boolean isFirst = true;
                for (Product product : value.getProducts()) {
                    if (isFirst) {
                        System.out.print(product);
                        isFirst = false;
                    } else {
                        System.out.print(", " + product);
                    }
                }
                System.out.println();
            }
        });
    }
}