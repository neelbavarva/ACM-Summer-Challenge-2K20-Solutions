#include<bits/stdc++.h>

#define large long long
#define fast ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
using namespace std;
int main()
{
    fast;
    large n, m;
    cin>>n>>m;
    vector <int> vlist[n+2];
     int arr[n+2];
    int visited[n+2];
    priority_queue <int, vector<int>, greater<int>> queue; 
    queue.push(1);
    for(int i=0; i<m; i++){
        int u, v;
        cin>>u;
        cin>>v;
        vlist[u].push_back(v);
        vlist[v].push_back(u);
    }
    for(int i=0; i<n; i++){
        visited[i] = 0;
    }
    visited[1] = 1;
    while(queue.size()>0){
        int Temp = queue.top();
        cout<<Temp<<" ";
        queue.pop();
        visited[Temp] = 1;
        int pos= 0;
        for(int i=0; i<vlist[Temp].size(); i++){
            if(visited[vlist[Temp][i]]!=1){
                visited[vlist[Temp][i]]=1;
                queue.push(vlist[Temp][i]);
            }
        }
    }
    cout<<"\n";
    
}