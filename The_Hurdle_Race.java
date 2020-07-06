import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=0;i<n;i++)
        {
         if(a[i]>max)
         {
             max=a[i];
         }
        }
        if(max>k)
        System.out.println(max-k);
        else
        System.out.println("0");
    }
}
