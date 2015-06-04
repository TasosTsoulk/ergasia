import java.util.*;
public class Program
{
   public static void main (String[] args)
   {
     public int plithos;
     System.out.println("Dwsmou to plithos twn sxhmatwn");
     Scanner in = new Scanner(System.in);
     plithos=in.netxInt();
     String[] Shapes= new String[plithos];
     for(int i=0; i<=plithos; i++)
      {
         System.out.println("----------------MENU---------------");
            System.out.println();
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Rectangle");
            
            Scanner scanchoice = new Scanner(System.in);
            choice = scanchoice.nextInt(); 
         
           if (choice==1)
           {
             System.out.println("Dwsmou thn aktina , to xrwma kai tis suntetagmenes tou kentrou tou kuklou.");
             
           }
         
     }
   }
}