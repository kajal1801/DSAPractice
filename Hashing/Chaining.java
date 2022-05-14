import java.util.ArrayList;
import java.util.LinkedList;

public class Chaining {
    int Bucket;
    ArrayList<LinkedList<Integer>> table;

    Chaining(int b){
        Bucket = b;
        table = new ArrayList<LinkedList<Integer>>();
    }
    void inserting(int key){
        int i = key%Bucket;
        table.get(i).add(key);
    }

    void remove(int key){
        int i = key % Bucket;
        table.get(i).remove((Integer)i);
    }

    boolean search(int key){
        int i = key % Bucket;
        return table.get(i).contains(key);
    }



}
