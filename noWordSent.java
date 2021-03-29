/*
 #include <stdio.h>
void countword(char[]);
#define MAX_SIZE 100 //Maximum size of the string
 
int main()
{
    char string[MAX_SIZE];
    int i, words;
 
    printf("Enter any string: ");
    gets(string);
    countword(string);
    return 0;
}
void countword(char string[])
{
    int i = 0;
    int words = 1;
 
    while(string[i]!='\0')
    {
         //If the current character(string[i]) is white space 
        if(string[i]==' ' || string[i]=='\n' || string[i]=='\t')
        {
            words++;
        }
 
        i++;
    }
 
    printf("Total number of words = %d\n", words);
 
    
}
 */
public class noWordSent 
{
    static int i,c=0,res;
    static int wordcount(String s)
    {
        char ch[]= new char[s.length()];      //in string especially we have to mention the () after length
        for(i=0;i<s.length();i++)
        {
            ch[i]= s.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
            c++;
        }
        return c;
    }
    
    public static void main (String args[])
    {
        res=noWordSent.wordcount("We test coders Give us a try");
        //string is always passed in double quotes
        
        System.out.println("The number of words in the String are :  "+res);
    }
}
