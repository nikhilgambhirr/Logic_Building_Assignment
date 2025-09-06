#include <iostream>
using namespace std;

typedef int *IPTR;
typedef int **IPPTR;

void AddColum(int **Arr, int iRow, int iCol)
{
    

    for (int i = 0; i < iRow; i++)
    {
        int Max = 0;
        for (int j = 0; j < iCol; j++)
        {
            Max += Arr[j][i];
        }
        cout<<Max<<" ";
    }
    cout << endl;
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

    // Call Display function
    Display(Arr, iValue, Value);
    
    
     AddColum(Arr,iValue,Value);

    return 0;
}
