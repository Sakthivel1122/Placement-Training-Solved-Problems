#include <stdio.h>
#include <math.h>
#include <stdlib.h>
int mini(int x, int y)
{
    return (x < y) ? x : y;
}
int longSubStr(char str1[20], char str2[20], int m, int n)
{
    int dp[m + 1][n + 1];
    for (int i = 0; i <= m; i++)
    {
        for (int j = 0; j <= n; j++)
        {
            if (i == 0)
                dp[i][j] = j;
            else if (j == 0)
                dp[i][j] = i;
            else if (str1[i - 1] == str2[j - 1])
                dp[i][j] = dp[i - 1][j - 1];
            else
                dp[i][j] = 1 + mini(mini(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]);
        }
    }

    // for (int i = 0; i <= m; i++)
    // {
    //     for (int j = 0; j <= n; j++)
    //     {
    //         printf("%d ",dp[i][j]);
    //     }
    //     printf("\n");
    // }
    return dp[m][n];
}
void main()
{
    char str1[20];
    char str2[20];
    scanf("%s", &str1);
    scanf("%s", &str2);
    int m, n;
    for (m = 0; str1[m] != '\0'; m++)
        ;
    for (n = 0; str2[n] != '\0'; n++)
        ;
    printf("%d", longSubStr(str1, str2, m, n));
}