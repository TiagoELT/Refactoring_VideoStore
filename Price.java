public abstract class Price {
  
  private Rental _each;
  
  public abstract int getPriceCode();

  public abstract double getCharge(int daysRented);
  
}
