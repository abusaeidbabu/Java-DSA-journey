import java.util.Scanner;

public class calendar {
   public static void main(String[] args) {
   System.out.println("Enter The Month Number");
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   switch (a) {
       case 1:
           System.out.println("January");
           break;
       
       case 2:
            System.out.println("February");
           break;
       
       case 3:
        System.out.println("March");
           
           break;
       
       case 4:
        System.out.println("April");
           
           break;
       
       case 5:
        System.out.println("May");
           
           break;
       
       case 6:
        System.err.println("June");
           
           break;
       
       case 7:
        System.err.println("July");
           
           break;
       
       case 8:
        System.err.println("August");
           
           break;
       
       case 9:
        System.err.println("September");
           
           break;
       
       case 10:
           System.out.println("October");
           break;
       
       case 11:
           System.out.println("November");
           break;
       
       case 12:
           System.out.println("Dicember");
           break;
       
       default:
        System.out.println("Invalid");
        break;
   }





   } 
}
