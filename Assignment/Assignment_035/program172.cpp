#include<iostream>
using namespace std;

typedef struct node
{
    int data;
    struct node *next;

}NODE,*PNODE,**PPNODE;

class SinglyLinerLL
{
    private:
      PNODE  first;
      int iCount;

    public:
       SinglyLinerLL()
       {
        this->first = NULL;
        this->iCount = 0;
       }

   void Display()
   {
       PNODE temp = NULL;
       temp = first;
       while( temp != NULL)
       {
           cout<<"|"<<temp->data<<"|->";

           temp = temp -> next;
       }        
       cout<<"NULL\n";
   }
   int Count()
   {
    return iCount;
   }
   
   void InsertFirst(int No)
   {
      PNODE newn =NULL;
      
      newn = new NODE;

      newn -> data = No;
      newn -> next = NULL;

      if(first == NULL)
      {
         first = newn;
      }
      else
      {
         newn -> next = first;
         first = newn;
      }
      iCount++;
      
   }

   void DisplayPrime()
   { 
      int iNo = 0;
      int iCnt = 0;
      int iSum = 0;

    PNODE temp = NULL;
      temp = first;

     while (temp != NULL)
     { 
        iNo = temp -> data;
       iSum = 0;
        for(iCnt = 2; iCnt <= iNo ; iCnt++)
        {

            if((iNo % iCnt == 0))
            {
                iSum = iSum + iCnt;
            }
           
        }
        if(iSum == iNo)
        {
            cout<<iSum<<" it is Prime Number \n";
        }
        temp = temp ->next;
     }
     cout<<"\n";
    }

};
int main()
{
   SinglyLinerLL sobj;

  sobj.InsertFirst(89);
  sobj.InsertFirst(6);
  sobj.InsertFirst(22);
  sobj.InsertFirst(41);
  sobj.InsertFirst(17);
  sobj.InsertFirst(20);
  sobj.InsertFirst(11);

 sobj.DisplayPrime();

  sobj.Display();

    return 0;

}