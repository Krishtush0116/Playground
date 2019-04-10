import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code her
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int fact=1;
    for(int x=1; x<=n; x++ )
     {
      fact=fact * x;
     }
    System.out.println(fact);
  }
}