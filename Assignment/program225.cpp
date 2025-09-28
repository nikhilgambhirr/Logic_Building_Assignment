/*  Matrix is:
   1       0       0
   0       1       0
   0       0       1

   output : true

*/
#include <iostream>
using namespace std;

typedef int *IPTR;
typedef int **IPPTR;

bool ChkSparse(int **Arr, int iRow, int iCol)
{  
     int iCount =0 ;
     int total = iRow * iCol;
     
    for (int i = 0; i < iRow; i++)
    {
        for (int j = 0; j < iCol; j++)
        {
            if (Arr[i][j] == 0) 
            {
                iCount++;
            }

            
        }
    }
        if(iCount > total / 2)
        {
            return true;
        }
        else
        {
            return false;
        }
}

void Display(int **Arr, int iRow, int iCol)
{
    cout << "\n Matrix is:\n";
    for (int i = 0; i < iRow; i++)
    {
        for (int j = 0; j < iCol; j++)
        {
            cout << Arr[i][j] << "\t";
        }
        cout << endl;
    }
}

int main()
{
    int iValue, Value;
    IPPTR Arr = NULL;

    cout << "Enter number of rows : ";
    cin >> iValue;

    cout << "Enter number of columns : ";
    cin >> Value;

     Arr = new IPTR[iValue];

     for (int i = 0; i < iValue; i++)
    {
        Arr[i] = new int[Value];

    }

    cout << "Enter matrix elements:\n";
    for (int i = 0; i < iValue; i++)
    {
        for (int j = 0; j < Value; j++)
        {
            cin >> Arr[i][j];
        }
    }

    Display(Arr, iValue, Value);
     
    if (ChkSparse(Arr, iValue, Value))
    {
        cout << "True\n";
    }
    else
    {
        cout << " false\n";
    }
    
    return 0;
}
