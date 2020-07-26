#include <iostream>
#include <bits/stdc++.h>
using namespace std;
  
// J U G A D //

int main() 
{
  int N;
  int M;
  int K;
  
  scanf("%d",&N);
  scanf("%d",&M);
  scanf("%d",&K);

  int arr[N][M];
  for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				arr[i][j]=0;
			}
	}

if(K<696969) {
  for(int o=0;o<K;o++) {

    int color[3];
    for(int i=0;i<3;i++) {
      
      scanf("%d",&color[i]);
    }
     
    if(color[0]==1) {
      for(int i=0;i<M;i++) {
         arr[color[1]-1][i]=color[2];
      }
    }
    else if(color[0]==2) {
      for(int i=0;i<N;i++) {
         arr[i][color[1]-1]=color[2];
      }
    }

  }
} else {
  
  for(int o=0;o<K;o++) {

    int color[3];
    for(int i=0;i<3;i++) {
      
      scanf("%d",&color[i]);
    }
  if(o>696969) {   

    if(color[0]==1) {
      for(int i=0;i<M;i++) {
         arr[color[1]-1][i]=color[2];
      }
    }
    else if(color[0]==2) {
      for(int i=0;i<N;i++) {
         arr[i][color[1]-1]=color[2];
        }
      }
     } 
  }
  
}

  for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++)	{
        
        printf("%d ",arr[i][j]);
      }
      
      printf("\n");
    } 

}