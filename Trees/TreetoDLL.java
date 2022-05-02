import java.util.*;
import java.io.*;

class Node18
{
	Node18 left, right;
	int data;
	
	Node18(int d)
	{
		data = d;
		left = right = null;
	}
	
}
class TreetoDLL
{
    
    static Node18 buildTree(String str)throws IOException{
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        Node18 root = new Node18(Integer.parseInt(ip[0]));
        
        Queue<Node18> queue = new LinkedList<>(); 
        
        queue.add(root);
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            Node18 currNode18 = queue.peek();
            queue.remove();
                
            String currVal = ip[i];
                
            if(!currVal.equals("N")) {
                    
                currNode18.left = new Node18(Integer.parseInt(currVal));
                queue.add(currNode18.left);
            }
                
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current Node18
                currNode18.right = new Node18(Integer.parseInt(currVal));
                    
                queue.add(currNode18.right);
            }
            i++;
        }
        
        return root;
    }
    

	void inorder(Node18 Node18)
	{
		if(Node18==null)
			return ;
		else
			inorder(Node18.left);
			System.out.print(Node18.data + " ");
			inorder(Node18.right);
	}
	public static void printList(Node18 head) 
    {
		Node18 prev = head;
        while (head != null) 
        {
            System.out.print(head.data + " ");
			prev = head;
            head = head.right;
        }
		
		System.out.println();
		while(prev != null)
		{
			System.out.print(prev.data+" ");
			prev = prev.left;
		}
    }
	public static void main(String args[])  throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node18 root = buildTree(s);
        	    Ttodll g = new Ttodll();
			    
			    Node18 ans = g.bToDLL(root);
			    printList(ans);
                t--;
                System.out.println();
	        }
			
		
	}
}

class Ttodll
{
    Node18 prev = null;
    Node18 bToDLL(Node18 root)
    {
	    //  Your code here	
	    if(root == null){
	        return root;
	    }
	    Node18 head = bToDLL(root.left);
	    if(prev == null){
	        head = root;
	    }
	    else{
	        root.left = prev;
	        prev.right = root;
	    }
	    prev = root;
	    bToDLL(root.right);
	    return head;
    }
}
