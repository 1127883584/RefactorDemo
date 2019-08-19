package rentalstore;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    public double getCharge(){
        return movie.getDayRented(dayRented);
    }

    double getFrequentRenterPoints() {
        if ((movie.getPriceCode() == Movie.NEW_RELEASE) && getDayRented() > 1) {
            return 2;
        }
        if (movie.getPriceCode() == Movie.LITERARY) {
            return 1.5;
        }
        return 1;
    }
}
