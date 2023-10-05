import java.util.Scanner;
public class Pizza_menu {
public static void main(String[]args) {
    int Large_pizzaPan=100;
    int small_pizzaPan=80;
    int medium_pizzaPan=50;
    double Tomatoes_slices=0.10;
    double pickles=0.5;
    double  potatoes=0.6;
    double  costumer_discount=1.0;
    Scanner user_input= new Scanner(System.in );
    System.out.println("welcome to victory junior resturant pizza input your first name your first name? ");
    String  userName = user_input.nextLine();
    System.out.println("welcome "+userName+" what size of pizza do you want? \nLarge--> (1)\nMedium-->(2)\nSmall-->(3)");
    int Pizza_size= user_input.nextInt();
    System.out.println("do you want Toppings:true-->(1)/false-->(2) ?");
    int  Toppings= user_input.nextInt();
    // if the user name is true,topping true and pizza is sized large
   if ((userName.equalsIgnoreCase("victory")||userName.equalsIgnoreCase("juinor"))&&(Toppings==1)&&(Pizza_size==1)) {
           System.out.println("choose your toppings \npickles-->(1)\npotatoes-->(2),\nTomatoes-->(3)");
        if ( Toppings==1) {
            double Total= Large_pizzaPan+pickles;
            double DiscountCal=Total*costumer_discount;
            double Alltogether = Total-DiscountCal;
            System.out.println("pickles is added");
              System.out.println("your total amount is $"+Alltogether);
            }else if(Toppings==3) {
                System.out.print(" tomatoes is added");
                double Total=Large_pizzaPan+Tomatoes_slices;
                double DiscountCal=Total*costumer_discount;
                double Alltogether = Total-DiscountCal;
                 System.out.println("your total amount is $"+Alltogether);
            }else if (Toppings==2) {
                System.out.print("potatoes is added");
                double Total=Large_pizzaPan+potatoes;
                double DiscountCal=Total*costumer_discount;
                double Alltogether = Total-DiscountCal;
                System.out.println("your total amount is $"+Alltogether);
            }
   }else if ((userName.equalsIgnoreCase("victory")||userName.equalsIgnoreCase("junior"))&&(Toppings==1 )&&(Pizza_size==3)) {
              System.out.println("username is the same toppings is true  and pizza size is small up");
              System.out.println("choose your toppings \npickles-->(1)\npotatoes-->(2),\nTomatoes-->(3)");
            int cToppings = user_input.nextInt();
          if(Toppings==1) {
             double Total= small_pizzaPan+pickles;
              double DiscountCal=Total*costumer_discount;
              double Alltogether =Total-DiscountCal;
              System.out.println("pickles is added");
               System.out.println("your total amount is $"+Alltogether);
            
            
              }else if (Toppings==2) {
                System.out.print("potatoes is added");
                double Total=small_pizzaPan+potatoes;
               double DiscountCal=Total*costumer_discount;
               double Alltogether = Total-DiscountCal;
                 System.out.println("your total amount is $"+Alltogether);
             }else if(Toppings==3) {
              System.out.print(" Tomatoes is added");
              double Total=small_pizzaPan+Tomatoes_slices;
              double DiscountCal=Total*costumer_discount;
              double Alltogether = Total-DiscountCal;
               System.out.println("your total amount is $"+Alltogether);
            }else {
             System.out.println("kindly  input the right selection and start again");
            } 
        
   }else if ((userName.equalsIgnoreCase("victory")||userName.equalsIgnoreCase("junior"))&&(Toppings==1)&&(Pizza_size==2)) {
            System.out.println("username is the same toppings is true and pizza size is medium");
        System.out.println("choose your toppings \npickles-->(1)\npotatoes-->(2),\nTomatoes-->(3)");
          int cToppings = user_input.nextInt();
        if(Toppings==1) {
                double Total= medium_pizzaPan+pickles;
             double DiscountCal=Total*costumer_discount;
             double Alltogether =Total-DiscountCal;
                 System.out.println("pickles is added");
    
            System.out.println("your total amount is $"+Alltogether);
           
        }else if(Toppings==3) {
           System.out.print(" Tomatoes is added");
            double Total=medium_pizzaPan+Tomatoes_slices;
            double DiscountCal=Total*costumer_discount;
           double Alltogether = Total-DiscountCal;
          System.out.println("your total is"+Total+"\nyour discout price is $"+Alltogether);
        }else if (Toppings==2) {
           System.out.print("potatoes is added");
            double Total=medium_pizzaPan+potatoes;
            double DiscountCal=Total*costumer_discount;
           double Alltogether = Total-DiscountCal;
           System.out.println("your total is"+Total+"\nyour discout price is $"+Alltogether);
         }else {
            System.out.println("incorrect input !!! start again");
        }
        
    //no name and also toppings true and  also pizza is large
   }else if (Toppings==1 && Pizza_size==1) {
           System.out.println("choose your toppings \npickles-->(1)\npotatoes-->(2),\nTomatoes-->(3)");
        int uToppings = user_input.nextInt();
    
        if(Toppings==1) {
           System.out.println("pickles is added");;
          double Total= Large_pizzaPan+pickles;
          System.out.println("no discount avaliable at this time pay"+Total+" thank you :)");  
             }else if (uToppings==2) {
             System.out.print("potatoes is added");
             double Total= Large_pizzaPan+potatoes;
             System.out.println("no discount avaliable at this time pay"+Total+" thank you :)");
        
            }else if(uToppings==3) {
              System.out.print(" Tomatoes is added");
            double Total=Large_pizzaPan+Tomatoes_slices;
              System.out.println("no discount avaliable at this time pay"+Total+" thank you :)");
             }else {
            System.out.println("kindly  input the right selection and start again");
        }
    // name is not true and pizza_size is medium and toppings is true
  }else if (Toppings==1 && Pizza_size==2) {
           System.out.println("choose your toppings \npickles-->(1)\npotatoes (2),\nTomatoes (3)");
        int vToppings = user_input.nextInt();
    
        if(vToppings==1) {
          System.out.println("pickles is added");
          double Total= medium_pizzaPan+pickles;
          System.out.println("no discount avaliable at this time pay "+Total+" thank you :)");   
        }else if (vToppings==2) {
         System.out.print("potatoes is added");
         double Total= medium_pizzaPan+potatoes;
         System.out.println("no discount avaliable at this time pay "+Total+" thank you :)");
        }else if(vToppings==3) {
             System.out.print(" Tomatoes is added");
            double Total=medium_pizzaPan+Tomatoes_slices;
            System. out.println("no discount avaliable at this time pay "+Total+" thank you :)");
        }else {
        System.out.println("kindly  input the right selection and start again");
          }
     // no name  and also topings is  true and pizza is small
  }else if (Toppings==1 && Pizza_size==3) {
         System.out.println("choose your toppings \npickles-->(1)\npotatoes-->(2),\nTomatoes-->(3)");
        int xToppings = user_input.nextInt();

        if(xToppings==1) {
           System.out.println("pickles is added");
          double Total= small_pizzaPan+pickles;
          System.out.println("no discount avaliable at this time pay "+Total+" thank you :)");
      
        }else if (xToppings==2) {
         System.out.print("potatoes is added");
         double Total= small_pizzaPan+potatoes;
         System.out.println("no discount avaliable at this time pay "+Total+" thank you :)");
        }else if(xToppings==3) {
           System.out.print(" Tomatoes is added");
            double Total=small_pizzaPan+Tomatoes_slices;
            System.out.println("no discount avaliable at this time pay "+Total+" thank you :)");
        }else {
        System.out.println("kindly  input the right selection and start again");
       }
  }else if ((userName.equalsIgnoreCase("victory")||userName.equalsIgnoreCase("junior"))&&(Toppings==2)&&(Pizza_size==1)) {
            double Total=Large_pizzaPan*costumer_discount;
            double discount=Large_pizzaPan-Total;
            System.out.println("Thank your large pizza is $"+Large_pizzaPan+" \nyour discount is "+ discount+" :)");   
  }else if ((userName.equalsIgnoreCase("victory")||userName.equalsIgnoreCase("junior"))&&(Toppings==2)&&(Pizza_size==2)) {
      double Total=medium_pizzaPan*costumer_discount;
      double discount=medium_pizzaPan-Total;
      System.out.println("Thank your medium pizza is $"+medium_pizzaPan+" \nyour discount is "+ discount+" :)");
  }else if ((userName.equalsIgnoreCase("victory")||userName.equalsIgnoreCase("junior"))&&(Toppings==2)&&(Pizza_size==3)) {
      double Total=small_pizzaPan*costumer_discount;
      double discount=small_pizzaPan-Total;
      System.out.println("Thank your small pizza is $"+small_pizzaPan+" \nyour discount is "+ discount+" :)");
    //name is not true toppings is not true and pizza is large
  }else if((Toppings==2)&&(Pizza_size==1)) {
         System.out.println("Thank your large pizza is $"+Large_pizzaPan);
  }else if((Toppings==2)&&(Pizza_size==2)) {
         System.out.println("Thank your large pizza is $"+medium_pizzaPan);
  }else if((Toppings==2)&&(Pizza_size==3)) {
         System.out.println("Thank your large pizza is $"+small_pizzaPan);
  }else {
      System.out.println("kindly re lunch the app and input ");
  }
  }
}







































