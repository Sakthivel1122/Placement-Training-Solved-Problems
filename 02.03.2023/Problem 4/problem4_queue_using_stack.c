#include <stdio.h>
#include<stdlib.h>
int size = 10;
int stack1[10], stack2[10];
int top1 = -1;
int top2 = -1;

void enqueue(int data)
{
    if (top1 == size - 1)
    {
        printf("Queue is full\n");
    }
    else
    {
        top1++;
        stack1[top1] = data;
    }
}

void dequeue()
{
    if (top1 == -1)
    {
        printf("Queue is empty\n");
    }
    else
    {
        while (top1 != -1)
        {
            top2++;
            stack2[top2] = stack1[top1];
            top1--;
        }
        top2--;
        while (top2 != -1)
        {
            top1++;
            stack1[top1] = stack2[top2];
            top2--;
        }
    }
}
void display()
{
    if(top1 == -1)
    {
        printf("Queue is empty\n");
    }
    else
    {
        while (top1 != -1)
        {
            top2++;
            stack2[top2] = stack1[top1];
            top1--;
        }
        while (top2 != -1)
        {
            top1++;
            printf("%d ",stack2[top2]);
            stack1[top1] = stack2[top2];
            top2--;
        }
        printf("\n");
    }
}
void main()
{
    int data;
    int choice;
    while(1)
    {
        printf("1.Enqueue\n2.Dequeue\n3.display\n4.Exit\n");
        printf("Enter your choice: ");
        scanf("%d",&choice);
        switch (choice)
        {
        case 1:
            printf("Enter data to enqueue: ");
            scanf("%d",&data);
            enqueue(data);
            break;
        case 2:
            dequeue();
            break;
        case 3:
            display();
        default:
            break;
        }
    }
}