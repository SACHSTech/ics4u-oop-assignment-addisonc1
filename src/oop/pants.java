package oop;
import oop.*;
import java.io.*;

public class pants extends cart{
private String color;
private double stockstock;
private String clothing;
public pants (String name ,String strclothing,String strcolor,double dblprice,double stock){
 super(name);
 this.clothing = strclothing;
 this.strcolor = color;
 this.stockstock = stock;
 if (clothing.equals("joggers")){
   dblprice = 15;
 }
}
//returning the stock
public double getstock(){
  return this.stockstock;
}
//returning color
public String getcolor(){
  return this.strcolor;
}
  
  
}