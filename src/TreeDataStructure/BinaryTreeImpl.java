package TreeDataStructure;

public class BinaryTreeImpl {
   static int idx = -1;

   public static Node binaryTree(int[] nodes) {

        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = binaryTree(nodes);
        newNode.right = binaryTree(nodes);
       // new Arr
        return newNode;

    }

    public static void main(String[] args) {

        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node node = binaryTree(nodes);
        //System.out.println(node.data);
        System.out.println("==================preOrder=======================");
        preOrder(node);  //TC - O(n)
        System.out.println(sum);

        System.out.println("==================postOrder=======================");
        //postOrder(node);
        System.out.println("==================inOrder=======================");
       // inOrder(node);
        
        //levelOder(node);
    }

    private static void levelOder(Node node) {
    }

    private static void inOrder(Node node) {
        if(node==null){
            return;
        }
       inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
      // System.out.println(node.data);
    }
   static  int sum =0;
    public static void  preOrder( Node node){
       if(node == null){
           return;
       }

         //curr = (curr *10) +node.data;
        preOrder(node.left);
        preOrder(node.right);
    }


    private static void postOrder(Node node) {

        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        
        System.out.println(node.data);

    }

}
