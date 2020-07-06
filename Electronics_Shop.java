import java.util.*;
public class sol
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int b,m,n;
    b=sc.nextInt();
    m=sc.nextInt();
    n=sc.nextInt();
    int k[]=new int[m];
    int u[]=new int[n];
    for(int i=0;i<m;i++)
    {
      k[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      u[i]=sc.nextInt();
    }
    int max=-1;
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        if((k[i]+u[j])<=b)
        {
          max = Math.max(max,(k[i]+u[j]));
        }
      }
    }
    System.out.println(max);
  }
}
