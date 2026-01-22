class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){

	//3: create 3 new item objects
	CartItem Banana = new CartItem("Banana", 2.99, 2, false);
	CartItem Chips = new CartItem("Chips", 3.00, 5, true);
	CartItem Cookies = new CartItem("Cookies", 3.50, 1, true);

	//4: display name & original price of items that are on sale
	Sytem.out.println(Chips.itemName);
  System.out.println(Chips.itemPrice);
  Sytem.out.println(Cookies.itemName);
  System.out.println(Cookies.itemPrice);
	//5: subtotal (for all quantities of all items in cart, using discounted prices)
	double subtotal = Banana.getPrice()*Banana.quantity + Chips.getPrice()*Chips.quantity + Cookies.getPrice()*Cookies.quantity;
	// display subtotal, tax and total
  double tax = subtotal * 8.875/100;
  double total = subtotal + tax;  
  }

}