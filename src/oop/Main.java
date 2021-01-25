package oop;
import oop.*;
import java.io.*;
import java.util.ArrayList; 
/**
* A description of your method
*
* main method that gives the examples to test the code 
*/
public class Main{
  public static void main(String[] args) throws IOException{


    //all items
    pants whitejoggers = new pants("whitejogger","joggers" ,"white", 15);
    pants blackjoggers = new pants("blackjogger","joggers" ,"black", 15);
    pants greenjoggers = new pants("greenjogger","joggers" ,"green", 15);
    pants bluejeans = new pants("bluejeans","jeans" ,"blue", 17);
    shirts blackshirts = new shirts("blackshirt","tshirt" ,"black", 8);
    shirts greyshirts = new shirts("greyshirt","tshirt" ,"grey", 8);
    shirts whiteshirts = new shirts("whiteshirt","tshirt" ,"white", 8);
    shirts whitelongsleeve = new shirts("whitelongsleeveshirt","longsleeveshirt" ,"white", 10);
    sweaters blackhoodies = new sweaters("blackhoodie","hoodie","black",20);
    sweaters whitehoodies = new sweaters("whitehoodie","hoodie","white",20);
    sweaters bluehoodies = new sweaters("bluehoodie","hoodie","blue",20);
    sweaters christmassweater = new sweaters("christmassweater","sweater","christmas",25);
  
  
    //the cart items
    items john = new items("john@gmail.com");
    john.email();
    john.addtocart(blackjoggers);
    john.addtocart(bluehoodies);
    john.addtocart(whitehoodies);
    john.addtocart(blackshirts);
    john.getcartitems();
    john.gettotals();

    items addison = new items("addison@gmail.com");
    addison.email();
    addison.addtocart(whitejoggers);
    addison.addtocart(blackhoodies);
    addison.addtocart(whitehoodies);
    addison.removecart(whitehoodies);
    addison.addtocart(christmassweater);
    addison.getcartitems();
    addison.gettotals();
  }
  
}