import java.util.Scanner;
class Main
{public static int Prod(int x)
   {
      int X;
    X=x*x;
      return X;
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int x = in.nextInt() ;
        int Po = Prod(x); 
     System.out.println(Po); //result printed here
   }
} 
