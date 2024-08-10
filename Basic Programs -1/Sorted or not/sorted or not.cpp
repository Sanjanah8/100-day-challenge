#include <iostream>
using namespace std;

int main()
{
    int num1, num2, num3;
    cin >> num1 >> num2 >> num3;
    if(num1 <= num2 && num2 <= num3)
    {
        cout << "SORTED";
    }
    else if(num1 >= num2 && num2 >= num3)
    {
        cout << "SORTED";
    }
    else
    {
        cout << "NOTSORTED";
    }
    return 0;
}
