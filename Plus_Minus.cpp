#include<iostream>
using namespace std;
int main()
{
    int i,n; double c=0,c1=0,c2=0;
    double r=0.0,r1=0.0,r2=0.0;
    cin>>n;
    int a[n];
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(i=0;i<n;i++)
    {
        if(a[i]>0)
        {
            c++;
        }
    }
    r=(c/n);
    cout<<r;
        for(i=0;i<n;i++)
    {
        if(a[i]<0)
        {
            c1++;
        }
    }
    r1=(c1/n);
    cout<<"\n"<<r1;
        for(i=0;i<n;i++)
    {
        if(a[i]==0)
        {
            c2++;
        }
    }
    r2=(c2/n);
    cout<<"\n"<<r2;
return 0;
}
