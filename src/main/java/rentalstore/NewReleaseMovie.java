package rentalstore;

public class NewReleaseMovie extends Movie{
    public NewReleaseMovie(String title, int priceCode){
        super(title, priceCode);
    }

    protected double getDayRented(int dayRented) {
        return dayRented * 3;
    }
}
