package JavaQuestions.preorder;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        PreOrderTraversal solution =  new PreOrderTraversal();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> preorderTraversal = solution.preorderTraversal(root);
        System.out.println(preorderTraversal);

    }
}
