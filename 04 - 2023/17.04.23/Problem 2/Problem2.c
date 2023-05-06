#include<stdio.h>
#include<string.h>
char* solve(char str[30],int l,int r)
{
    if(l == r){
        return str;
    }
    if(l-r == 1 || r-l == 1){
        char ch = str[l];
        str[l] = str[r];
        str[r] = ch;
        return str;
    }
    int mid = (l+r)/2;
    return strcat(solve(str,l,mid-1), solve(str,mid,r));
}
void main()
{
    char str1[] = "great";
            //     01234
    char str2[] = "rgeat";
    printf("%s",solve(str1,0,4));
}