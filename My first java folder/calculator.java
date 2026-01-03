import java.util.Scanner;

public class calculator {
    public static void main(String[] args)
     {
        System.out.println("Enter the value a,b:");
        Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

   System.out.println("Oparetor:\n1.*\n2.-\n3.+\n4.%\nSelect Oparetor--");
   int n = sc.nextInt();
   switch (n) {
    case 1:
        System.out.println("The value is="+(a*b));
        break;
    case 2:
        System.out.println("The value is="+(a-b));
        break;
    case 3:
        System.out.println("The value is="+(a+b));
        break;
    case 4:if(b==0){
        System.out.println("Invalid Division");
    }
    else{
        System.out.println("The value is="+(a%b));
    } 
        break;            
   
    default:
        System.out.println("F Y");
        break;
   }


  

    
   }
}

