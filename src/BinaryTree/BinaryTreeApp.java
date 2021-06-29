package BinaryTree;
public class BinaryTreeApp {
    public static void main(String []args){
        BinaryTree tree = new BinaryTree();
        
        TreeNode node;
        
        node = new TreeNode(20);
        tree.insert(node);
        
        node = new TreeNode (30);
        tree.insert(node);
        
        node = new TreeNode (40);
        tree.insert(node);
        
        node = new TreeNode (50);
        tree.insert(node);
        
        node = new TreeNode (60);
        tree.insert(node);
        
        node = new TreeNode (70);
        tree.insert(node);
        
        System.out.print("Traversal dengan PreOrder : ");
        tree.preOrder();
        System.out.println(" ");
        System.out.print("Traversal dengan InOrder : ");
        tree.inOrder();
        System.out.println(" ");
        System.out.print("Traversal dengan PostOrder : ");
        tree.postOrder();
        System.out.println();
    }
}
