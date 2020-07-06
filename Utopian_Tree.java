import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n,i,j,sum;
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {
            n=sc.nextInt();
            sum=1;
            for(j=1;j<=n;j++)
            {
                if(j%2==0)
                {
                    sum=sum+1;
                }
                else
                {
                    sum=sum*2;
                }
            }
            System.out.println(sum);
            }
        }
    }
