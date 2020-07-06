import java.util.*;
public class sol
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++)
    {
      int j,n=0,k=0,count=0;
      n=sc.nextInt();
      k=sc.nextInt();
      int a[]=new int[n];
      for(j=0;j<n;j++)
      {
        a[j]=sc.nextInt();
        if(a[j]<=0)
        {
          count++;
        }
      }
      if(count>=k)
      {
        System.out.println("NO");
      }
      else
      {
        System.out.println("YES");
      }
    }
  }
}
