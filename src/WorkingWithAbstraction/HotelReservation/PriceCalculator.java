package WorkingWithAbstraction.HotelReservation;

public class PriceCalculator {


    public static double priceCalculator(double pricePerDay,
                                         int days, Season season, DiscountType discountType) {
        int multiplier = season.getMultiplier();
        double discount = discountType.getDiscount();
        return pricePerDay * days * discount * multiplier;
    }
}
