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
        int max=a[0],min=a[0],maxc=0,minc=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                maxc++;
            }
            else if(a[i]<min)
            {
                min=a[i];
                minc++;
            }
        }
        System.out.println(maxc+" "+minc);
    }
}
