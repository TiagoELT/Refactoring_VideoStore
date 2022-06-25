public abstract class Price {
  
  private Rental _each;
  private int _frequentRenterPoints = 0;
  
  public abstract int getPriceCode();

  public abstract double getCharge(int daysRented);

   public int getFrequentRenterPoints(int daysRented) {
     return 1;    
   }
}
