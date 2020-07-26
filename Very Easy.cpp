#include <bits/stdc++.h>
#define pb push_back
using namespace std;
int arr[500010];
int c[500010];
vector<int>v[500010];
void dbs(int k, int n)
{
  arr[k]=1;
  c[k]=n;
  for(auto it:v[k])
  {
    if(arr[it]==0)
    {
      dbs(it,n^1);
    }
  }
}
int main()
{
  
  int n;
  cin>>n;
  
  for(int i=0;i<n-1;i++)
  {
    int x,y;
    cin>>x>>y;
    v[x].pb(y);
    v[y].pb(x);

  }
  if(n==1)
  {
    cout<<1<<endl<<1;
  }
  else{
  dbs(1,0);
  int a=0,b=0;
  for(int i=1;i<=n;i++)
  if(c[i])
  a++;
  else
  b++;
  cout<<2<<endl<<b<<" "<<a<<endl;
  }
}