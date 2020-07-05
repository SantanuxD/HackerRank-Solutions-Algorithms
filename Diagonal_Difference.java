import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum1=0,sum2=0;
        n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
              if(i==j){
                sum1+=(arr[i][j]);}
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i+j)==(n-1))
                {
                    sum2+=(arr[i][j]);
                }
            }
        }
        int dif=0;
if(sum1>sum2)
{
    dif+=(sum1-sum2);
}
else if(sum1<sum2)
{
    dif+=(sum2-sum1);
}
System.out.println(dif);


    }
}
