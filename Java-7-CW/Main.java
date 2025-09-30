class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
  // For each problem below, prompt the user for the input values for each variable in the formula.
    
  /*
    Problem 1: Translate the formula from eq1.png.
  */

    double A = 2.5, z = 0, x = 30;
    z = Math.pow(A, 2*x+1);
    System.out.println("#1 : z = "+z);


    
  /*
    Problem 2: Translate the formula from eq2.png.
  */

    double y = 0;
    y = 2*x/(Math.sin(2 * Math.toRadians(x)));
    System.out.println("#2 : y = "+y);
    
    /*
    Problem 3: Translate the formula from eq3.png.
  */
    double B = 0;
    B = Math.abs(Math.pow(x,2)+ 1);
    System.out.println("#3 : B =" +B);
    

  }

  
}