#include<stdio.h>
int stack[10];
int call_stack[10];
int s_top = -1;
int c_top = -1;
void c_push(int data)
{
    c_top++;
    call_stack[c_top] = data;
}
int c_pop()
{
    int ret = call_stack[c_top];
    c_top--;
    return ret;
}
int s_pop()
{
    int ret = stack[s_top];
    s_top--;
    return ret;
}
void ns_push(int data)
{
    s_top++;
    stack[s_top] = data;
}
void s_push(int data)
{
    while(s_top != -1)
    {
        c_push(s_pop());
    }
    s_top++;
    stack[s_top] = data;
    while(c_top != -1)
    {
        ns_push(c_pop());
    }
}
void display()
{
    int top = s_top;
    while(top != -1)
    {
        printf("%d ",stack[top]);
        top--;
    }
}
void main()
{
    s_push(1);
    s_push(2);
    s_push(3);
    s_push(4);
    s_push(5);
    printf("Reversed stack: ");
    display();
}