#include<stdio.h>
#include<conio.h>
#define SIZE 20
int arr[SIZE],front=-1,rear=-1;
int isEmpty()
{
	if(front==-1)
	   return 1;
	else 
	return 0;   
}
void enqueue(int item)
{
	rear++;
	arr[rear]=item;
	if(front==-1)
	front++;
}
int dequeue()
{
	int u= arr[front];
	if(rear==front)
	front=rear=-1;
	else
	front++;
	return u;
}
void BFS(int A[7][7],int i,int n)
{
	int u,v;
	int visited[7]={0};
	visited[i]=1;
	printf("%d",i);
	enqueue(i);
	while(isEmpty()==0)
	{
		u=dequeue();
		for(v=1; v<=n; v++)
		{
			if(A[u][v]==1 && visited[v]==0)
			{
				printf("%d",v);
				visited[v]=1;
				enqueue(v);
			}
		}
	}
}

void main()
{
	int G[7][7]={{0,0,0,0,0,0,0},
				{0,0,1,1,0,0,0},
				{0,1,0,0,1,0,0},
				{0,1,0,0,1,0,0},
				{0,0,1,1,0,1,1},
				{0,0,0,0,1,0,0},
				{0,0,0,0,1,0,0}};
				
	BFS(G,2,7);
}
