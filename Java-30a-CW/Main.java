class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // create 3 dogs
  Dog Scooby = new Dog("Golden Retriever", 4, "Scooby");
  Dog Clifford = new Dog("Australian Shepord", 2, "Clifford");
  Dog Snoopy = new Dog("Dobermann", 1, "Snoopy");

    // display object property values
  System.out.println(Scooby.breed);
  System.out.println(Clifford.age);
  System.out.println(Snoopy.name);
    
    // invoke object behaviors(functions)
  Scooby.bark();
  Clifford.bark();
  Snoopy.bark(); 
    
  }

  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}