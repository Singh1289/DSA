package day_2_Queue;

public class CircularQueue {
   private int front ,rear;
   private int []arr;

   public CircularQueue() {
    front=rear=-1;
    arr=new int[10];
   }

   public CircularQueue(int n) {
      front=rear=-1;
      arr=new int[n];
   }

   public boolean isEmpty() {
      return (front==-1)?true:false;
   }
   public boolean isFull() {
      return (((front==rear+1 )&&(front==0))||rear==arr.length-1)?true:false;
   }
   public void insert(int x) {
      if(isFull()) {
         System.out.println("Queue is full");
         return;
      }
      if  (front==-1) {
         front=0;
      }
      if(rear==arr.length-1) {
         rear=0;
      }
      else
         rear=rear+1;
      arr[rear]=x;
      return;
   }
   public int remove() {
      int d = -999;
      if(isEmpty()) {
         //System.out.println("Queue is empty");
         return d;
      }
      d=arr[front];
      if(front==rear) {
         front=-1;
         rear=-1;
         } else if (front ==arr.length-1) {
         front=0;
      }else{
         front=front+1;
      }
      return d;
   }
    public int peek(){
       int d = -999;
       if(isEmpty()) {
          System.out.println("Queue is empty");
          return d;
       }
       d=arr[front];
       return d;
   }

}

