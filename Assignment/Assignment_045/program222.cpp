/*  
Befor RevereRow

 Matrix is:
1       2       3       4
5       6       7       8
9       10      11      12
13      14      15      16
ReverseRow

 Matrix is:
4       3       2       1
8       7       6       5
12      11      10      9
16      15      14      13
*/
#include <iostream>
using namespace std;

typedef int *IPTR;
typedef int **IPPTR;

void ReverseRow(int **Arr, int iRow, int iCol)
{  
   int temp = 0; 
    for (int i = 0; i < iRow; i++)
    {
        for (int j = 0; j < iCol / 2; j++)
        {
           temp = Arr[i][j];
           Arr[i][j] = Arr[i][iCol-1-j];
           Arr[i][iCol-1-j]= temp;

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

    cout<<"\nBefor RevereRow\n";
    Display(Arr, iValue, Value);
    
    ReverseRow(Arr,iValue,Value);

    cout<<"ReverseRow\n";
    Display(Arr, iValue, Value);

    for(int i = 0; i < iValue ; i++)
    {
        delete Arr[i];
    }
    delete Arr;


    return 0;
}
