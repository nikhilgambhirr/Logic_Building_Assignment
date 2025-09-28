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

bool CheIdentity (int **Arr, int iRow, int iCol)
{  
   if (iRow != iCol)   // must be square
    {
        return false;
    }

    for (int i = 0; i < iRow; i++)
    {
        for (int j = 0; j < iCol; j++)
        {
            if (i == j) // diagonal element
            {
                if (Arr[i][j] != 1)
                {
                    return false;
                }
            }
            else 
            {
                if (Arr[i][j] != 0)
                {
                    return false;
                }
            }
        }
    }
    return true;
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
     
    if (CheIdentity(Arr, iValue, Value))
    {
        cout << "The matrix is an Identity Matrix.\n";
    }
    else
    {
        cout << " The matrix is NOT an Identity Matrix.\n";
    }

    // Free memory
    for (int i = 0; i < iValue; i++)
    {
        delete[] Arr[i];
    }
    delete[] Arr;

    
    return 0;
}
