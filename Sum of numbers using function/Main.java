import java.util.Scanner;
class Main{
	public static int Go(int m)
   {
      int sum = 0;
     for(int h=1; h<= m; h++) 
     {
         sum = sum+h;
      }
      return sum;
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
    
        int Fact= Go(n);
       
    
     System.out.println(Fact); //result printed here
   }
}