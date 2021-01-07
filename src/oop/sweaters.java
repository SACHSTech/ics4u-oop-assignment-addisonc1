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
private double price;

/* A description of your method
*
* @param name the name of the shirt type
* @param strclothing2 the type clothing 
* @param strcolor2 the color of the product
* @param stock2 the stock of the product
*/
public sweaters (String name ,String strclothing2,String strcolor2,double stock2){
 super(name);
 this.clothing = strclothing2;
 this.color = strcolor2;
 this.stockstock = stock2;
 
 if (clothing.equals("hoodie")){
    price = 20;
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

}