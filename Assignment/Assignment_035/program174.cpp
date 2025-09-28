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

   int SecMaximum()
   {  
       int iMax = 0, iMax2 = 0;
      PNODE temp = NULL;

       temp = first;

       iMax = temp->data;
    
       while (temp != NULL)
       {
        if( temp -> data > iMax )
        {   iMax2 = iMax;
            iMax = temp -> data;
        }
        
         if(temp->data >iMax2 && temp-> data != iMax )
         {
            iMax2 = temp->data;
         }
         temp = temp->next;
       }
       
        return iMax2;
   }
        

};
int main()
{
   SinglyLinerLL sobj;
   int iRet = 0, iValue = 0;

  sobj.InsertFirst(600);
  sobj.InsertFirst(20);
  sobj.InsertFirst(500);
  sobj.InsertFirst(400);
  sobj.InsertFirst(300);
  sobj.InsertFirst(200);
  sobj.InsertFirst(100);


  iRet = sobj.SecMaximum();

  cout<<"Secound Maximum Number are :"<<iRet<<"\n";

  sobj.Display();

    
    return 0;

}