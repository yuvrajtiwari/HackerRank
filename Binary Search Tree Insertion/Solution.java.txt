 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value)
    {
    
    Node insertNewNode = new Node();
    insertNewNode.data = value ;
    
    
    
    if(root == null){
        root = insertNewNode ;
    }
    else{
        findAndInsert(root,insertNewNode);
    }

     
    
    return root ;
    }

static void findAndInsert(Node root,Node newNode){
    
    if(newNode.data < root.data){
        
        if(root.left == null){
            root.left = newNode ;
        }
        else{
            findAndInsert(root.left,newNode);
        }
    }
    else if(newNode.data > root.data){
        
         if(root.right == null){
            root.right = newNode ;
        }
        else{
            findAndInsert(root.right,newNode);
        }
        
        
        
    }
    
    
}
