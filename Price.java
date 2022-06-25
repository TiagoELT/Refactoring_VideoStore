public abstract class Price {
  
  private Rental _each;
  
  public abstract int getPriceCode();

  public double getCharge(int daysRented) {
    double thisAmount = 0;
    //determine amounts for each line
        switch (_each.getMovie().getPriceCode()) {
           case Movie.REGULAR:
              thisAmount += 2;
              if (_each.getDaysRented() > 2)
                 thisAmount += (_each.getDaysRented() - 2) * 1.5;
              break;
           case Movie.NEW_RELEASE:
              thisAmount += _each.getDaysRented() * 3;
              break;
           case Movie.CHILDRENS:
              thisAmount += 1.5;
              if (_each.getDaysRented() > 3)
                 thisAmount += (_each.getDaysRented() - 3) * 1.5;
               break;
        }
    return thisAmount;
   }
}
