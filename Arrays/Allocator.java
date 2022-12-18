class Allocator {
    int arr[];
    int n;
    
    public Allocator(int n) {
        this.n = n;
        arr = new int[n];
    }
    
    public int allocate(int size, int mID) {
        int pos = -1;
        for(int i = 0;i < n;i++){
            boolean f = true;
            while(size-- > 0){
                if(arr[i] == 0){
                    if(pos == -1){
                        pos = i;
                    }
                    arr[i] = mID;
                    i++;
                }
                else{
                   f = false; 
                }
            }
            if(f){
                break;
            }
        }
        if(size > 0){
            return -1;
        }
        return pos;
    }
    
    public int free(int mID) {
        int count = 0;
        for(int i = 0;i < n;i++){
            
            if(arr[i] == mID){
                arr[i] = 0;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
           Allocator ob = new Allocator(10);
           System.out.println(ob.allocate(1 ,1));
           System.out.println(ob.allocate(1 , 2));
           System.out.println(ob.allocate(1, 3));
           System.out.println(ob.free(2));
           System.out.println(ob.allocate(3, 4));
           System.out.println(ob.allocate(1, 1));
           System.out.println(ob.allocate(1, 1));
           System.out.println(ob.free(1));
           System.out.println(ob.allocate(10, 2));
           System.out.println(ob.free(7));
    }
}
