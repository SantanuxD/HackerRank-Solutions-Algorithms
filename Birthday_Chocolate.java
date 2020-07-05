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
        int d=sc.nextInt();
        int m=sc.nextInt();
        int res=0;
        for(int i =0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<m;j++)
            {
                if(i+j<n)
                {
                    c+=a[i+j];
                }
            }
            if(c==d)
            {
                res++;
            }
        }
        System.out.println(res);
    }
}
