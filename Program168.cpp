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

   int Addition()
   {  
       int iSum = 0;
       
       while (first != NULL)
       {
         iSum = iSum + first->data;
         first = first -> next;
       }
       
        return iSum;
   }
        

};
int main()
{
   SinglyLinerLL sobj;
   int iRet = 0, iValue = 0;

  sobj.InsertFirst(70);
  sobj.InsertFirst(20);
  sobj.InsertFirst(50);
  sobj.InsertFirst(40);
  sobj.InsertFirst(30);
  sobj.InsertFirst(20);
  sobj.InsertFirst(10);


  iRet = sobj.Addition();

  cout<<"Additin for all Number from list :"<<iRet<<"\n";

  sobj.Display();

    
    return 0;

}