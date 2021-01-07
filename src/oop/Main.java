package oop;
import oop.*;
import java.io.*;
/**
* A description of your method
*
* main method that gives the examples to test the code 
*/
public class Main{
  public static void main(String[] args) throws IOException{
    //catalog
    System.out.println("Pants:");
    System.out.println("Joggers");
    System.out.println("Color: white,black,green");
    System.out.println("Stock:10");
    System.out.println("price:$15");
    System.out.println("");
    System.out.println("Jeans");
    System.out.println("Color: Blue");
    System.out.println("Stock:10");
    System.out.println("price:$17");
    System.out.println("");
    System.out.println("Shirts:");
    System.out.println("Tshirt");
    System.out.println("Color:black,grey,white");
    System.out.println("Stock:10");
    System.out.println("price: $8");
    System.out.println("");
    System.out.println("Longsleeve Shirt");
    System.out.println("Color:white");
    System.out.println("Stock:10");
    System.out.println("price:$10");
    System.out.println("");
    System.out.println("Sweaters:");
    System.out.println("hoodies");
    System.out.println("Color:black,white,blue");
    System.out.println("Stock:10");
    System.out.println("price:$20");
    System.out.println("");
    System.out.println("Christmas Sweater");
    System.out.println("Color:Christmas");
    System.out.println("Stock:10");
    System.out.println("price:$25");
    System.out.println("");
    
    //all items
    pants whitejoggers = new pants("whitejogger","joggers" ,"white", 10);
    pants blackjoggers = new pants("blackjogger","joggers" ,"black", 10);
    pants greenjoggers = new pants("greenjogger","joggers" ,"green", 10);
    pants bluejeans = new pants("bluejeans","jeans" ,"blue", 10);
    shirts blackshirts = new shirts("blackshirt","tshirt" ,"black", 10);
    shirts greyshirts = new shirts("greyshirt","tshirt" ,"grey", 10);
    shirts whiteshirts = new shirts("whiteshirt","tshirt" ,"white", 10);
    shirts whitelongsleeve = new shirts("whitelongsleeveshirt","longsleeveshirt" ,"white", 10);
    sweaters blacksweaters = new sweaters("blacksweater","hoodie","black",10);
    sweaters whitesweaters = new sweaters("whitesweater","hoodie","white",10);
    sweaters bluesweaters = new sweaters("bluesweater","hoodie","blue",10);
    sweaters christmassweater = new sweaters("christmassweater","sweater","christmas",10);

    //the cart items
    items addison = new items("addison@gmail.com");
  
    addison.addtocart(whitejoggers);
    addison.addtocart(blacksweaters);
    addison.getcartitems();
    addison.gettotals();
  }
  
}