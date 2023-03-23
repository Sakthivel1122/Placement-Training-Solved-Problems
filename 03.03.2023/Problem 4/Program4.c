#include <stdio.h>
int size = 10;
int stack[10];
int temp_stack[10];
int top = -1;
int t_top = -1;

void insert(int data)
{
    top++;
    stack[top] = data;
}
int peek()
{
    if (top == -1)
        return 0;
    return stack[top];
}
int t_peek()
{
    if (t_top == -1)
        return -1;
    return temp_stack[t_top];
}
void t_insert(int data)
{
    t_top++;
    temp_stack[t_top] = data;
}
void pop()
{
    if (top == -1)
        return;
    top--;
}
void t_pop()
{
    if (t_top == -1)
        return;
    t_top--;
}
void sort()
{
    while (top > -1)
    {
        if (t_top == -1)
        {
            t_insert(peek());
            pop();
        }
        while (t_peek() > peek())
        {
            t_insert(peek());
            pop();
            if (top == -1)
                break;
        }
        if (top != -1)
        {
            int num = peek();
            pop();
            while (num > t_peek())
            {
                insert(t_peek());
                t_pop();
                if (t_top == -1)
                    break;
            }
            t_insert(num);
        }
    }
}
void display_stack()
{
    for (int i = top; i >= 0; i--)
        printf("%d\n", stack[i]);
    printf("\n");
}
void display_temp_stack()
{
    for (int i = t_top; i >= 0; i--)
        printf("%d\n", temp_stack[i]);
    printf("\n");
}
void tran_t_to_s()
{
    if(t_top != -1)
    {
        while(t_top > -1)
        {
            insert(t_peek());
            t_pop();
        }
    }
}
void main()
{
    insert(11);
    insert(2);
    insert(32);
    insert(3);
    insert(41);
    display_stack();
    sort();
    display_stack();
}