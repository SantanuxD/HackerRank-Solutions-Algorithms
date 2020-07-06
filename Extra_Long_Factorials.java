import java.util.*;
import java.math.BigInteger;
public class sol
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(factorial(n));
  }

  public static BigInteger factorial(int number)
  { 
  BigInteger factorial = BigInteger.ONE; 
  for (int i = number; i > 0; i--)
  { 
    factorial = factorial.multiply(BigInteger.valueOf(i)); 
  } 
  return factorial; 
  }

}
