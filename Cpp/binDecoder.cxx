#include <iostream>
#include <string>
using namespace std;


int continuation(char a);

char reLatch;
char reLatchFunc() { 
        cout << "\n Reselect latch to open? y/n:";
        cin >> reLatch;
}


int main() { //start of main()-----

int firstInputVal, secondInputVal;
bool outOne = false, outTwo = false, outThree = false, outFour = false;
string result;


//input area
    cout << "\n Enter a corresponding inputs to activate line: " << endl;
    cout << " 0/0 - out One, \n 1/0 - out Two, \n 0/1 - out Three, \n 1/1 - out Four \n" << endl;
    
    cout << "Enter first value (1 || 0): " ;
    cin >>  firstInputVal;
    cout << "Enter second value (1 || 0): " ;
    cin >>  secondInputVal;

/*     
//input validateon
    if (firstInputVal != 1 || firstInputVal != 0 || secondInputVal != 1 || secondInputVal != 0) {
        cout << "\n Please Enter a Valid input." << endl;
        main();
    }
*/
    
/*
conditions table
!a!b = !1&&!1 = t
!ab = !1&&1 = t
ba = 1&&1 = t
a!b = 1&&!1 = t
*/

//ma-issue itong part na to
/* 
    tinatamad ako tanggalin yung !() 
*/
    if(!(firstInputVal == 1) && !(secondInputVal == 1)) {
        outOne = true;
        result = "outOne";
    } else if(!(firstInputVal == 0) && secondInputVal == 0) {
        outTwo = true;
        result = "outTwo";
    } else if(secondInputVal == 1 && firstInputVal == 0) {
        outThree = true;
        result = "outThree";
    } else if(firstInputVal == 1 && !(secondInputVal == 0)) {
        outFour = true;
        result = "outFour";
    }

//result output
    cout << " " << "Opened the gate at NAND " << result << endl;
    cout << " " << outOne << " " << outTwo << " " << outThree << " " << outFour << endl;

//relaunch?
    reLatchFunc();
 
    if(tolower(reLatch) == 'y' || tolower(reLatch)
    == 'n') {
        continuation(reLatch);
        cout << "I'm called" << endl;
    } else {
        cout << "\nEnter a valid value." << endl;
    }

} // end of main()-----


int continuation(char a) {
    if(tolower(a) == 'y') {
         cout << "hello" << endl;
         main(); 
    } else if (tolower(a) == 'n') {
        return 0;
    }
}