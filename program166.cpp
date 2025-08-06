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

   int SearchFirstOcc(int No)
   {  
       
       int iCnt = 1;

       while ( first != NULL)
       {
          if(first -> data == No)
          {
            return iCnt;
          }
          iCnt++;
           first = first ->next;
       }
       
   }
        

};
int main()
{
   SinglyLinerLL sobj;
   int iRet = 0, iValue = 0;

  sobj.InsertFirst(60);
  sobj.InsertFirst(50);
  sobj.InsertFirst(40);
  sobj.InsertFirst(30);
  sobj.InsertFirst(20);
  sobj.InsertFirst(10);

  cout<<"Enter the elements :\n";
  cin >>iValue;

  iRet = sobj.SearchFirstOcc(iValue);

  cout<<"First Occurenceof element Fount Position :"<<iRet<<"\n";

  sobj.Display();

    
    return 0;

}