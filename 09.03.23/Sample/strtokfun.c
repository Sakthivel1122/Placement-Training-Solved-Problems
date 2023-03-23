#include<stdio.h>
#include<string.h>
void main()
{
    char str[] = "Hi i am Sakthivel";

    char *word = strtok(str," ");
    while(word != NULL)
    {
        printf("%s ",word);
        word = strtok(NULL," ");
    }
}