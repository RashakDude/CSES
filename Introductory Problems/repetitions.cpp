#include <bits/stdc++.h>
using namespace std;

int main(){
    string s;
    cin >> s;
    long long int t=1;
    long long int ans=1;
    for(int i=1;i<s.size();i++){
        if(s[i]==s[i-1]) t++;
        else{
            ans = max(ans,t);
            t = 1;
        }
    }
    ans = max(ans,t);
    cout << ans << endl;
}