public abstract class Price {
  
  private Rental _each;
  private int _frequentRenterPoints = 0;
  
  public abstract int getPriceCode();

  public abstract double getCharge(int daysRented);

   public int getFrequentRenterPoints(int daysRented) {
     //Adicionar o trecho de código extraído.
    _frequentRenterPoints ++;
    // add bonus for a two day new release rental
        if ((_each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
            _each.getDaysRented() > 1) _frequentRenterPoints ++;
    return _frequentRenterPoints;    
   }
}
