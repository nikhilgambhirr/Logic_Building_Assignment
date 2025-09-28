
#include <iostream>
using namespace std;

typedef int *IPTR;
typedef int **IPPTR;

int AddDiagonal (int **Arr, int iRow, int iCol)
{  
     int sum = 0;

    for (int i = 0; i < iRow; i++)
    {
        for (int j = 0; j < iCol; j++)
        {
            if (i == j) // main diagonal condition
            {
                sum += Arr[i][j];
            }
        }
    }
    return sum;

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
    int iValue, Value,iRet = 0;
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
    
    iRet = AddDiagonal(Arr,iValue,Value);



    cout << "\nDiagonal Addition is = " << iRet << endl;
    

    return 0;
}
