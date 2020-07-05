import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        long sum=0;
        n=sc.nextInt();
        long ar[]=new long[n];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextLong();
        }
        for(int i=0;i<ar.length;i++)
        {
            sum+=ar[i];
        }
        System.out.println(sum);


    }
}
