import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,b;
        n=sc.nextInt();
        k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        b=sc.nextInt();
        int s=0;
        int d=a[k];
        for(int i=0;i<n;i++)
        {
            s=s+a[i];
        }
        if((s/2)==b)
        {
            System.out.println((b-(s-d)/2));
        }
        else
        {
            System.out.println("Bon Appetit");
        }

    }
}
