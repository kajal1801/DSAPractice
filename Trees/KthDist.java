import java.util.Scanner;

class Node{
    int key;
    Node left;
    Node right;
    Node(int k){
        key = k;
    }
}

public class KthDist {

    public void printkDist(Node root, int k){
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
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);
        
        System.out.println("Enter the distance whose Node you want to print...Keep it within 2");
        int k = sc.nextInt();

        obj.printkDist(root, k);
        System.out.println();
        sc.close();
    }
}
