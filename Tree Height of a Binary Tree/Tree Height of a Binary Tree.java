 /*
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   int height(Node root)
    {
       if(root.left==null && root.right==null){
           return 1 ;
       }
        int leftHeight = 0 ;
        int rightHeight = 0 ;
        
       if(root.left!=null){
           leftHeight = 1+height(root.left);
           
       }
       if(root.right!=null){
           rightHeight = 1+height(root.right);
       }
       
      // System.out.print(leftHeight+" <-left vs right-> "+rightHeight);
      // System.out.println(" node is "+root.data);
      // System.out.println();
       return Math.max(leftHeight, rightHeight) ;
         
    }
