package oop;
import oop.*;
import java.io.*;

public class sweaters extends cart{
private String color;
private double stockstock;
private String clothing;
private double price;

public sweaters (String name ,String strclothing2,String strcolor2,double stock2){
 super(name);
 this.clothing = strclothing2;
 this.color = strcolor2;
 this.stockstock = stock2;
 if (clothing.equals("hoodie")){
    price = 20;
 }
}
public void puttingincart(){
  System.out.println("putting all shirts into cart");
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