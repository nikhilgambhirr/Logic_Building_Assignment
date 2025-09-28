/*  Matrix is:
1       2       3       4
5       6       7       8
9       10      11      21
4       55      55      2
 TransPose

 Matrix is:
1       5       9       4
2       6       10      55
3       7       11      55
4       8       21      2
*/
#include <iostream>
using namespace std;

typedef int *IPTR;
typedef int **IPPTR;

void TransPose(int **Arr, int iRow, int iCol)
{  
   int temp = 0; 
// Outer loop: pratek row var iterate karto
    for (int i = 0; i < iRow; i++)
    {
        // Inner loop: diagonal chya pudchya elements (i+1 pasun)
        // mhanje duplicate swap talnyasathi fackt .... varcha handale karto

        for (int j = i + 1; j < iCol; j++)// 
        {
            // (i,j) element temp madhe store karto
            temp = Arr[i][j];
            // (j,i) element (i,j) position la takto
            Arr[i][j] = Arr[j][i];
            // temp मधला जुना (i,j) value (j,i) position la takto
            Arr[j][i] = temp;

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

    cout<<"\nBefor Swapping\n";
    Display(Arr, iValue, Value);
    
    TransPose(Arr,iValue,Value);

    cout<<" TransPose\n";
    Display(Arr, iValue, Value);

    for(int i = 0; i < iValue ; i++)
    {
        delete Arr[i];
    }
    delete Arr;


    return 0;
}
