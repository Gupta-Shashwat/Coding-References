#include<iostream>
using namespace std;

int main(){
    int x, count = 0;
    cin >> x;
    while ((4 * count) < x)
    {
        count++;
    }
    cout << x << " divided by 4 is " << count;
    return 0;
}