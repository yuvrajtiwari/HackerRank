/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/
void Postorder(Node root) {
    
    if(root.left!=null){
        Postorder(root.left);
    }

    if(root.right!=null){
        Postorder(root.right);
    }
    System.out.print(root.data + " ");
}
