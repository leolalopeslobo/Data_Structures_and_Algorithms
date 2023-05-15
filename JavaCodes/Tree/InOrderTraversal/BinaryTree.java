public class BinaryTree {
    private BTNode root;
    private int functionCount;

    public BinaryTree() {
        root = null; //initializing the root to empty, because we are creating an empty binary tree
    }


    public void createTree01(){
        //Manual creation of Tree, without the use of an algorithm
        //the strange name with number is given in case we want to implement the creation of different trees we will be able to implement the additional create functions in the class
        BTNode n1 = new BTNode(5);
        BTNode n2 = new BTNode(1);
        BTNode n3 = new BTNode(4);
        BTNode n4 = new BTNode(7);

        root = n1;
        n1.leftChild = n2;
        n1.rightChild = n3;
        n2.leftChild = n4;
    }

    //This function cannot be called from outside class...
    //As this requires root node reference to be passed as argument
    //root node reference is stored in a private member and that cannot be accessed outside class
    //hence we cannot call this function from outside class as we will not be able to pass appropriate variable as argument
    private void printUsingPreOrder(BTNode root){
        ++functionCount;

        if (root == null){
            return;
        }
        System.out.println(root.data);
        if (root.leftChild != null)
            printUsingPreOrder(root.leftChild);
        if (root.rightChild != null)
            printUsingPreOrder(root.rightChild);
    }

    //Wrapper function to call the function that does traversal
    public void printUsingPreOrder() {
        functionCount = 0;
        printUsingPreOrder(root); //this can access the private variable since it is a member of the class
        System.out.println("Traversal function was called "+functionCount+" times");
    }
}