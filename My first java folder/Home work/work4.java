import java.util.*;

public class work4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

       
        do{
            {   System.out.println("Enter your marks");
                int n = sc.nextInt();
                if(n<=100 && n>=90)
                {System.out.println("Excelent,Very Good Student");}
                else if (80<=n && n<=89) {
                    System.out.println("Good Marks");
                    }
                else if (n>=60 && n<=79) {
                    System.out.println("Not Bad,Stay Focus");
                }
                else if (n>=33 && n<=59) {
                    System.out.println("Very Bad,IMprove your self");
                }    
                else if (n>=1 && n<=32) {
                    System.out.println("Porasunar Dorkar nai ,Kamla diye kha");
                }
                else{
                    System.out.println("Are You kidding me,Fuck You");
                }

            }
         System.out.println("Are you want contineuing to Know feedback about you marks:\n Yes(1)\n No(0)"); 
          input = sc.nextInt();   
        }
     while(input==1);  

    }
    

}
