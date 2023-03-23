#include<stdio.h>
int stack[10];
int top = -1;
void push(int data)
{
    top++;
    stack[top] = data;
}
int peek(){
    return stack[top];
}
void pop()
{
    top--;
}
void deletemid(int n,int current)
{
    if(current == -1)return;

    int x = peek();
    pop();

    deletemid(n,current-1);

    if(current != n / 2){
        push(x);
    }
}
void display()
{
    int temp = top;
    while(temp != -1)
    {
        printf("%d ",stack[temp]);
        temp--;
    }
    printf("\n");
}
void main()
{
    push(1);
    push(2);
    push(3);
    push(4);
    push(5);
    // push(6);
    // push(7);
    printf("Before: ");
    display();
    deletemid(top+1,top);
    printf("After : ");
    display();
}