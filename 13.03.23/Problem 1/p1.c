#include <stdio.h>
int triangle(int n)
{
    return (n * (n + 1)) / 2;
}
int pentagonal(int n)
{
    return (n * ((3 * n) - 1)) / 2;
}
int hexagonal(int n)
{
    return (n * ((2 * n) - 1));
}
void main()
{
    int tri = 285;
    int penta = 165;
    int hexa = 143;
    int count = 0;
    while (count != 2)
    {
        printf("HI");
        if (triangle(tri) == pentagonal(penta) && pentagonal(penta) == hexagonal(hexa))
        {
            printf("HI");
            count++;
            if (count == 2)
                break;
            if (tri < penta && tri < hexa)
                tri++;
            else if (penta < tri && penta < hexa)
                penta++;
            else if (hexa < tri && hexa < penta)
            {
                hexa++;
                printf("HEXA\n");
            }
            printf("%d\n", tri);
            printf("%d\n", penta);
            printf("%d\n\n", hexa);
            // break;
        }
        // printf("%d\n", tri);
        // printf("%d\n", penta);
        // printf("%d\n\n", hexa);
        if (triangle(tri) < pentagonal(penta))
        {
            if (triangle(tri) < hexagonal(hexa))
                tri++;
            else
                hexa++;
        }
        else if (triangle(tri) == pentagonal(penta))
        {
            if (tri < penta)
            {
                if (triangle(tri) < hexagonal(hexa))
                {
                    tri++;
                }
                else
                {
                    hexa++;
                }
            }
            else
            {
                if (pentagonal(penta) < hexagonal(hexa))
                {
                    penta++;
                }
                else
                {
                    hexa++;
                }
            }
        }
        else if (pentagonal(penta) < hexagonal(hexa))
        {
            penta++;
        }
        else if (pentagonal(penta) == hexagonal(hexa))
        {
            if (penta < hexa)
                penta++;
            else
                hexa++;
        }
        else
        {
            hexa++;
        }
        // printf("%d\n", tri);
        // printf("%d\n", penta);
        // printf("%d\n\n", hexa);
        // break;
        printf("HI");
    }
    printf("%d\n", tri);
    printf("%d\n", penta);
    printf("%d", hexa);
}