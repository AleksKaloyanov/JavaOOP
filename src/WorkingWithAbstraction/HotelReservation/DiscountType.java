package WorkingWithAbstraction.HotelReservation;

public enum DiscountType {
    NONE(1),
    SECONDVISIT(0.9),
    VIP(0.8);

    private double discount;

    DiscountType(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
