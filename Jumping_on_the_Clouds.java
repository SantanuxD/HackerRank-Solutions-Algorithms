import java.util.*;
public class sol
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int i=0,count=0;
    while(i<(n-1))
    {
      if((i+2)>=n || a[i+2]==1)
      {
        i++;
        count++;
      }
      else
      {
        i+=2;
        count++;
      }
    }
    System.out.println(count);
  }
}
