package oop;
import oop.*;
/**
* A description of your method
*
* this is the parent class cart which has all the chld classes which it gets its info from except the name 
*/
public abstract class cart{
  //varaible
private String names;
public cart(String name){
  this.names = name;
  


}
/**
* A description of your method
*
* @return names returns the name of the product
*/
public String getname(){
  return this.names;
}
/**
* A description of your method
*
* an abstract method that it gets from the child class which gets the price 
*/
public abstract double getprice();


/**
* A description of your method
*
* an abstract method that gets from the child class which it gets the color of the item from the child class
*/
public abstract String getcolor();

public abstract void getcartitems();
}
