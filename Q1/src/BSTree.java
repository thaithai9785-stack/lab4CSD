public class BSTree {
    private Node root;

    public BSTree() {
        root = null;
    }

    public void insert(int k) {
        if(k>100) return;
        
    }
    
    public Node insertNode(Node parentNode, int k){
        if(parentNode==null){
            parentNode = new Node(k);
            return parentNode;
        }
        
        if(k<parentNode.key)
            parentNode.left = insertNode(parentNode, k);
        else if(k>parentNode.key)
            parentNode.right=insertNode(parentNode, k);
        return parentNode;
    }

    public boolean f1(int k) {
        //You should insert here statements to complete this function
        //---------------------------------------------------------------------
        
        //--------------------------------------------------------------------- 
        return false;
    }

    public int f2() {
        //You should insert here statements to complete this function
        //---------------------------------------------------------------------
        
        //--------------------------------------------------------------------- 
        return 0;
    }

    public int f3() {
        //You should insert here statements to complete this function
        //---------------------------------------------------------------------
        
        //--------------------------------------------------------------------- 
        return 0;
    }

    public int f4() {
        //You should insert here statements to complete this function
        //---------------------------------------------------------------------
        
        //---------------------------------------------------------------------
        return 0;
    }

    public int f5(int k) {
        //You should insert here statements to complete this function
        //---------------------------------------------------------------------
        
        //---------------------------------------------------------------------
        return 0;
    } 
}