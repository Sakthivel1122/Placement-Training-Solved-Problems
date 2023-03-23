#include<stdio.h>
int main_stack[10];
int aux_stack[10];
int m_top = -1;
int a_top = -1;
int min = 0;
int a_peek()
{
    return aux_stack[a_top];
}
void a_push(int data)
{
    a_top++;
    aux_stack[a_top] = data;
}
void m_push(int data)
{
    m_top++;
    main_stack[m_top] = data;
    if(a_top == -1 || a_peek() > data)
    {
        a_push(data);
    }
}
void a_pop()
{
    a_top--;
}
void m_pop()
{
    if(main_stack[m_top] == a_peek())
    {
        a_pop();
    }
    m_top--;
}
void main()
{
    m_push(6);
    printf("%d\n",aux_stack[a_top]);

    m_push(7);
    printf("%d\n",aux_stack[a_top]);

    m_push(8);
    printf("%d\n",aux_stack[a_top]);

    m_push(5);
    printf("%d\n",aux_stack[a_top]);

    m_push(3);
    printf("%d\n",aux_stack[a_top]);

    m_pop();
    printf("%d\n",aux_stack[a_top]);

    m_push(10);
    printf("%d\n",aux_stack[a_top]);

    m_pop();
    printf("%d\n",aux_stack[a_top]);

    m_pop();
    printf("%d\n",aux_stack[a_top]);
}