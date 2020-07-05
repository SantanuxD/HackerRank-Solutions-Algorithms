import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        if(a[i]<38)
        {
            System.out.println(a[i]);
        }
        else
        {
            if((a[i]+2)%5==0)
            {
                System.out.println(a[i]+2);
            }
            else if((a[i]+1)%5==0)
            {
                System.out.println(a[i]+1);
            }
            else if(a[i]%5==0)
            {
                System.out.println(a[i]);
            }
            else
            {
                System.out.println(a[i]);
            }
        }
    }
}
}
