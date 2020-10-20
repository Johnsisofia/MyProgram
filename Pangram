//To check whether a string is pangram or not
#include <stdio.h>
#include <string.h>
int main()
{
    char string[100];
    int alpha[26]={0},count=0;
    printf("Enter your string:");
    gets(string);
    for(int i=0;i<strlen(string);i++)
    {
        if(string[i]>='A' && string[i]<='Z')
            alpha[string[i]-65]++;
        else
            alpha[string[i]-97]++;
    }
    for(int i=0;i<26;i++)
    {
        if(alpha[i]==0)
           count++;
    }
    if(count==0)
      printf("pangram");
    else
      printf("Not pangram");
}
