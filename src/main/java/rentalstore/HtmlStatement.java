package rentalstore;

import java.util.List;

public class HtmlStatement extends Statement {
    protected String getContent(Rental each) {
        String result = each.getMovie().getTitle() + "：" + each.getCharge() + "<BR>\n";
        return result;
    }

    protected String getHeader(Customer customer) {
        return "<H1>Rental Record for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }

    protected double getTotalAmount(List<Rental> rentals) {
        return rentals.stream().mapToDouble(Rental::getCharge).sum();
    }

    protected String getFooterLine(double totalAmount, double frequentRenterPoints){
        String result = "<P>You owe<EM>" + totalAmount + "</EM><P>\n";
        result += "On this rental you earned <EM>" + frequentRenterPoints + "</EM> frequent renter points<P>";
        return result;
    }
}
