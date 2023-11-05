  /*As a startup in the education industry, we want to create an online platform to help students learn programming. We need a function that takes the root of a binary tree as input and checks whether the tree is a mirror of itself, i.e. symmetric around its center. This will help us ensure that our binary tree exercises are correctly labeled as symmetric or not. Can you implement a function that takes the root of a binary tree and returns true if the tree is symmetric, false otherwise?*/
        /*Input:
         1
        / \
       2   2
      / \ / \
     3  4 4  3
     Output: true

         Input:
        1
       / \
      2   2
       \   \
       3    3

    Output: false

    To check if a binary tree is symmetric, you can compare the left and right subtrees recursively. At each level, you compare the left and right nodes of the current node. If they are equal, you continue comparing their subtrees recursively. If they are not equal, the tree is not symmetric.

    You can implement the `isSymmetric` function using a helper function that takes two nodes as input and checks if they are symmetric. The helper function should return true if the two nodes are symmetric and false otherwise.

    You can use a depth-first search (DFS) approach to traverse the tree and compare the nodes. You can start by comparing the root node's left and right subtrees.



    The isSymmetric method takes a TreeNode object called root as input and returns a boolean value. It first checks if the root is null. If the root is null, it means there is no tree, and therefore, it is considered symmetric. In this case, the method returns true.

    If the root is not null, the isSymmetric method calls a helper method isSymmetricHelper with the left and right child nodes of the root. This helper method performs the actual symmetry check.

    The isSymmetricHelper method takes two TreeNode objects, left and right, as input, representing the left and right child nodes of a subtree. It checks various conditions to determine if the subtree is symmetric.

    First, it checks if both left and right are null. If they are both null, it means the subtree is symmetric, and the method returns true.

    Next, it checks if either left or right is null (but not both). If either one is null while the other is not, it means the subtree is not symmetric, and the method returns false.

    If both left and right are not null, the method compares the values of left.val and right.val. If the values are different, the subtree is not symmetric, and the method returns false.

    If the values are the same, it recursively calls the isSymmetricHelper method with the left child of left and the right child of right, as well as the right child of left and the left child of right. These recursive calls check the inner subtrees of the given subtree to determine their symmetry.

    The method returns true if both recursive calls return true, indicating that both inner subtrees are symmetric. Otherwise, it returns false.
         */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode rigth;
    TreeNode(int x) {
        val = x;
    }
}
public class SymmetricBinaryTree {
    public static void main(String[] args) {

    }
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetricHelper(root.left, root.rigth);
    }

    private static boolean isSymmetricHelper(TreeNode left, TreeNode rigth) {
        if (left == null && rigth == null) {
            return true;
        }

        if (left == null || rigth == null) {
            return false;
        }

        if (left.val != rigth.val) {
            return false;
        }

        return isSymmetricHelper(left.left, rigth.rigth) && isSymmetricHelper(left.rigth, rigth.left);
    }
}
