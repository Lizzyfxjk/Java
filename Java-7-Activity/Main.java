
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/* For each of the challenges below:
    a) declare the variables, 
    b) ask the user for the variable values, 
    c) write the specified equation, and 
    d) display the equation value.
*/    
 
//    Challenge 1:  See file Actvy7_Eq1  (done for you)
      System.out.println("Enter the value for x ");
      double x =Input.readDouble();
      double y = Math.pow(x,7);
      System.out.println("Value of y is "+y);   
  
//    Challenge 2:  See file Actvy7_Eq2
      System.out.println("Enter the value for a");
      double a = Input.readDouble();
      System.out.println("Enter the value for b");
      double b = Input.readDouble();
      double c = Math.sqrt(a+b);
      System.out.println("Value of c is "+c);
  
//    Challenge 3:  See file Actvy7_Eq3
      System.out.println("Enter the value for a z");
      double z = Input.readDouble(z,3)+ 5;
      double q = Math.pow(z,3)+5;
      System.out.println("Value of q is "+q);
  
//    Challenge 4:  See file Actvy7_Eq4
  

//    Challenge 5:  See file Actvy7_Eq5
    
  
//    Challenge 6:  See file Actvy7_Eq6


//    Challenge 7:  See file Actvy7_Eq7    (HINT: What does the "plus minus: after "-b" mean?)

    

    // **************************************************
    // ******** Don't write any code below here. ********
    // **************************************************
  }
}