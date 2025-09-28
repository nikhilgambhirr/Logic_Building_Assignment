#include <iostream>
using namespace std;

typedef int *IPTR;
typedef int **IPPTR;

void ReverseCol (int **Arr, int iRow, int iCol)
{  
   int temp = 0; 
    for (int i = 0; i < iRow /2; i++)
    {
        for (int j = 0; j < iCol; j++)
        {
            temp = Arr[i][j];
            Arr[i][j] = Arr[iRow - 1 - i][j];
            Arr[iRow - 1 - i][j] = temp;

        }
    
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

    cout<<"\nBefor RevereCol\n";
    Display(Arr, iValue, Value);
    
    ReverseCol(Arr,iValue,Value);

    cout<<"ReverseCol\n";
    Display(Arr, iValue, Value);

    

    return 0;
}
