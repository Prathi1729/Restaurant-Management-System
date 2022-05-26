/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author veniniyan
 */

import java.util.*;
class Restaurant
{
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);        
int check=0;
int bill=0;
double dis=0;
System.out.println("                            $$$$$$  Welcome to Domino's Pizza  $$$$$$      ");
System.out.println("                               We have all types of Pizza,Sir!");
System.out.println("                              Pepperoni!,Exotica!,Paneer punjabi!...");
System.out.println("                             We have World Delecious Country feast");
System.out.println("                              We to have Special offer also,Sir");
System.out.println("                        Today's Speacial!Today's Speacial!Today's Speacial!...");
System.out.println("                               Spicy paneer,Tandoori,Veggie crunch");
System.out.println("                                We have Special offer also,Sir!");

System.out.println("Sir!special offer.......");  
System.out.println("Rs.500    to   Rs.1000  ---- > Discount is 5%");
System.out.println("Rs.1001   to   Rs.5000  ---- > Discount is 10%");
System.out.println("Rs.5001   to   Rs.10000 ---- > Discount is 15%");
System.out.println("Rs.10001  and  Above    ---- > Discount is 20%");

for(;;)
{
System.out.println("");
System.out.println("1.Pizza,2.Burger,3.Beverages");
System.out.println("Sir!if you want to Stop shooping Enter 0");
System.out.println("Choose any one from this menu,Sir!");
System.out.println("");
int a=sc.nextInt();

if(a>=19)
       {
           System.out.println("Sir!Wrong option");
           break;
        }
        
System.out.println("");

if(a==0)
break;


switch(a)
{       
case 1:System.out.println("********************* PIZZA *********************");
       System.out.println("");
       System.out.println("              Sir!you have Veg in Pizza                 ");
       System.out.println("         Here We have Some Types of Pizza in Menu            ");
       System.out.println("");
       System.out.println("    Veg Pizza        Small     Medium     Large");
       System.out.println("");
       System.out.println("1. Simple veg        Rs.50     Rs.95      Rs.195");
       System.out.println("2. Veggie crunch     Rs.50     Rs.95      Rs.195");
       System.out.println("3. Cheesy cheese     Rs.70     Rs.130     Rs.230");                          
       System.out.println("4. Veggie lover      Rs.70     Rs.130     Rs.230");
       System.out.println("5. Spicy indian      Rs.70     Rs.185     Rs.230");
       System.out.println("6. Country feast     Rs.95     Rs.185     Rs.285");
       System.out.println("7. Spicy paneer      Rs.95     Rs.185     Rs.285");
       System.out.println("8. Veggie supreme    Rs.95     Rs.185     Rs.285");
       System.out.println("9. Exotica           Rs.95     Rs.185     Rs.285");
       System.out.println("10.Paneer punjabi    Rs.95     Rs.185     Rs.280");
       System.out.println("");
       
       System.out.println("             Sir!you have Non-Veg in Pizza                 ");
       System.out.println("        Here We have Some Types of Pizza in Menu            ");
       System.out.println("");
       System.out.println("Non veg Pizza        Small         Medium      Large");
       System.out.println("");
       System.out.println("11.Teekha chicken     Rs.70         Rs.130      Rs.230");
       System.out.println("12.Chicken tikka      Rs.90         Rs.175      Rs.275");
       System.out.println("13.Chick 'n' spicy    Rs.90         Rs.175      Rs.275");
       System.out.println("14.Murg mazedar       Rs.90         Rs.175      Rs.275");
       System.out.println("15.Supreme tandoori   Rs.90         Rs.175      Rs.275");
       System.out.println("16.Chicken supreme    Rs.110        Rs.195      Rs.295");
       System.out.println("17.Pepperoni          Rs.110        Rs.195      Rs.295");
       System.out.println("18.Mutton supreme     Rs.110        Rs.195      Rs.295");
       System.out.println("");
       
       for(;;)
       {
       System.out.println("Sir!please Enter the Numbered Pizza,which you want to buy");
       int c=sc.nextInt();
       
       if(c>=19)
       {
           System.out.println("Sir!Wrong option");
           break;
        }
       System.out.println("");
       System.out.println("Sir!please Enter the size of Pizza,1.Small or 2.Medium or 3.Large Pizza,which you want to buy"); 
       int size=sc.nextInt();
       if(size>=4)
       {
           System.out.println("Sir!Wrong option");
           break;
        }
       System.out.println("");
       
       System.out.println("Sir!How many Pizza you want in that size?");
       int d=sc.nextInt();
       System.out.println("");
       
       
       if((c==1)&&(size==1))
       {
           bill+=(50*d);
           break;    
        }
       if((c==2)&&(size==2))
       {
           bill+=(95*d);
           break;    
        }
       if((c==3)&&(size==3))
       {
           bill+=(195*d);
           break;    
        }    
       if((c==2)&&(size==1))
       {
           bill+=(50*d);
           break;    
        }   
       if((c==2)&&(size==2))
       {
           bill+=(95*d);
           break;    
        }   
       if((c==2)&&(size==3))
       {
           bill+=(195*d);
           break;    
        }   
       if((c==3)&&(size==1))
       {
           bill+=(70*d);
           break;    
        }   
       if((c==3)&&(size==2))
       {
           bill+=(130*d);
           break;
        }
       if((c==3)&&(size==3))
        {
           bill+=(230*d);
           break;
        }   
       if((c==4)&&(size==1))
       {
           bill+=(70*d);
           break;
        }
       if((c==4)&&(size==2))
       {
           bill+=(130*d);
           break;
        }
       if((c==4)&&(size==3))
       {
           bill+=(230*d);
           break;
        }
       if((c==5)&&(size==1))
       {
           bill+=(70*d);
           break;
        }
       if((c==5)&&(size==2))
       {
           bill+=(185*d);
           break;
        }
       if((c==5)&&(size==3))
       {
           bill+=(230*d);
           break;
        }
       if((c==6)&&(size==1))
       {
           bill+=(95*d);
           break;
        }
       if((c==6)&&(size==2))
       {
           bill+=(185*d);
           break;
        }
       if((c==6)&&(size==3))
       {
           bill+=(285*d);
           break;
        }
       if((c==7)&&(size==1))
       {
           bill+=(95*d);
           break;
        }
       if((c==7)&&(size==2))
       {
           bill+=(185*d);
           break;
        }
       if((c==7)&&(size==3))
       {
           bill+=(285*d);
           break;
        }
       if((c==8)&&(size==1))
       {
           bill+=(95*d);
           break;
        }
       if((c==8)&&(size==2))
       {
           bill+=(185*d);
           break;
        }
       if((c==8)&&(size==3))
       {
           bill+=(285*d);
        }
       if((c==9)&&(size==1))
       {
           bill+=(95*d);
           break;
        }
       if((c==9)&&(size==2))
       {
           bill+=(185*d);
           break;
        }
       if((c==9)&&(size==3))
       {
           bill+=(285*d);
           break;
        }
       if((c==10)&&(size==1))
       {
           bill+=(95*d);
           break;
        }
       if((c==10)&&(size==2))
       {
           bill+=(185*d);
           break;
        }
       if((c==10)&&(size==3))
       {
           bill+=(280*d);
           break;
        }
       if((c==11)&&(size==1))
       {
           bill+=(70*d); 
           break;
        }
       if((c==11)&&(size==2))
       {
           bill+=(70*d); 
           break;
        }    
       if((c==11)&&(size==3))
       {
           bill+=(230*d);
           break;
        }
       if((c==12)&&(size==1))
       {
           bill+=(90*d);
           break;
        }
       if((c==12)&&(size==2))
       {
           bill+=(175*d);
           break;
        }
       if((c==12)&&(size==3))
       {
           bill+=(275*d);
           break;
        }
       if((c==13)&&(size==1))
       {
           bill+=(90*d);
           break;
        }
       if((c==13)&&(size==2))
       {
           bill+=(175*d);
           break;
        }
       if((c==14)&&(size==1))
       {
           bill+=(90*d);
           break;
        }
       if((c==14)&&(size==2))
       {
           bill+=(175*d);
           break;
        }
       if((c==14)&&(size==3))
       {
           bill+=(275*d);
           break;
        }
       if((c==15)&&(size==1))
       {
           bill+=(90*d);
           break;
        }
       if((c==15)&&(size==2))
       {
           bill+=(175*d);
           break; 
        }
       if((c==15)&&(size==3))
       {
           bill+=(275*d);
           break;
        }
       if((c==16)&&(size==1))
       {
           bill+=(110*d);
           break;
        }
       if((c==16)&&(size==2))
       {
           bill+=(195*d);
           break;
        }
       if((c==16)&&(size==3))
       {
           bill+=(295*d);
           break;
        }
       if((c==17)&&(size==1))
       {
           bill+=(110*d);
           break;
        }
       if((c==17)&&(size==2))
       {
           bill+=(195*d);
           break;
        }
       if((c==17)&&(size==3))
       {
           bill+=(295*d);
           break;
        }
       if((c==18)&&(size==1))
       {
           bill+=(110*d);
           break;
        }
       if((c==18)&&(size==2))
       {
           bill+=(195*d);
           break;
        }
       if((c==18)&&(size==3))
       {
           bill+=(295*d);
           break;
        }
    }
       break;
       

case 2:System.out.println("          ************** BURGER **************         ");
       System.out.println(""); 
       System.out.println("               Sir!Here you have Chosen Burger                 ");
       System.out.println("           Here We have Some Types of Pizza in Menu            ");
       System.out.println("");
       System.out.println("    Burger           Small     Medium     Large");
       System.out.println("");
       System.out.println("1. Simple Burger     Rs.50     Rs.95      Rs.195");
       System.out.println("2. Burg crunch       Rs.50     Rs.95      Rs.195");
       System.out.println("3. Cheesy Burg       Rs.70     Rs.130     Rs.230");                          
       System.out.println("4. Burger lover      Rs.70     Rs.130     Rs.230");
       System.out.println("5. Spicy Burg        Rs.70     Rs.185     Rs.230");
       System.out.println("6. Country Burg      Rs.95     Rs.185     Rs.285");
       System.out.println("7. Spicy  Burg       Rs.95     Rs.185     Rs.285");
       System.out.println("8. Burg supreme      Rs.95     Rs.185     Rs.285");
       System.out.println("9. Special Burg      Rs.95     Rs.185     Rs.285");
       System.out.println("10.Paneer Burg       Rs.95     Rs.185     Rs.280");
       System.out.println("");
      
       for(;;)
       {
       System.out.println("Sir!please Enter the Numbered Burger,which you want to buy");
       int sa=sc.nextInt();
       if(sa>=11)
       {
           System.out.println("Sir!Wrong option");
           break;
        }
       System.out.println("");
       System.out.println("Sir!please Enter the size of Pizza,1.Small or 2.Medium or 3.Large Pizza,which you want to buy"); 
       int sie=sc.nextInt();
       if(sie>=4)
       {
           System.out.println("Sir!Wrong option");
           break;
        }
       System.out.println("");
       System.out.println("Sir!How many Pizza you want in that size?");
       int d=sc.nextInt();
       System.out.println("");
       
       if((sa==1)&&(sie==1))
       {
           bill+=(50*d);
           break;    
        }
       if((sa==2)&&(sie==2))
       {
           bill+=(95*d);
           break;    
        }
       if((sa==3)&&(sie==3))
       {
           bill+=(195*d);
           break;    
        }    
       if((sa==2)&&(sie==1))
       {
           bill+=(50*d);
           break;    
        }   
       if((sa==2)&&(sie==2))
       {
           bill+=(95*d);
           break;    
        }   
       if((sa==2)&&(sie==3))
       {
           bill+=(195*d);
           break;    
        }   
       if((sa==3)&&(sie==1))
       {
           bill+=(70*d);
           break;    
        }   
       if((sa==3)&&(sie==2))
       {
           bill+=(130*d);
           break;
        }
       if((sa==3)&&(sie==3))
        {
           bill+=(230*d);
           break;
        }   
       if((sa==4)&&(sie==1))
       {
           bill+=(70*d);
           break;
        }
       if((sa==4)&&(sie==2))
       {
           bill+=(130*d);
           break;
        }
       if((sa==4)&&(sie==3))
       {
           bill+=(230*d);
           break;
        }
       if((sa==5)&&(sie==1))
       {
           bill+=(70*d);
           break;
        }
       if((sa==5)&&(sie==2))
       {
           bill+=(185*d);
           break;
        }
       if((sa==5)&&(sie==3))
       {
           bill+=(230*d);
           break;
        }
       if((sa==6)&&(sie==1))
       {
           bill+=(95*d);
           break;
        }
       if((sa==6)&&(sie==2))
       {
           bill+=(185*d);
           break;
        }
       if((sa==6)&&(sie==3))
       {
           bill+=(285*d);
           break;
        }
       if((sa==7)&&(sie==1))
       {
           bill+=(95*d);
           break;
        }
       if((sa==7)&&(sie==2))
       {
           bill+=(185*d);
           break;
        }
       if((sa==7)&&(sie==3))
       {
           bill+=(285*d);
           break;
        }
       if((sa==8)&&(sie==1))
       {
           bill+=(95*d);
           break;
        }
       if((sa==8)&&(sie==2))
       {
           bill+=(185*d);
           break;
        }
       if((sa==8)&&(sie==3))
       {
           bill+=(285*d);
        }
       if((sa==9)&&(sie==1))
       {
           bill+=(95*d);
           break;
        }
       if((sa==9)&&(sie==2))
       {
           bill+=(185*d);
           break;
        }
       if((sa==9)&&(sie==3))
       {
           bill+=(285*d);
           break;
        }
       if((sa==10)&&(sie==1))
       {
           bill+=(95*d);
           break;
        }
       if((sa==10)&&(sie==2))
       {
           bill+=(185*d);
           break;
        }
       if((sa==10)&&(sie==3))
       {
           bill+=(280*d);
           break;
        }
    }
       break;
       
       
       
case 3:System.out.println("  ************** BEVERAGES **************");
       System.out.println("");
       System.out.println("        Sir!you have chosen Beverages                   ");
       System.out.println("           Sir!choose item in Menu                   ");
       System.out.println("");
       
       System.out.println("1.Pepsi,Diet Pepsi(500 ml bottle)          -Rs.20");
       System.out.println("2.Miranda,3.7UP(can)                       -Rs.35");
       System.out.println("3.7UP(can)                                 -Rs.40");
       System.out.println("4.Choco lava                               -Rs.75");
       System.out.println("Beverages to be sold on M.R.P");
       System.out.println("");
    
       
       for(;;)
       {
       System.out.println("Sir!please Enter the Numbered Beverage,which you want to buy");
       int kj=sc.nextInt();
       if(kj>=5)
       {
           System.out.println("Sir!Wrong option");
           break;
        }
       System.out.println("");
       System.out.println("Sir!How many you want?");
       int iu=sc.nextInt();
       System.out.println("");
       
       if((kj==1))
       {
       bill+=(20*iu);
       break;
    }
       if((kj==2))
       {
       bill+=(35*iu);
       break;
    }
       if((kj==3))
       {
       bill+=(40*iu);
       break;
    }
       if((kj==4))
       {
       bill+=(2*iu);
       break;
    }
    }
       break;
       
       
default:System.out.println("Sir!you have chosen wrong option,please check it if you want to Continue Enter 1 else 0");
        check=sc.nextInt();
            
    } 
System.out.println("Sir!Continue Shopping!!!!");
}
    
System.out.println("******************BILL**************");
System.out.println("");
System.out.println("Total cost=Rs."+bill);
if(bill>=500 && bill<=1000)
dis=(bill*5)/100;
if(bill>=1001 && bill<=5000)
dis=(bill*10)/100;
if(bill>=5001 && bill<=10000)
dis=(bill*15)/100;
if(bill>=10001)
dis=(bill*20)/100;
 
System.out.println("Discount=Rs."+dis);
System.out.println("Net cost to be paid=Rs."+(bill-dis));
    
 
    
}
}




