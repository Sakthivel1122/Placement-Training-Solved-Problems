#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *left;
    struct node *right;
} *root = NULL;

struct node *return_new_node(int data)
{
    struct node *new_node = malloc(sizeof(struct node));
    new_node->data = data;
    new_node->left = NULL;
    new_node->right = NULL;
    return new_node;
}
struct node *insert(int data)
{
    return return_new_node(data);
}

int tree_sum(struct node *node)
{
    if (node == NULL)
        return 0;

    return node->data + tree_sum(node->left) + tree_sum(node->right);
}
int isSumTree(struct node *root)
{
    if (root == NULL)
        return 1;

    if (root->left == NULL && root->right == NULL)
        return 1;

    if (root->data == (tree_sum(root->left) + tree_sum(root->right)))
    {
        return isSumTree(root->left) && isSumTree(root->right);
    }
    else
        return 0;
}
void main()
{
    root = insert(26);
    root->left = insert(10);
    root->right = insert(3);
    root->left->left = insert(4);
    root->left->right = insert(6);
    root->right = insert(3);
    root->right->right = insert(4);

    if (isSumTree(root))
        printf("Tree is SumTree");
    else
        printf("Tree is not a SumTree");
}