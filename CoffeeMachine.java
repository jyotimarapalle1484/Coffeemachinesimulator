import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
	
		      Scanner se=new Scanner(System.in);
		      int ch,ch1=0,ch2=0;
		      int Latte=90,Cappuccino=110,Espresso=150;
		      int water,milk,sugar,coffee;
		      int totalmilk=200,totalwater=50,totalcoffee=5,totalsugar=10;
		      int totalbill;

		      while(true)
		      {
		        System.out.println("1.Buy coffees");
		        System.out.println("2.Fill items");
		        System.out.println("3.Take bill");
		        System.out.println("4.Remaining items");
		        System.out.println("Enter your choice");
		        ch=se.nextInt();

		      switch(ch)
		      {
		      case 1:
		          while(true)
		           {
		        	  System.out.println("Menu:");
		        	  System.out.println("coffee         price");                             
		              System.out.println("1.Latte      = 90/-");
		              System.out.println("2.Cappuccino = 110/-");
		              System.out.println("3.Espresso   = 150/-");
		               ch1=se.nextInt();

		      switch(ch1)
		        {
		         case 1:
		                    System.out.println("How much cup of latte coffee you want to buy");
		                    ch1=se.nextInt();
		                    break;
		         case 2:
		                    System.out.println("How much cup of cappuccino coffee you want to buy");
		                    ch1=se.nextInt();
		                    break;
		         case 3:
		                    System.out.println("How much cup of espresso coffee you want to buy");
		                    ch1=se.nextInt();
		                    break;
		          }
		          switch(ch2)
		             {
		          case 1:
		                    System.out.println("How much water you want to add in ml");
		                    ch2=se.nextInt();
		                    break;
		           case 2:
		                    System.out.println("How much coffee you want to add in cup");
		                    ch2=se.nextInt();
		                    break;
		           case 3:
		                    System.out.println("How much sugar you want to add in gm");
		                    ch2=se.nextInt();
		                    break;
		           case 4:
		                    System.out.println("How much milk you want to add in ml ");
		                    ch2=se.nextInt();
		                    break;
		                  }
		              System.out.println("You fill the water in ml=");
		              System.out.println("You fill the coffee in ml=");
		              System.out.println("You fill the sugar in gm=");
		              System.out.println("You fill the milk in ml=");
		              System.out.println("If you want to continue press 1 and for exit press 0");
		         
		              //Totalbill
	                   totalbill=(Latte*90)+(Cappuccino*110)+(Espresso*150);
	                   System.out.println("Your bill is=");
	                   System.out.println("If you want to continue press 1 and for exit press 0");
		              ch2=se.nextInt();
		             if(ch2==0)
		             {
		               break;
		             }
		             break;
		            
		              
		                }
		              }
		            }
		           }
}

		                   

	
