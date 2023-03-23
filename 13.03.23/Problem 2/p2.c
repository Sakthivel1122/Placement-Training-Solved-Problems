#include <stdio.h>
#include <math.h>
long mini(long a,long b){
    if(a < b)return a;
    else 
    return b;
}
void main()
{
    int t = 286;
    int p = 166;
    int h = 144;
    int count = 0;
    while (1)
    {
        long tri = (t * (t + 1)) / 2;
        long penta = (p * ((3 * p) - 1)) / 2;
        long hexa = h*((2*h)-1);
        long min = mini(mini(tri,penta),hexa);
        printf("%d\n",min);
        // break;
        if(min == tri && min == penta && min == hexa)
        {
            break;
        }
        if(min == tri)t++;
        if(min == penta)p++;
        if(min == hexa)h++;
    }
    printf("%d",t);
}