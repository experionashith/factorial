import java.io.BufferedReader;
import java.io.IOException;

 class FactorialExample
{
     public static void main(String args[])
	{
      int i,fact=1;
       System.out.println("Please enter number");

                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                        number = Integer.parseInt(br.readLine());
                        number = Integer.parseInt(System.console().readLine());

      for(i=1;i<=number;i++)
	{
          fact=fact*i;
      	}
      System.out.println("Factorial of "+number+" is: "+fact);
     }
}
