public class MinimumJump {
    static int getMini(int arr[]){
        // your code here
        if(arr.length == 1){
            System.out.println(0);
        }
        if(arr[0] == 0){
            return -1;
        }
        int jump = 0, maxReach = arr[0], steps = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(i == arr.length - 1){
                return jump;
            }
            maxReach = Math.max(maxReach, arr[i] + i);
            steps--;
            if(steps == 0){
                jump++;
                if(i >= maxReach){
                    return -1;
                }
                steps = maxReach - i;
            }
        }
        return -1;
    }
}
