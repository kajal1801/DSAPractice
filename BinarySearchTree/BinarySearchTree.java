import java.util.Scanner;

// BST is a Binary Tree because each node has a maximum of 2 children
// It is called a search tree because it can be used to search for the presence of a number in O(log n) time.

/*
 * Logic: 
 * 1. All Nodes ti the left of the root node are less than the root node
 * 2. All Nodes to the right of the root node are greater than the root node
 * 3. Subtrees also follow the 1st and 2nd points.
 */

// Source Code:

public class BinarySearchTree{
    class Node{
        Node left,right;
        int key;
        Node(int k){
            key = k;
        }
    }

    Node root;

    /* Search Operation */

    public int search(int num){
        return searchKey(root, num);
    }

    // Search Method
    public int searchKey(Node root, int number){
        if(root == null){
            return -1;
        }
        else if(root.key < number){
            return searchKey(root.right, number);
        }
        else if(root.key > number){
            return searchKey(root.left, number);
        }
        return 1;
    }

    /* Insert Operation */

    public void insert(int data){
        root = insertKey(root, data);
    }

    // Insert Node
    public Node insertKey(Node root, int data){
        if(root == null){
            return new Node(data);
        }
        if(data < root.key){
            root.left = insertKey(root.left, data);
        }
        else if(data > root.key){
            root.right = insertKey(root.right, data);
        }
        return root;
    }

    /* Delete Operation */

    public void delete(int num){
        root = deleteKey(root, num);
    }

    // Getting next element of the element to be deleted
    public Node joiner(Node root){
        if(root.left == null){
            return root.right;
        }
        else if(root.right == null){
            return root.left;
        }
        Node rightChild = root.right;
        Node lastRight = findLastRight(root.left);
        lastRight.right = rightChild;
        return root.left;
    }

    // Finding the Last element of the right node
    Node findLastRight(Node root){
        if(root.right == null){
            return root;
        }  
        return findLastRight(root.right);
    }


    // Delete Node
    public Node deleteKey(Node root, int number){
        if(root == null){
            return null;
        }
        if(root.key > number){
            root.left = deleteKey(root.left, number);
        }
        else if(root.key < number){
            root.right = deleteKey(root.right, number);
        }
        else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{
                Node successor = joiner(root);
                root.key = successor.key;
                root.right = deleteKey(root.right, successor.key); 
            }
        }
        return root;   
    }

    // Printing the tree in inorder fashion
    public void inorder(){
        inorderPrint(root);
    }

    public void inorderPrint(Node root){
        if(root != null){
            inorderPrint(root.left);
            System.out.println(root.key + " ");
            inorderPrint(root.right);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        tree.insert(7);
        tree.insert(10);
        tree.insert(14);
        tree.insert(4);

        System.out.println("Inorder Traversal: ");
        tree.inorder();

        System.out.println("Enter a number to be searched: ");
        int del = sc.nextInt();
        if(tree.search(del) == 1){
            System.out.println("Number found in the tree");
        }
        else{
            System.out.println("Number not found in the tree");
        }

        tree.delete(7);
        System.out.println("Inorder Traversal: ");
        tree.inorder();

        tree.delete(1);
        System.out.println("Inorder Traversal: ");
        tree.inorder();

        tree.delete(5);
        System.out.println("Inorder Traversal: ");
        tree.inorder();
        sc.close();
    }

}