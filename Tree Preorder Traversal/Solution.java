/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void Preorder(Node root) {
    
    System.out.print(root.data+  " ") ;
    Node left = root.left ;
    Node right = root.right;
    if(root.left != null){
        
        
        Preorder(left);
    }
    if(right!=null){
        Preorder(right);        
    }
    
}
