#include <bits/stdc++.h>
#define fast ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
using namespace std;

int main() {
  int n,m;
  scanf("%d",&n);
  scanf("%d",&m);

  vector <int> arr[n];
  vector <int> group[m];

  for(int j=0 ; j<m ; j++) 
  {
    int l;
    scanf("%d",&l);

    for(int i=0 ; i<l ; i++) 
    {
      int x;
      scanf("%d",&x);
      group[j].push_back(x-1);
      arr[x-1].push_back(j);
    }
  }

  bool grp[m];
  
  int ans[n];
  for(int i=0 ; i<n ; i++) {
    ans[i] = 0;
  }

  for(int j=0 ; j<n ; j++) 
  {
    for(int i=0 ; i<m ; i++) 
    {
      grp[i] = false;
    }

    if(ans[j]>0) {
      printf("%d ",ans[j]);
      continue;
    }

    set <int , greater<int> > infected;

    bool isOne = true;

    for(int i=0 ; i<arr[j].size() ; i++) 
    {
      for(int k=0 ; k<group[arr[j][i]].size() ; k++) {
        infected.insert(group[arr[j][i]][k]);
        if(k>0) {
          isOne = false;
        }
      }
        grp[arr[j][i]] = true;
    }

    if(isOne) {
      printf("1 ");
      continue;
    }

    bool isChange = true;
    while(isChange) {
      isChange = false;
      for(int i=0 ; i<m ; i++) {

        if(grp[i]) {
          continue;
        }

        for(int k=0 ; k<group[i].size() ; k++) 
        {
          if(infected.count(group[i][k])) 
          {
            isChange = true;
            grp[i] = true;
            
            for(int p=0 ; p<group[i].size() ; p++) 
              infected.insert(group[i][p]);
            break;
          }
        }
      }
    } // end-while

    ans[j] = infected.size();
    if(ans[j]==0) {
      ans[j] = 1;
    }

    printf("%d ",ans[j]);    // printing ans

    set <int, greater <int> > :: iterator itr; 
    for( itr=infected.begin();itr!=infected.end();itr++)
    ans[*itr]=ans[j];
    }

  }