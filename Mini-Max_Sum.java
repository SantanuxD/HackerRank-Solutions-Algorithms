import java.util.*;
public class sol{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long a[]=new long[5];
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextLong();
        }
        long max=0; long min=a[0];
        for(int i=0;i<5;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        long sum=0;
        for(int i=0;i<5;i++)
        {
            sum=sum+a[i];
        }
        System.out.println((sum-max)+" "+(sum-min));

    }
}
