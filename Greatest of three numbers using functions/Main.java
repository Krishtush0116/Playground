import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in= new Scanner(System.in);
       int n1=in.nextInt();
       int n2=in.nextInt();
       int n3=in.nextInt();
       int z= gcd(n1, n2) ;
       int c= gcd(z, n3);
       System.out.println(c) ;
    } 
  public static int gcd(int x, int y) 
  { 
    if(x>y)
    {
     
      return x;
    } 
    else
    {
      
      return y;
    }  
  } 
}
