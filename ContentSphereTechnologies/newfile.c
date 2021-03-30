#include<stdio.h>
#include<conio.h>
#include<math.h>
#include<string.h>
int main()
{
   // int n=5;
    int f=fact(5);
    printf("\n %d",f);
        getch();
        return 0;
}
int fact(int in)
{
     int f=1;
     int i;
     if(in==1)
        return 1;
    else
        f=in*fact(in-1);
     
    
    return f;
}
