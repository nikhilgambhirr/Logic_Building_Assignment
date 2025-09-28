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

   int DisplayPerfect()
   { 
      int Num = 0, iNo = 0,iSum = 0, i = 0;
     PNODE temp = NULL;

     temp = first;

     cout<<"Perfect Number is : ";

     while (temp != NULL)
     {
        iNo = temp->data;
        iSum = 0;

        for(i = 1; i <= iNo / 2; i++ )
        {
             if(iNo % i == 0)
             {
                iSum += i;
             }
        }

        if(iSum == iNo)
        {
            cout<<iNo<<" , ";
        }
       temp = temp -> next;
        
     }
     cout<<"\n";
   }
        

};
int main()
{
   SinglyLinerLL sobj;
   int iRet = 0, iValue = 0;

  sobj.InsertFirst(89);
  sobj.InsertFirst(6);
  sobj.InsertFirst(22);
  sobj.InsertFirst(41);
  sobj.InsertFirst(17);
  sobj.InsertFirst(28);
  sobj.InsertFirst(12);

 sobj.DisplayPerfect();

  sobj.Display();

    return 0;

}