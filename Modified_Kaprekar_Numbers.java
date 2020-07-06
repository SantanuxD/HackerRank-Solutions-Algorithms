import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {
      int base;
      boolean flag=false;
      for(int i=p;i<=q;i++)
      {
        int l = Integer.toString(i).length();
        base = (int)Math.pow(10, l);
        long pow = (long)Math.pow(i, 2);
        long mod = pow%base;
        long div = (pow - mod)/base;
        if((div+mod)==i)
        {
          System.out.print(i+" ");
          flag=true;
        }
      }
      if(!flag)
      {
        System.out.println("INVALID RANGE");
      }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}
