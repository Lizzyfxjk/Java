class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
  // Invoke the functions below
  
    System.out.println(getUsername("lizzyfxjk1@gmail.com"));

    System.out.println(splitReverse("Happy For Ever"));
    System.out.println(splitReverse("For Life"));

    System.out.println(createUsername("Liz", "Guallpa", "264782556"));
    System.out.println(createUsername("Jonathan", "Guallpa", "267598267"));

    
  }
  /*
    Problem 1:
    Write a function getUsername() that accepts an email and returns the user name. Example: joexyz@gmail.com ==> joexyz
    */
    String getUsername(String email){
      int pos = email.indexOf("@");
      return email.substring(0);
    }
      
    //Problem 2:
    //Write a function splitReverse() that accepts a string and returns a new string made up of the second half followed by the first half of the original string.  Example: "Happy Days" ==> " DaysHappy"

    String splitReverse(String s){
      int middle = s.length()/2;
      return s.substring(middle) + s.substring(0, middle);
    }
      
    //Problem 3:
   // Write a function createUsername() that accepts a first name, last name and OSIS number and returns the first letter of the first name, the full lastname and the last four characters of the OSIS. Example: John Doe 123456789 ==> "JDoe6789"
    
    String createUsername(String firstName, String lastName, String osis){
      return firstName.substring(0,1) + lastName + osis.substring(osis.length() -4);
  }
}