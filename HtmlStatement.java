import java.util.Enumeration;

public class HtmlStatement extends Statement {
  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = "<H1>Rentals Record for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      // show figures for each rental
      result += each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
    }
    // add footer lines
    result += "Amount owed is <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    result += "You earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints())
        + "</EM> frequent renter points<P>";
    return result;
  }
}