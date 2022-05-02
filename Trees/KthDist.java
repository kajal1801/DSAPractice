import java.util.Scanner;

class Node14{
    int key;
    Node14 left;
    Node14 right;
    Node14(int k){
        key = k;
    }
}

public class KthDist {

    public void printkDist(Node14 root, int k){
        if(root == null){
            return;
        }
        if(k == 0){
            System.out.print(root.key + " ");
        }
        else{
            printkDist(root.left, k-1);
            printkDist(root.right, k-1);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        KthDist obj = new KthDist();
        Node14 root = new Node14(10);
        root.left = new Node14(20);
        root.right = new Node14(30);
        root.left.left = new Node14(40);
        root.left.right = new Node14(50);
        root.right.right = new Node14(70);
        
        System.out.println("Enter the distance whose Node14 you want to print...Keep it within 2");
        int k = sc.nextInt();

        obj.printkDist(root, k);
        System.out.println();
        sc.close();
    }
}
