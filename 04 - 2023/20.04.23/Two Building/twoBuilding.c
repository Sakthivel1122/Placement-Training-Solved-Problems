#include <stdio.h>
#include <stdlib.h>
int mini(int n1, int n2)
{
    return (n1 < n2) ? n1 : n2;
}
void main()
{
    int arr[] = {1, 3, 4};
    int len = 3;
    int max = 0;
    for (int i = 0; i < len; i++)
    {
        for (int j = i + 1; j < len; j++)
        {
            if (max < (j - i - 1) * mini(arr[i], arr[j]))
            {
                max = (j - i - 1) * mini(arr[i], arr[j]);
            }
        }
    }
    printf("%d", max);
}