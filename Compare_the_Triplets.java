import java.util.*;
public class sol
{
    public static final int SIZE = 3;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
int a_arr[]=new int[SIZE];
int b_arr[]=new int[SIZE];

for(int i=0;i<SIZE;i++)
{
    a_arr[i]=sc.nextInt();
}
for(int i=0;i<SIZE;i++)
{
b_arr[i]=sc.nextInt();
}
int aScr=0;
int bScr=0;
for(int i=0;i<SIZE;i++)
{
    if(a_arr[i]>b_arr[i])
    {
        aScr++;
    }
    else if(a_arr[i]<b_arr[i])
    {
        bScr++;
    }
}
System.out.println(aScr+" "+bScr);
}
}
    
