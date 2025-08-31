#include <iostream>
#include <string>
using namespace std;


long long int counter = 0;
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
    do { 
        cout << "\n Enter a corresponding inputs to activate line: " << endl;
        cout << " 0/0 - out One, \n 1/0 - out Two, \n 0/1 - out Three, \n 1/1 - out Four \n" << endl;
    
        cout << "Enter first value (1 || 0): " ;
        cin >>  firstInputVal;
        cout << "Enter second value (1 || 0): " ;
        cin >>  secondInputVal;
    } while((firstInputVal != 0 && firstInputVal != 1) || (secondInputVal != 0 && secondInputVal != 1));

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
    cout << " " << "Opened at " << result << endl;
    cout << " " << outOne << " " << outTwo << " " << outThree << " " << outFour << endl;

//relaunch?
    do {
        reLatchFunc();
 
        if(tolower(reLatch) == 'y') {
            continuation(reLatch);
            cout << "relaunced" << endl;
        } else if(tolower(reLatch) == 'n'){
            cout << "exited" << endl;
            return 0;
        } else {
            cout << "\nEnter a valid value." << endl;
        }
    } while (tolower(reLatch) != 'y ' || tolower (reLatch) != 'n');
    

} // end of main()-----


int continuation(char a) {
    if(tolower(a) == 'y') {
         counter += 1;
         cout << counter << endl;
         main(); 
    }
}