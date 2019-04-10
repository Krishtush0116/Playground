import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	    for(int star=1; star <= n ; star++)
          {
          System.out.print(star);
          if( star % 3==0)
            {
            System.out.print(",");
            }
          } 
		}
  }