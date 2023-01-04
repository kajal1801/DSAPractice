import java.util.HashMap;
import java.util.Map;

class MinimumroundsCompletetasks {
    public static int minimumRounds(int[] task) {
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0;i < task.length;i++){
            hm.put(task[i], hm.getOrDefault(task[i], 0) + 1);
        }
        int a, res = 0;
        for(Map.Entry<Integer,Integer> mapElement : hm.entrySet()){
            a = mapElement.getValue();
            if(a == 1){
                return -1;
            }
            res += a/3;
            if(a %3 != 0){
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] task = {2 ,2 ,3 ,3 ,2, 4, 4, 4, 4, 4};
        System.out.println(minimumRounds(task));
    }
}
