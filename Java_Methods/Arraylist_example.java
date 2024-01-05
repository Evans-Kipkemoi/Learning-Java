import java.util.ArrayList;

public class Main { 
  public static void main(String[] args) { 
    ArrayList<String> fruits = new ArrayList<String>();
    fruits.add("Oranges");
    fruits.add("Apples");
    fruits.add("Bananas");
    fruits.add("Pineapples");
    System.out.println(fruits);

    //fruits.get(0); Accesss an item
    //fruits.set(0, "Avocadoes"); Change item
    //fruits.remove(0); remove an item
    //fruits.clear(); Remove all elements
    
    //Loop through ArrayList
    //For Loop
    for (int i - 0; < fruits.size(); i++) {
	System.out.println(fruits.get(1));
    }
    //For-each
    for (String i : fruits) {
	  System.out.print(i);
    }




  } 
}
