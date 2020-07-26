#include <iostream>
#include <bits/stdc++.h>
#include <math.h>
#include <iterator>
using namespace std;

int main() 
{
  int t;
  scanf("%d",&t);
  for(int i=0;i<t;i++)
  {
    int n;
    scanf("%d",&n);
    int count=0;
	while(n%2==0){
		count++;
		n/=2;
	}
    for (int i = 3; i <= sqrt(n); i+= 2)
        while (n%i == 0){ 
            count++;
            n /= i; 
        } 
    if (n > 2) 
	    count++;
    printf("%d\n",count);
  }
}s