#include <bits/stdc++.h>
using namespace std;

int main(){
    int num;
    cin >> num;
    long long int arr[num];
    for(int i=0;i<num;i++) cin >> arr[i];
    long long int ans = 0;
    for(int i=1;i<num;i++){
        if(arr[i]<arr[i-1]) ans += arr[i-1]-arr[i], arr[i] = arr[i-1];
    }
    cout << ans << endl;
}