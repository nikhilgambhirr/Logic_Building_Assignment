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


   void DisplayPallindrome()
   { 
      
     PNODE temp = NULL;

       temp = first;
        
       while(temp != NULL)
       {
        int iNo = temp ->data;
        int Rev = 0, tam = iNo;
       while(iNo != 0)
       {
             
            Rev = (Rev * 10) + (iNo % 10);
            iNo = iNo / 10;
          
       }
      if( tam == Rev)
      {
            cout<<"|"<< tam<<"|->";
      }
      temp = temp ->next;
      
   }
   cout<< "\n";   
 } 

};


int main()
{
   SinglyLinerLL sobj;
   int iRet = 0, iValue = 0;

  sobj.InsertFirst(89);
  sobj.InsertFirst(20);
  sobj.InsertFirst(6);
  sobj.InsertFirst(414);
  sobj.InsertFirst(17);
  sobj.InsertFirst(28);
  sobj.InsertFirst(11);

   sobj.DisplayPallindrome();
   sobj.Display();
  

    return 0;

}