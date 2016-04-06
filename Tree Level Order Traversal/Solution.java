   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
      LinkedList<Node> queue = new LinkedList<Node>() ;
       
       queue.offer(root) ;
       
       while(queue.element() != null){

            Node levelOrderNode = queue.poll() ;
           
            System.out.print(levelOrderNode.data+" ");
           if(levelOrderNode.left!=null){ 
                queue.offer(levelOrderNode.left) ;
           }
           if(levelOrderNode.right!=null){ 
                queue.offer(levelOrderNode.right) ;
           }
       }
      
    }
