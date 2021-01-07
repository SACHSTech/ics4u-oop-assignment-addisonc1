package oop;
import oop.*;
import java.io.*;
/**
* A description of your method
*
*
* @author Addison Chan
*/

public class shirts extends cart{

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
* @param stock3 the 
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
* @return description of the return value
*/
  public double getstock(){
    return this.stockstock;
}
/**
* A description of your method
*
* @return description of the return value
*/

  public String getcolor(){
    return this.color;
}
/**
* A description of your method
*
* @return description of the return value
*/

  public double getprice(){
    return this.price;
}
  
}
