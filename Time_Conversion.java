import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s,h,m,sec,t="";
        int hour=0;
        s=sc.nextLine();
        h=s.substring(0,2);
        m=s.substring(3,5);
        sec=s.substring(6,8);
        int hr=Integer.parseInt(h);
        if(s.charAt(8)=='A')
        {
            if(hr==12)
            {
                t="00";
            }
            else
            {
                t=h;
            }
        }
        else
        {
            if(hr==12)
            {
                hour=hr;
            }
            else
            {
            hour=hr+12;
        }
        t=Integer.toString(hour);
        }
         System.out.println(t+":"+m+":"+sec);
         }
    }
