#include <stdio.h>
#include <stdlib.h>

struct abc{
    int a;
    struct abc *next;
};
struct abc *p, *head=NULL;

void addFirst( int data ){
    p=(struct abc*)malloc(sizeof(struct abc));
    p->a=data;
    if(head==NULL)
        p->next=NULL;
    else
        p->next=head;
    head=p;
}

void addLast(int data){
    p=(struct abc*)malloc(sizeof(struct abc));
    p->a=data;
    p->next=NULL;
    struct abc *currHead=head;
    if(currHead==NULL){
        currHead=p;
        return;
    }
    while(currHead->next!=NULL){
        currHead=currHead->next;
    }
    currHead->next=p;
}

void deleteFirst(){
    if(head==NULL){
        return;
    }

    head=head->next;
}

void deleteLast(){
    if(head==NULL){
        return;
    }
    if(head->next==NULL){
        head=NULL;
        return;
    }
    struct abc *currHead=head;
    struct abc *lastNode=head->next;
    while(lastNode->next!=NULL){
        currHead=currHead->next;
        lastNode=lastNode->next;
    }
    printf("Deleted element is %d\n", currHead->a);
    currHead->next=NULL;
    
}

void display(){
    struct abc *currHead=head;
    while(currHead!=NULL){
        printf("%d -> ", currHead->a);
        currHead=currHead->next;
    }
    printf("NULL\n");
}

int main(){

    printf("1. Add first\n");
    printf("2. Add last\n");
    printf("3. Delete first\n");
    printf("4. Delete last\n");
    printf("5. Display\n");
    printf("6. Exit\n");
    int choice, data;
    while(1){
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch(choice){
            case 1:
                printf("Enter data: ");
                scanf("%d", &data);
                addFirst(data);
                break;
            case 2:
                printf("Enter data: ");
                scanf("%d", &data);
                addLast(data);
                break;
            case 3:
                deleteFirst();
                break;
            case 4:
                deleteLast();
                break;
            case 5:
                display();
                break;
            case 6:
                return 0;
            default:
                printf("Invalid choice\n");
        }
    }

    return 0;
}