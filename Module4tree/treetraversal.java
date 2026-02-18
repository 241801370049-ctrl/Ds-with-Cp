class Node{
    int data;
    Node l,r;
    
    Node(int a){
        this.data=a;
        this.l =this.r = null;
    }
    
    // recursive  method
    void postTreeTraverse(Node n){
        //base condition
        if(n==null)return;
        postTreeTraverse(n.l);
        postTreeTraverse(n.r);
        //post order traversal
        System.out.println(n.data);
    }
    
    void levelTreeTraverse(Node n){
        //base condition
        if(n==null)return;
        levelTreeTraverse(n.l);
        //level order traversal
        System.out.println(n.data);
        levelTreeTraverse(n.r);
        
    }
    
    void preTreeTraverse(Node n){
        //base condition
        if(n==null)return;
        
        //pre order traversal
        System.out.println(n.data);
        preTreeTraverse(n.l);
        preTreeTraverse(n.r);
        
    }
}

class Main {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        
        //linking
        a.l=b;
        a.r=c;
        b.l=d;
        
         System.out.println("post order traversal");
         a.postTreeTraverse(a);
         
         System.out.println("level order traversal");
         a.levelTreeTraverse(a);
         
         System.out.println("pre order traversal");
         a.preTreeTraverse(a);
         
        
        
                       
                       
                       
                       
                       
    }
}
