import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,t,a,b,m,n,d,apple=0,orange=0;
        s=sc.nextInt();
        t=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        m=sc.nextInt();
        n=sc.nextInt();
        int ap[]=new int[m];
        int or[]=new int[n];
        for(int i=0;i<m;i++)
        {
        ap[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            d=ap[i]+a;
            if(d>=s && d<=t)
            {
                apple++;
            }
        }
        for(int i=0;i<n;i++)
        {
        or[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            d=or[i]+b;
            if(d>=s && d<=t)
            {
                orange++;
            }
        }
        System.out.println(apple);
        System.out.println(orange);
    }
}
