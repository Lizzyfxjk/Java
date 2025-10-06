class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  // define the functions
    void madlib(String noun, String adj, String verb){
      System.out.println("The " + adj + " " + noun + " " + verb);
    }

    double areaOfSquare(double s){
      return s*s;
    }
  

    double areaOfCircle(double radius){
      return Math.PI*Math.pow(radius,6);
    }
  void init(){
    // call the functions
    madlib("dog", "furry", "ran");

    }

    double result = areaSq(2.5);
    System.out.println("Area is" + result);

    double result = areaOfCircle(6);
    System.out.println("Area is" + result);{
      
    }