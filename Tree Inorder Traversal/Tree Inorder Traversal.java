/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void Inorder(Node root) {
    
    if(root.left!=null){
        Inorder(root.left);
    }
    
    System.out.print(root.data + " ");
    
    if(root.right!=null){
        Inorder(root.right);
    }

}
