class Main {
  
  public static void main(String[] args) {
    (new Main()).init();
  }

  // Init function runs when the program begins.  

  void init(){
    // Number of cars
       int numOfCars = 20;
       System.out.println("number of cars" + numOfCars);
    // Investment amount in currency
       double invstmtAmt = 200.50;
       System.out.println("Investments amount in currency" + invstmtAmt);
    // Person's first name
       String name = "Mary";
       System.out.println("Person's first name" + name);
    // Is a game over?
       boolean isGameOver = false;
       System.out.println("Is game over" + isGameOver);
    // Store the first initial of a name
       char Initial = 'N';
       System.out.println("Store the first initial" + Initial);
    // Maximum number of customers in a theater (declare as a constant)
       final int MaxCust = 500;
       System.out.println("Maximum number of customers" + MaxCust);

  }

  
}