#include <stdio.h>

void main()
{
    char str[] = "Technical Interview Preparation";
    int len;
    for (len = 0; str[len] != '\0'; len++)
        ;
    int start = len+1;
    int end = 0;
    int i;
    for (i = len - 1; i >= 0; i--)
    {
        if (str[i] == ' ')
        {
            end = start;
            start = i + 1;
            for (int j = start; j < end-1; j++)
                printf("%c", str[j]);
            printf(" ");
        }
    }
    end = start;
    start = i + 1;
    for (int j = start; j < end; j++)
        printf("%c", str[j]);
    printf(" ");
}