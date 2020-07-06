#include <bits/stdc++.h>
using namespace std;


int main() 
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++) 
  {
    cin>>a[i];
  }
  int c=999999;
  for(int i=0;i<n;i++)
  { 
    for(int j=0;j<i;j++) 
      if(a[i]==a[j])
      {
        c=min(c,(i-j));
      }
  }
  if(c==999999)
  {
  c=-1;
  }
  cout<<c;
  
  return 0;
}
