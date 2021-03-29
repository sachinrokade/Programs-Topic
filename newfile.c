#include<stdio.h>  
void main() 
{  
   int a = 10;
   int b = 20;
   int c=0;  
   
   asm 
   {  
      mov ax,a  ;
      mov bx,b  ;
      add ax,bx  ;
      mov c,ax  ;
   }  
   
   printf("c= %d",c);  
}  
