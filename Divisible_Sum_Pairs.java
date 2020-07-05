import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,count=0;
        n=sc.nextInt();
        k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=(n-1);j>i;j--)
            if((a[i]+a[j])%k==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
