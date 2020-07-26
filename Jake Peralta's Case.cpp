#include <iostream>
#include <bits/stdc++.h>

using namespace std;

char nextSmall(string s, char min, int index) {
  int n = s.length(), count=0; 

  for(int i=index+1 ; s[i]!='\0' ; i++) {

    if( ( (int) s[i])<( (int) min ) ) {
      min = s[i];
      count=0;
    }

    if(s[i]==min) {
      count++;
    }

  } 

  return min;
}

void PrintQueue(queue <char> q) {
  queue <char> temp;
  while(q.empty() == false) {
    temp.push(q.front());
    q.pop();
  }

  while(temp.empty()==false) {
    char t = temp.front();
    cout << t << " ";
    temp.pop();


    q.push(t);
  }
}
  void PrintStack(stack<char> st) { 
    stack<char> temp; 
    while (st.empty() == false) { 
        temp.push(st.top()); 
        st.pop(); 
    }    
   
    while (temp.empty() == false) { 
        char t = temp.top(); 
        cout << t << " "; 
        temp.pop(); 
        st.push(t);   
    } 

}  

int main() {
  string s;
  cin >> s;
  int n = s.length(), index=0;

  char min = 'z';
  int count = 0;

  queue <char> S;
  for(int i=0 ; i<n ; i++) {

    char ch = s[i];
    S.push(ch);
    if( ( (int) ch )<( (int) min ) ) {
      min = ch;
      count = 0;
    } 

    if(min==ch) {
      count++;
      index=i;
    }

  }

  stack <char> P;
  string ans = "";

  int times = 0, isit = 1;
  while(isit) {

    if(S.front()==min) {
      ans = ans + S.front();
      S.pop();
      times++;
      if(times==count) {
        break;
      }
    } else {
      P.push(S.front());
      S.pop();
    }

  } 

  while(!S.empty()) {

    if(!P.empty()) {
      min = nextSmall(s, (char) P.top(), index);
     
    } else {
      min = nextSmall(s, 'z', index);
      
      while(isit) {
        if(S.empty()) {
          break;
        }

        if(S.front()==min) {
          ans = ans + S.front();
          S.pop();
          index++;
          break;
        } else {
          P.push(S.front());
          S.pop();
        } 

        index++;
      }
      continue;
    }

    if(min!=P.top()) {

      while(isit) {
        if(S.empty()) {
          break;
        }

        if(S.front()==min) {
          ans = ans + S.front();
          S.pop();
          index++;
          break;
        } else {
          P.push(S.front());
          S.pop();
        }

        index++; 
      }

    } else {
      ans += P.top();
      P.pop();
    }

  }

  if(S.empty()) {
    while(!P.empty()) {
      ans += P.top();
      P.pop();
    }
  } 

  cout << ans;
} 
