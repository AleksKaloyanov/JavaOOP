package WorkingWithAbstraction.HotelReservation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("\\s+");

        double price = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        Season multiplier = Season.valueOf(input[2].toUpperCase());
        DiscountType discount = DiscountType.valueOf(input[3].toUpperCase());

        System.out.printf("%.2f%n", price * days * multiplier.getMultiplier() * discount.getDiscount());
    }
}
