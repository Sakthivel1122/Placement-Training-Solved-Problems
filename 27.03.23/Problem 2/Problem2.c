#include <stdio.h>
#include <stdlib.h>

struct node
{
    char str[10];
    struct node *next;
} *head, *tail, *head2, *tail2;

void inserth2(char s[10])
{
    struct node *new_node = malloc(sizeof(struct node));
    int i;
    for (i = 0; s[i] != '\0'; i++)
    {
        new_node->str[i] = s[i];
    }
    new_node->str[i] = '\0';
    new_node->next = NULL;
    if (head2 == NULL)
    {
        head2 = new_node;
        tail2 = new_node;
    }
    else
    {
        tail2->next = new_node;
        tail2 = new_node;
    }
}

void insert(char *s)
{
    struct node *new_node = malloc(sizeof(struct node));
    int i;
    for (i = 0; s[i] != '\0'; i++)
    {
        new_node->str[i] = s[i];
    }
    new_node->str[i] = '\0';
    new_node->next = NULL;
    if (head == NULL)
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

int count(struct node *temp)
{
    int num = 0;
    while (temp != NULL)
    {
        // printf("%s ",temp->str);
        int i;
        for (i = 0; temp->str[i] != '\0'; i++);
        num += i;
        temp = temp->next;
    }
    return num;
}

void display(struct node *temp)
{
    while (temp != NULL)
    {
        printf("%s ", temp->str);
        temp = temp->next;
    }
}

void check(char str[10])
{
    int arr[26] = {0};
    for (int i = 0; str[i] != '\0'; i++)
    {
        arr[str[i] - 97]++;
    }

    struct node *temp = head;
    while (temp != NULL)
    {
        int arr2[26];
        for (int i = 0; i < 26; i++)
            arr2[i] = arr[i];
        int flag = 1;
        for (int i = 0; temp->str[i] != '\0'; i++)
        {
            char ch = temp->str[i];
            if (arr2[ch - 97] > 0)
            {
                arr2[ch - 97]--;
            }
            else
            {
                flag = 0;
                break;
            }
        }
        if (flag == 1)
        {
            inserth2(temp->str);
        }
        temp = temp->next;
    }
}
void main()
{
    int n;
    scanf("%d", &n);
    while (n--)
    {
        char str[10];
        scanf("%s", str);
        insert(str);
    }
    char str[10];
    scanf("%s", str);
    check(str);
    // display(head);
    display(head2);
    int res = count(head2);
    printf("%d", res);
}