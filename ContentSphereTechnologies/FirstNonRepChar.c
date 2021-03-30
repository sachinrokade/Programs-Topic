#include<stdio.h>
#include<string.h>
char returnFirstNonRepeatedChar(char*);
int main() 
{
    char *str="Nitin";
    printf("First Non Repeated Char = %c",returnFirstNonRepeatedChar(str));
    return 0;
}
char returnFirstNonRepeatedChar( char * str )
{
    int i, repeated = 0;
    int len = strlen(str);
    int j;
    for( i = 0; i < len; i++)
    {
        repeated = 0;
        for( j = 0; j < len; j++ )
        {
            if( i != j && str[i] == str[j] ) 
            {
                repeated = 1;
                break;
            }
        }         
        if( repeated == 0 )
        {  // Found the first non-repeated character
            return str[i];
        }
    }
    return '\0';
} 