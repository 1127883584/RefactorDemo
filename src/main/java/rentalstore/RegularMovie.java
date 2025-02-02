package rentalstore;

public class RegularMovie extends Movie {
    public RegularMovie(String title, int priceCode){
        super(title, priceCode);
    }

    protected double getDayRented(int dayRented) {
        double thisAmount = 2;
        if (dayRented > 2) {
            thisAmount += (dayRented - 2) * 1.5;
        }
        return thisAmount;
    }
}
