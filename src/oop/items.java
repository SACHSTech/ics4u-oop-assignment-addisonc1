package oop;
import java.util.ArrayList;

import oop.*;
/**
* A description of your method
*
* this would get the items and it would add to cart the item or remove. It also caculates the total of the prices of the items.
*/
public class items{
  //varaibles
  private String emails;
  private double total;
  private ArrayList<cart> ordercart; 
  /**
* A description of your method
*
* @param email this gives the email of the customer
* 
*/
public items(String email){
  this.emails = email;
  this.total = 0;
  ordercart= new ArrayList<cart>();
}
/**
* A description of your method
*
* @param getemail gets the email of the shopper
*/
public String getemail(){
  return this.emails;
}
/**
* A description of your method
*
* @param email prints out the shoppers email
*/
public void email(){
  System.out.println(this.emails);
}
/**
* A description of your method
*
* @param newcartitem this would add into the array list which would put it into the cart
*/
public void addtocart(cart newcartitem){
  ordercart.add(newcartitem);

}
/**
* A description of your method
*
* @param previouscart this would remove an item from the cart which has been put into the cart
*/
public void removecart(cart previouscart){
  int intcount;
  for(intcount =0;intcount<ordercart.size();intcount++){
    if(ordercart.get(intcount).equals(previouscart)){
      ordercart.remove(intcount);
    }
  }
 
}

/**
* A description of your method
*
* this would give the total of the prices in the cart
*/
public void totals(){
  int intcount;
  for(intcount = 0; intcount < ordercart.size();intcount++){
    this.total += ordercart.get(intcount).getprice() ;
  }
}

/**
* A description of your method
*
* this would give subtotal the tax and total amount that would cost for the items.
*/
public void gettotals(){
  totals();
  System.out.println("subtotal: "+ Math.round((total)*100/100));
  System.out.println("tax: "+ Math.round((total*0.13)*100/100));
  System.out.println("total: "+ Math.round((total*1.13)*100)/100);
  System.out.println(" ");
}

/**
* A description of your method
*
* this would give what is in your cart right now
*/
public void getcartitems(){
  int intcount;
  for(intcount = 0;intcount< ordercart.size();intcount++){
    ordercart.get(intcount).getcartitems();
  }
}

}