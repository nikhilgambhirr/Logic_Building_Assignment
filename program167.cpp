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
       
       while( first != NULL)
       {
           cout<<"|"<<first->data<<"|->";

           first = first -> next;
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

   int SearchLastOcc(int No)
   {  
       int pos = 1, Lastpos = 0;
       PNODE temp = NULL;

       temp = first;

       while ( temp != NULL)
       {
          if(temp -> data == No)// jar number milala tr last pos madhe thev
          {
             Lastpos = pos;  
          }
        
           temp = temp ->next; 
           pos++;   // 1 ne pude chal
       }
       return Lastpos;
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

  cout<<"Enter the elements :\n";
  cin >>iValue;

  iRet = sobj.SearchLastOcc(iValue);

  cout<<"Last Occurenceof element Fount Position :"<<iRet<<"\n";

  sobj.Display();

    
    return 0;

}