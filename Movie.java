public class Movie {

  public static final int  CHILDRENS = 2;
  public static final int  REGULAR = 0;
  public static final int  NEW_RELEASE = 1;

  private String _title;
  private int _priceCode;

  private Rental _each;
  private int _frequentRenterPoints = 0;

  public Movie(String title, int priceCode) {
      _title = title;
      _priceCode = priceCode;
  }

  public int getPriceCode() {
      return _priceCode;
  }

  public void setPriceCode(int arg) {
      _priceCode = arg;
  }

  public String getTitle (){
      return _title;
  }

  public double getCharge(int daysRented){
       //Adicionar o trecho de código extraído.
    //Adicionar o trecho de código extraído.
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

  public int getFrequentRenterPoints(int daysRented){
    //Adicionar o trecho de código extraído.
    _frequentRenterPoints ++;
    // add bonus for a two day new release rental
        if ((_each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
            _each.getDaysRented() > 1) _frequentRenterPoints ++;
    return _frequentRenterPoints;
   }  
}