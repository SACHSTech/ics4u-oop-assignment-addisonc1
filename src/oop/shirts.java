package oop;
import oop.*;
import java.io.*;

public class shirts extends cart{

  private String color;
  private double stockstock;
  private String clothing;
  
  private double price;

  public shirts (String name ,String strclothing3, String strcolor3,double stock3){
    super(name);
    this.clothing = strclothing3;
    this.color = strcolor3;
    this.stockstock = stock3;
    if (clothing.equals("tshirt")){
    price = 8;
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
