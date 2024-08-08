#include <iostream>
#include <cmath>
using namespace std;

int main() {
    string n;
    cin >> n;
    int max_diff = 0;
    for(int i = 1; i < n.size(); i++) {
        int diff = abs(n[i] - n[i-1]);
        if(diff > max_diff) max_diff = diff;
    }
    cout << max_diff;
    return 0;
}
