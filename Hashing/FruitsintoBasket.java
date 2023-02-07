import java.util.HashMap;

public class FruitsintoBasket{
    public int totalFruit(int[] fruits) {
        int i = 0, j = 0;
        int res = Integer.MIN_VALUE;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        while(j < fruits.length){
            hm.put(fruits[j], hm.getOrDefault(fruits[j], 0) + 1);
            while(hm.size() > 2){
                hm.put(fruits[i], hm.get(fruits[i])-1);
                if(hm.get(fruits[i]) == 0){
                    hm.remove(fruits[i]);
                }
                i++;
            }
            res = Math.max(res, j - i + 1);
            j++;
        }
        return res;
    }
}