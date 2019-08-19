package rentalstore;

import java.util.List;

public abstract class Statement {
    public String statement(List<Rental> rentals, Customer customer) {
        double frequentRenterPoints = 0;
        String result = getHeader(customer);
        for (Rental each : rentals) {
            frequentRenterPoints += each.getFrequentRenterPoints();
            result += getContent(each);
        }
        result += getFooterLine(getTotalAmount(rentals), frequentRenterPoints);
        return result;
    }

    protected abstract String getFooterLine(double totalAmount, double frequentRenterPoints);

    protected abstract double getTotalAmount(List<Rental> rentals);

    protected abstract String getContent(Rental each);

    protected abstract String getHeader(Customer customer);
}
