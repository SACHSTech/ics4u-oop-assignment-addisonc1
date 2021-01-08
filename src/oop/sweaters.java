package oop;
import oop.*;
import java.io.*;
/**
* A description of your method
*
*Another child class for the parent class cart this makes the sweaters objects 
* @author Addison Chan
*/

public class sweaters extends cart{
//varaibles
private String color;
private double stockstock;
private String clothing;
private double price1;

/* A description of your method
*
* @param name the name of the shirt type
* @param strclothing2 the type clothing 
* @param strcolor2 the color of the product
* @param stock2 the stock of the product
*/
public sweaters (String name ,String strclothing,String strcolor,double price){
 super(name);
 this.clothing = strclothing;
 this.color = strcolor;
 
 this.price1=price;
 
 
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
    return this.price1;
}

/**
* A description of your method
*
* @return getcartitems which gets the current items in the cart and the price
*/
  public void getcartitems(){
    System.out.println(super.getname()+" $"+this.price1);
  }
}