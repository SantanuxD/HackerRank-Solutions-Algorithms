import java.util.*;
public class sol
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=1;i<=t;i++)
    {
      int num=0,d=0,p,count=0;
      num=sc.nextInt();
      d=num;
      while(num>0)
      {
        p=num%10;
        if(p!=0)
        {
        if(d%p==0)
        {
          count++;
        }
        }
        num=num/10;
      }
      System.out.println(count);
    }
  }
}
