import java.util.*;
public class sol
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String y=sc.nextLine();
    int year=Integer.parseInt(y);
    int k=0;
    if(year==1918)
    {
      System.out.println("26.09."+y);
    }
    else
    {
    if(year<1918)
    {
      if(year%4==0)
      {
        k=1;
      }
    }
    
    else
    {
      if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    k=1;
                else
                    k=0;
            }
            else
                k=1;
        }
        else {
            k=0;
        }
    }
    if(k==1)
    {
      System.out.println("12.09."+y);
    }
    else
    {
      System.out.println("13.09."+y);
    }
    }
  }
}
