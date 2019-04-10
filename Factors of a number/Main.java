import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code her
      Scanner in = new Scanner(System.in);
     
     int n=in.nextInt();
   for(int x= 1 ; x <= n ; x++)
      {
      if(n % x == 0)
         {
          System.out.println(x);
         }
      }
	}
}