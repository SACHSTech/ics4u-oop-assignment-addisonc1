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
  private double stockstock;
  private String clothing;
  private double price;
/**
* A description of your method
*
* @param name varaible for the name of the item
* @param strclothing variable for the type of clothing 
* @param strcolor variable for the color of the product
* @param stock variable for the stock of products
* 
*/
  public pants (String name ,String strclothing, String strcolor,double stock){
    super(name);
    this.clothing = strclothing;
    this.color = strcolor;
    this.stockstock = stock;
    if (clothing.equals("joggers")){
    price = 15;
   
 }
}
 
/**
* A description of your method
*
* @return stockstock the number of products in stock

*/
  public double getstock(){
    return this.stockstock;
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
    return this.price;
}
  

}