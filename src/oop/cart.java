package oop;
import oop.*;

public abstract class cart{
private String names;
public cart(String name){
  this.names = name;
  


}
public String getname(){
  return this.names;
}
public abstract double getprice();
public abstract double getstock();
public abstract String getcolor();
}
