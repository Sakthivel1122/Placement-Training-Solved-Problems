#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    int pos;
    struct node *next;
} *head,*tail;
int p = 0;
void insert(int data)
{
    struct node *new_node = malloc(sizeof(struct node));
    new_node->data = data;
    new_node->pos = p;
    p++;
    new_node->next = NULL;
    if(head == NULL)
    {
        head = new_node;
        tail = new_node;
    }
    else
    {
        tail->next = new_node;
        tail = new_node;
    }
}
int count()
{
    struct node *temp1 = malloc(sizeof(struct node));
    struct node *temp2 = malloc(sizeof(struct node));
    temp1 = head;
    int count = 0;
    while(temp1 != NULL)
    {
        temp2 = head;
        while(temp2 != NULL)
        {
            if(temp1->pos < temp2->pos && temp1->data > temp2->data)
            {
                count++;
            }
            temp2 = temp2->next;
        }
        temp1 = temp1->next;
    }
    return count;
}
void main()
{
    insert(1);
    insert(9);
    insert(6);
    insert(4);
    insert(5);

    printf("%d",count());
}