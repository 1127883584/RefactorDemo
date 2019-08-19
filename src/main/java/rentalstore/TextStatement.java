package rentalstore;

import java.util.List;

public class TextStatement extends Statement{
    protected String getContent(Rental each) {
        String result = "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
        return result;
    }

    protected String getHeader(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    protected double getTotalAmount(List<Rental> rentals) {
        return rentals.stream().mapToDouble(Rental::getCharge).sum();
    }

    protected String getFooterLine(double totalAmount, double frequentRenterPoints){
        String result = "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }
}
