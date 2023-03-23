#include <stdio.h>
#include <stdlib.h>
#include <string.h>
struct node
{
    char *str;
    struct node *next;
} *top;

void push(char *word)
{
    struct node *new_node = malloc(sizeof(struct node));
    int i;
    new_node->str = word;
    new_node->next = NULL;
    if (top == NULL)
    {
        top = new_node;
    }
    else
    {
        new_node->next = top;
        top = new_node;
    }
}
void display()
{
    struct node *temp = top;
    while (temp != NULL)
    {
        printf("%s ", temp->str);
        temp = temp->next;
    }
}
void main()
{
    char str[] = "Technical Interview Preparation";
    char *word = strtok(str, " ");
    while (word != NULL)
    {
        push(word);
        word = strtok(NULL, " ");
    }
    display();
}