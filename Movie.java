public class Movie {

  public static final int  CHILDRENS = 2;
  public static final int  REGULAR = 0;
  public static final int  NEW_RELEASE = 1;

  private String _title;
  private Price _price;
  private Rental _each;
  private int _frequentRenterPoints = 0;

  public Movie(String title, int priceCode) {
      _title = title;
      setPriceCode(priceCode);
  }

  public int getPriceCode() {
      return _price.getPriceCode();
  }

  public void setPriceCode(int arg) {
      switch (arg) {
         case REGULAR:
            _price = new RegularPrice();
            break;
         case CHILDRENS:
            _price = new ChildrensPrice();
            break;
         case NEW_RELEASE:
            _price = new NewReleasePrice();
            break;
         default:
            throw new IllegalArgumentException("Incorrect Price Code");
      }
  }

  public String getTitle (){
      return _title;
  }

  public double getCharge(int daysRented){
    return _price.getCharge(daysRented);    
   }

  public int getFrequentRenterPoints(int daysRented){
    //Adicionar o trecho de código extraído.
    _frequentRenterPoints ++;
    // add bonus for a two day new release rental
        if ((_each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
            _each.getDaysRented() > 1) _frequentRenterPoints ++;
    return _frequentRenterPoints;
   }  
}