class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    // create objects
  Car BMW = new Car("BMW", "M3", "Black", 2024, 85000);
  Car Porche = new Car("Porche", "GT3", "White", 2019, 150000);  

    // display brand, model and value of each car
  System.out.println(BMW.brand);
  System.out.println(BMW.model);
  System.out.println(BMW.value);
  System.out.println(Porche.brand);
  System.out.println(Porche.model);
  System.out.println(Porche.value);

    // Display brand and model of any car with value over 30,000
    print("\nCars with value exceeding $30,000:");
  if(Porche.value > 30000){
    System.out.println(Porche.brand);
    System.out.println(Porche.model);
  }  
	
	// Make BMW honk
	print("\nUsing car functions(behavior):");	
  BMW.honk();

    
  }

}