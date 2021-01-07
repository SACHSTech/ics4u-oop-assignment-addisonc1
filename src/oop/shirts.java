package oop;
import oop.*;
import java.io.*;
/**
* A description of your method
*
*Another child class for the parent class cart this file also makes the object shirts into one
* @author Addison Chan
*/

public class shirts extends cart{
  //varaibles
  private String color;
  private double stockstock;
  private String clothing;
  private double price;
 /**
* A description of your method
*
* @param name the name of the shirt type
* @param strclothing3 the type clothing 
* @param strcolor3 the color of the product
* @param stock3 the stock of the product
*/

  public shirts (String name ,String strclothing3, String strcolor3,double stock3){
    super(name);
    this.clothing = strclothing3;
    this.color = strcolor3;
    this.stockstock = stock3;
    
    if (clothing.equals("tshirt")){
    price = 8;
 }
}
  

/**
* A description of your method
*
* @return stockstock returns the stock number
*/
  public double getstock(){
    return this.stockstock;
}
/**
* A description of your method
*
* @return color returns the color of the product
*/

  public String getcolor(){
    return this.color;
}
/**
* A description of your method
*
* @return price returns the price of the item
*/

  public double getprice(){
    return this.price;
}

/**
* A description of your method
*
* @return getcartitems which gets the current items in the cart
*/
  public void getcartitems(){
    System.out.println(super.getname()+"");
  }
}
