#include <stdio.h>
#include <string.h>
int m, n;
int isInside(int i, int j)
{
    if (i >= 0 && j >= 0 && i < m && j < n)
        return 1;
    return 0;
}
void main()
{
    scanf("%d", &m);
    scanf("%d", &n);
    char arr[m][n + 1];
    for (int i = 0; i < m; i++)
    {
        scanf("%s", arr[i]);
    }
    int visit[m][n];
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            visit[i][j] = 0;
        }
    }
    char match[30];
    scanf("%s", &match);
    int inx = 0;
    int x, y;
    int flag = 0;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (arr[i][j] == match[inx])
            {
                x = i;
                y = j;
                inx++;
                visit[x][y] = 1;
                while (inx < strlen(match))
                {
                    if (isInside(x, y + 1) == 1 && visit[x][y + 1] == 0 && arr[x][y + 1] == match[inx])
                    {
                        y = y + 1;
                        visit[x][y] = 1;
                        inx++;
                    }
                    else if (isInside(x + 1, y) == 1 && visit[x + 1][y] == 0 && arr[x + 1][y] == match[inx])
                    {
                        x = x + 1;
                        visit[x][y] = 1;
                        inx++;
                    }
                    else if (isInside(x, y - 1) == 1 && visit[x][y - 1] == 0 && arr[x][y - 1] == match[inx])
                    {
                        y = y - 1;
                        visit[x][y] = 1;
                        inx++;
                    }
                    else if (isInside(x - 1, y) == 1 && visit[x - 1][y] == 0 && arr[x - 1][y] == match[inx])
                    {
                        x = x - 1;
                        visit[x][y] = 1;
                        inx++;
                    }
                    else
                    {
                        for (int i = 0; i < m; i++)
                        {
                            for (int j = 0; j < n; j++)
                                visit[i][j] = 0;
                        }
                        inx = 0;
                        break;
                    }
                }
                if (inx != 0)
                    flag = 1;
            }
            if (flag == 1)
                break;
        }
        if (flag == 1)
            break;
    }
    if (flag == 1)
        printf("True");
    else
        printf("False");
}