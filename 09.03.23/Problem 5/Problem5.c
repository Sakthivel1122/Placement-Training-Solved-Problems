#include <stdio.h>

void main()
{
    int A[] = {1, 9, 6, 4, 5};
    int n = sizeof(A) / sizeof(A[0]);
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if(i < j && A[i] > A[j])
                count++;
        }
    }
    printf("%d",count);
}