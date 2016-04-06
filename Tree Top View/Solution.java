/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void top_view(Node root)
{
    Stack<Node> stack = new Stack<Node>() ;
    
    Node temp = root ;
    stack.push(temp) ;
    while(temp.left!=null){
        temp = temp.left ;
        stack.push(temp) ;
    }
    
    while(!stack.isEmpty()){
       
        temp = stack.pop() ;
        System.out.print(temp.data + " ") ;
        
    }
  
    while(temp.right!=null){
        temp = temp.right ;
        System.out.print(temp.data + " ") ;
        
    }

     
  
}
