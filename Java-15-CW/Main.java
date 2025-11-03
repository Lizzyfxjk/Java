class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
String msg = Input.readFile("paragraph.txt");
    print(numOfWords(msg) + " words");   
    print(countVowels(msg) + " vowels");  

  }
  /* 1:   Write a function approxPI() that accepts a value for a # of terms and approximates the value of PI. (See the general forumula described in the file PI.png)

    Example: if # of terms = 5,
    approxPI = 4(1 - 1/3 + 1/5 - 1/7 + 1/9) = 3.3396825396825403
  */
int numOfWords(String s){
  int count = 1;
  for (int x = 0; x<=s.length()-1; x++){
    String sym = s.substring(x, x+1);
    if (sym.equals(" "))
      count++;
  }
  return count;
}

  
  /* 2:  In order to get a more accurate approximation of PI (say, to the thousandths place), run your loop pasing multiples of ten from 100 through 100000 for the # of terms).
  */
it countVolumes(String s){
  for (int x = 0; x<=s,length()-1; x++){
    String ch = s.substring(x, x+1);
    if (ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") || ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o") || ch.equalsIgnoreCase("u"))
    count++;
  }
  return count;
} 
  
}