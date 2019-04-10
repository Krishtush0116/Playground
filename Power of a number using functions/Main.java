import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in =new Scanner (System.in); 
    int base= in.nextInt();
    int power= in.nextInt();
    int x=ans(base,power);
    System.out.println(x);
  }
  public static int ans(int m,int n)
  {
    int z=1;
    for (int fact =1; fact <=n ;fact++ )
    {
      z=z*m;
    }
    return z;
  }
}