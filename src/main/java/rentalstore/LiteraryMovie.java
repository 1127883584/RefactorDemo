package rentalstore;

public class LiteraryMovie extends Movie {
    public LiteraryMovie(String title, int priceCode){
        super(title, priceCode);
    }

    protected double getDayRented(int dayRented) {
        return dayRented * 6;
    }
}
