#include <bits/stdc++.h>
 
using namespace std;
 
int main(){
  
    int q;
    cin >> q;
 
    for(int o=0;o<q;o++){
        long long int n;
        cin >> n;
 
        long long int count = 1;
        long long int temp = 1;
 
        while(count < n){
            temp = temp*3;
            count = count + temp;
        }
 
        while(temp >= 1){
            if(count - temp >= n){
                count = count - temp;
            }
 
            temp = temp/3;
        }
 
        cout << count << "\n";
 
    }
 
   
}