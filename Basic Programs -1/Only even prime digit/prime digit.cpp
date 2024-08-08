#include <iostream>
#include <string>
using namespace std;

int main() {
    string number;
    cin >> number;
    if(number.find('2') != string::npos)
        cout << "Contains Even Prime";
    else
        cout << "Does Not Contain Even Prime";
    return 0;
}
