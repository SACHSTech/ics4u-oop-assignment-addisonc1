package oop;

import oop.*;

import java.io.*;

public class pants extends cart{

  private String color;
  private double stockstock;
  private String clothing;
  
  private double price;

  public pants (String name ,String strclothing, String strcolor,double stock){
    super(name);
    this.clothing = strclothing;
    this.color = strcolor;
    this.stockstock = stock;
    if (clothing.equals("joggers")){
    price = 15;
   
 }
}
  public void puttingincart(){
    System.out.println("putting all pants into cart");
}

//returning the stock
  public double getstock(){
    return this.stockstock;
}
//returning color
  public String getcolor(){
    return this.color;
}
  public double getprice(){
    return this.price;
}
  

}