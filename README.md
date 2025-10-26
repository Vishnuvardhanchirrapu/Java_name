#include<stdio.h>
#define max 5  // macroooooooooo
int front = -1,rear = -1;
int arr[max];
void enqueue(int x){
    if((rear == max -1 && front == 0) || front == rear +1 ){
        printf("\nQueue is FULL   !!!\n"); return ;
    }
    if(front == -1) front = rear = 0;
    else rear = (rear +1)% max;
    arr[rear] = x;
    printf("%d is enqueued into the queue !!\n",x);
}
void dequeue(){
    if(front ==-1 || (rear < max -1 && front == rear +1)){
        printf("\nQueue is empty !!\n"); return ;
    }
    printf("%d is dequeded from the queue !!!\n",arr[front]);
    if(rear == max -1 && front == rear) {
        printf("\nQueue is empty !!!\n");
        front = (front+1) % max;
        return;
    }
    front = (front+1) % max;
} 
void display(){
    int f = front;
    if(f == -1) {
        printf("\nQueue is empty !!!\n"); return;
    } printf("\nQueue elements are :");
    while(1){
        printf("%d ",arr[f]);
        
        if(f == rear){ break;}
        
        f = (f + 1)% max;
    }
}
int main(){
    enqueue(1); enqueue(2); enqueue(3); enqueue(4); enqueue(5); dequeue(); enqueue(6); display();
    
    
    return 0;
}
