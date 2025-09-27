#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node *next;
};
struct Node *head=NULL, *p;

int addNode(int data){
    p=(struct Node *)malloc(sizeof(struct Node));
    p->data=data;
    p->next=NULL;
    if(head==NULL){
        head=p;
        return 0;
    }
    
    return 0;
}

int addAtN(int data, int position){
    p=(struct Node *)malloc(sizeof(struct Node));
    p->data=data;
    p->next=NULL;
    if(head==NULL){
        if(position!=0){
            printf("List is empty, so position should be 0\n");
            return 0;
        }
        head=p;
        return 0;
    }
    struct Node *temp=head;
    for(int i=1; i<position; i++){
        temp=temp->next;
        if(temp==NULL){
            printf("Position is out of range\n");
            return 0;
        }
    }
    if(temp->next!=NULL){
        p->next=temp->next;
        temp->next=p;
    }else{
        temp->next=p;
    }
    return 0;
}