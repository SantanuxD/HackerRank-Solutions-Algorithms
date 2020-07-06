import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,x,y,z,a,b;
        s=sc.nextInt();
        for(int i=0;i<s;i++)
        {
            x=0;
            y=0;
            z=0;
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
            a=Math.abs(z-x);
            b=Math.abs(z-y);
            if(a<b)
            {
                System.out.println("Cat A");
            }
            else if(b<a)
            {
                System.out.println("Cat B");
            }
            else
            {
                System.out.println("Mouse C");
            }
        }
    }
}
