package oop;
import java.util.ArrayList;

import oop.*;

public class items{
  private String emails;
  private double total;
  private ArrayList<cart> ordercart; 
public items(String email){
  this.emails = email;
  this.total = 0;
  ordercart= new ArrayList<cart>();
}
public void addtocart(cart newcartitem){
  ordercart.add(newcartitem);

}
public void removecart(cart previouscart){
  int intcount;
  for(intcount =0;intcount<ordercart.size();intcount++){
    if(ordercart.get(intcount).equals(previouscart)){
      ordercart.remove(intcount);
    }
  }
 
}
public String getemail(){
  return this.emails;
}
public void totals(){
  int intcount;
  for(intcount = 0; intcount < ordercart.size();intcount++){
    this.total += ordercart.get(intcount).getprice() ;
  }
}
public void gettotals(){
  totals();
  System.out.println("subtotal: "+ Math.round((total)*100/100));
  System.out.println("tax: "+ Math.round((total*0.13)*100/100));
  System.out.println("total: "+ Math.round((total*1.13)*100)/100);
}
}