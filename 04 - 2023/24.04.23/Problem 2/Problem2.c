/*
Given a positive number n, find the total number of ways in which n hats can be returned to n people such that no hat makes it back to its owner.

This problem is known as the hat–check problem and can be solved by counting the number !n of derangements of an n–element set. A derangement is a permutation of a set’s elements, such that no element appears in its original position.
For example,

Input:  2–hat set [h1, h2]

Output: The total number of derangements !2 is 1

[h2, h1]

Input:  4–hat set [h1, h2, h3, h4]

Output: The total number of derangements !4 is 9

[h2, h1, h4, h3]
[h2, h3, h4, h1]
[h2, h4, h1, h3]
[h3, h4, h1, h2]
[h3, h1, h4, h2]
[h3, h4, h2, h1]
[h4, h1, h2, h3]
[h4, h3, h1, h2]
[h4, h3, h2, h1]
*/
#include <stdio.h>
int n;
int count = 0;
void swap(char arr[n][3], int i, int j)
{
    char temp[1][3];
    temp[0][0] = arr[i][0];
    temp[0][1] = arr[i][1];

    arr[i][0] = arr[j][0];
    arr[i][1] = arr[j][1];

    arr[j][0] = temp[0][0];
    arr[j][1] = temp[0][1];
}

void solve(char arr[n][3], int l, int r)
{
    if (l == r)
    {
        int flag = 1;
        for (int i = 0; i < n; i++)
        {
            if (((int)arr[i][1] - 49) == i)
            {
                flag = 0;
                break;
            }
        }
        if (flag == 1)
        {
            for (int i = 0; i < n; i++)
            {
                if (((int)arr[i][1] - 49) == i)
                {
                    flag = 0;
                    break;
                }
                printf("%s ", arr[i]);
            }
            printf("\n");
            count++;
        }
    }
    else
    {
        for (int i = l; i <= r; i++)
        {
            swap(arr, l, i);
            solve(arr, l + 1, r);
            swap(arr, l, i);
        }
    }
}

void main()
{
    scanf("%d", &n);
    char arr[n][3];
    for (int i = 0; i < n; i++)
    {
        scanf("%s", arr[i]);
    }
    int l = 0, r = n - 1;

    printf("\nAnswer:\n");
    solve(arr, l, r);
    printf("\nCombinations: %d",count);
}