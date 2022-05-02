class Node17{
	int data;
	Node17 left,right;
	Node17(int key)
	{
	    data = key;
	    left = right = null;
	}
}

public class ChildrenSum
{
    public static int isSumProperty(Node17 root)
    {
        // add your code here
        if(root == null || (root.left==null && root.right == null))
        {
            return 1;
        }
        int left_sum = 0, right_sum = 0;
        if(root.left != null)
        {
            left_sum = root.left.data;
        }
        if(root.right != null)
        {
            right_sum = root.right.data;
        }
        if((left_sum + right_sum==root.data) && (isSumProperty(root.left) == 1) && (isSumProperty(root.right) == 1))
        {
            return 1;
        }
        return 0;
    }

    public static void main(String args[]){
        Node17 root = new Node17(5);
        root.left = new Node17(3);
        root.right = new Node17(2);
        int k = isSumProperty(root);
        if(k == 1){
            System.out.println("The Chilren's sum is equal to the parent");
        }
        else{
            System.out.println("The Chilren's sum is not equal to the parent");
        }

        Node17 root2 = new Node17(5);
        root2.left = new Node17(4);
        root2.right = new Node17(2);
        k = isSumProperty(root2);
        if(k == 1){
            System.out.println("The Chilren's sum is equal to the parent");
        }
        else{
            System.out.println("The Chilren's sum is not equal to the parent");
        }
    }
}
