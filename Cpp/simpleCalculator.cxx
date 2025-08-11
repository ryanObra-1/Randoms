#include<iostream>
using namespace std;

   
void manualMode() 
{
    float firstNum;
    float secNum;
    char operation;
    
    cout << "enter number: ";
    cin >> firstNum >> secNum;
    cout << "enter operation [ * / - + ]: ";
    cin >> operation;
    
    switch(operation) 
    {
        case '+':
            cout << firstNum + secNum << endl;
            break;
        case '-':
            cout << firstNum - secNum << endl;
            break;
        case '*':
             cout << firstNum * secNum << endl;
             break;
        case '/':
            if (secNum != 0) cout << firstNum / secNum << endl;
            else cout << "Error, Division by zero" << endl;
            break;
    }
}


void fullExpressionMode() 
{
    string expression;
    
    cout << "Enter expression: ";
    cin >> expression;
    
    cout << expression << endl;
    //to be continued after i learn about math()
}


int main() 
{
        int calculatorMode;
    
        cout << ' ' << endl
            << "Choose calculator's mode, " << endl 
            << "[1] 2 expression mode." << endl 
            << "[2] Full expression mode." << endl 
            << ' ' << endl;
        cin  >> calculatorMode;

    switch (calculatorMode) 
    { 
        case 1:
            manualMode();
            break;
        case 2:
            fullExpressionMode();
            break;
        default:
            cout << "Enter a valid option." << endl;
    }
    
    
    char choice;
    
    cout << "Continue using? y/n:"  << endl;
    cin >> choice;
    
    if (choice == 'y') 
    {
        main();
    } else if (choice == 'n') 
    {
    }
    
    return 0;
}
