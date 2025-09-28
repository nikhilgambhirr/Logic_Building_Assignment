#include<iostream>
using namespace std;

class Array
{
  protected:
      int *Arr;
      int Size;
   public:
       Array(int Value = 10)
       {
             cout<<"Inside Connsructor\n";
           this->Size = Value;
           this->Arr = new int[Size];  
       }   
       Array(Array &ref)
       {
               cout<<"Inside copy Connstructor\n";
               this->Size = ref.Size;
               this->Arr = new int[this->Size];

               for(int i = 0;i < Size;i++)
               {
                  this->Arr[i] = ref.Arr[i];
               }
       }
       ~Array()
       {
          cout<<"Inside Destructor\n";
          delete[]Arr;
             
       }
       
       inline void Accept();
       inline void Display();
};

void Array :: Accept()
{
    cout<<"Please enter the value\n";
    for(int i = 0; i < this->Size; i++)
    {
        cin>>Arr[i];
    }
}
void Array:: Display()
{
     cout<<"Element are \n";
     for(int i = 0; i <this->Size; i++)
     {
         cout<<Arr[i]<<" ";
     }
         cout<<"\n";

}
class ArrSearch : public Array
{
       public:
          ArrSearch(int no = 10) : Array(no)
          {}
          int Frequency(int);
          int SearchFirst(int);
          int SearchLast(int);
          int EvenCount();
          int OddCount();
};
 int ArrSearch :: SearchFirst(int Value)
 {
    int i = 0;
    for(i = 0; i < Size; i++)
    {
         if(Arr[i]== Value)
         {
          break;
         }
    }

    if(i == Size)
    {
      return -1;
    }
    else
    {
       return i +1;
    }
 }
 int ArrSearch :: Frequency(int Value)
 {
      int iCnt = 0;
      for(int i = 0; i < Size;i++)
      {
          if(Arr[i] == Value)
          {
             iCnt++;
          }
      }
      return iCnt;
 }
 int ArrSearch::SearchLast(int Value)
 {   
    int i = 0, iPos = -1;
    for(i = 0; i < Size; i++)
    {
         if(Arr[i] == Value)
         {
           iPos = i;
         }
    }

    if(iPos == -1)
    {
      return -1;
    }
    else
    {
       return iPos +1;
    }
 }
 int main()
 {
     cout<<"inside main\n";
     
     ArrSearch sobj1(5);
     sobj1.Accept();
     sobj1.Display();

     int ret = sobj1.Frequency(10);

     cout<<"Frequency is "<<ret<<"\n";

     ret = sobj1.SearchFirst(10);
     cout<<"First occurname is is "<<ret<<"\n";

         ret = sobj1.SearchLast(25);
     cout<<"Last occurname is is "<<ret<<"\n";


    return 0;
 }