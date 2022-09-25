class MyCircularQueue {
    int q[];
    int size;
    int front;
    int rear;
    int used;
    public MyCircularQueue(int k) {
        size = k;
        q = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        q[rear] = value;
        used++;
        rear = (rear + 1)%size;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front = (front+1)%size;
        used--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return q[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return q[(rear-1+size)%size];
    }
    
    public boolean isEmpty() {
        return used == 0;
    }
    
    public boolean isFull() {
        return used == size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */