package oop;
import oop.*;
import java.io.*;
/**
* A description of your method
*
* Child class of the parent class cart this defines the object pants.
* @author Addison Chan
*/

public class pants extends cart{
  //private variables
  private String color;
  private String clothing;
  private double price1;
/**
* A description of your method
*
* @param name varaible for the name of the item
* @param strclothing variable for the type of clothing 
* @param strcolor variable for the color of the product
* @param stock variable for the stock of products
* 
*/
  public pants (String name ,String strclothing, String strcolor,double price){
    super(name);
    this.clothing = strclothing;
    this.color = strcolor;
    this.price1 = price;
    
}
 

/**
* A description of your method
*
* @return color returns the color pants

*/
  public String getcolor(){
    return this.color;
}
/**
* A description of your method
*
* @return price returns the price of the product
*/
  public double getprice(){
    return this.price1;
}

/**
* A description of your method
*
* @return getcartitems which gets the current items and in the price in the cart
*/
  public void getcartitems(){
    System.out.println(super.getname()+" $"+this.price1);
  }

}