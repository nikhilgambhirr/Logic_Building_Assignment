#include <iostream>
using namespace std;

typedef int *IPTR;
typedef int **IPPTR;

int Frequency(int **Arr, int iRow, int iCol,int iNo)
{
    int Count = 0;

    for (int i = 0; i < iRow; i++)
    {
        for (int j = 0; j < iCol; j++)
        {
            if (Arr[i][j] == iNo)
            {
              Count++;
            }
        }
    }
    return Count;
}

void Display(int **Arr, int iRow, int iCol)
{
    cout << "\nMatrix is:\n";
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
    int iValue, Value,iNo;
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
    
    cout << "Enter number to search : ";
    cin >> iNo;

    
    int iRet = Frequency(Arr, iValue, Value,iNo);
    cout << "\n Frequency of = "<< iRet << endl;

    return 0;
}
