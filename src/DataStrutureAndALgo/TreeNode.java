package DataStrutureAndALgo;
//   5
// /  \
// 1   14
//     /\
 //   6  13
// root
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){

    }

    public static boolean isValidTree(TreeNode root){

        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        return validateTree(root,minValue,maxValue);
    }

    public static boolean validateTree(TreeNode root, int minValue, int maxValue){

        if(root == null){
            return true;
        }
        if(root.val <=minValue || root.val >= maxValue){
            return false;
        }

        boolean b = validateTree(root.left, minValue, root.val);
        boolean b1 =  validateTree(root.right, root.val, maxValue);
         return  b && b1;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(1);
        node.right = new TreeNode(14);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(13);

        isValidTree(node);
    }

}
