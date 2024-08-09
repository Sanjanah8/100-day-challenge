#include <iostream>
using namespace std;

int main() {
    string n;
    int max_odd = -1, min_odd = 11;
    cin >> n;
    for(char digit : n) {
        int val = digit - '0';
        if (val % 2 == 1) {
            if (val > max_odd) max_odd = val;
            if (val < min_odd) min_odd = val;
        }
    }
    if (max_odd != -1) {
        cout << max_odd - min_odd;
    } else {
        cout << "-1";
    }
    return 0;
}
