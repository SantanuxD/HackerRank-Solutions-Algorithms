import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x1,v1,x2,v2,k=0;;
        x1=sc.nextInt();
        v1=sc.nextInt();
        x2=sc.nextInt();
        v2=sc.nextInt();
        for(int i=0;i<=10000;i++)
        {
            x1=x1+v1;
            x2=x2+v2;
            if(x1==x2)
            {
                k++;
                break;
            }
        }
        if(k>0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
