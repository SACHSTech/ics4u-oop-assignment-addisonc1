package oop;
import oop.*;
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
  
  cart whitejoggers = new pants("whitejogger","joggers" ,"white", 10);
  cart blackshirts = new shirts("blackshirt","tshirt" ,"black", 10);
  cart blacksweaters = new sweaters("blacksweater","hoodie","black",10);

  items addison = new items("addison@gmail.com");
  addison.addtocart(whitejoggers);
  addison.addtocart(blacksweaters);
  
  addison.gettotals();
  }
  
}