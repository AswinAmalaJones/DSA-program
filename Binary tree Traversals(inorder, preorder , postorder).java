// Binary tree Traversals(inorder, preorder , postorder) using JAVA 06

class Node
{
    int data;
    Node left;
    Node right;

    public Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BinaryTree
{
    Node root;

    public BinaryTree()
    {
        this.root = null;
    }
    // Method to perform inorder traversal
    public void inOrder(Node node)
    {
        if(node != null)
        {
            inOrder(node.left);
            System.out.print(node.data+"");
            inOrder(node.right);
        }
    }
    // Method to perform preorder traversal
    public void preOrder(Node node)
    {
        if(node != null)
        {
            System.out.print(node.data+"");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    // Method to perform postorder traversal
    public void postOrder(Node node)
    {
        if(node != null)
        {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data+"");
        }
    }
}
public class Main{
    public static void main(String[]args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);

        System.out.println("Inorder traversal:");
        tree.inOrder(tree.root);
        System.out.println("\nPreorder traversal:");
        tree.preOrder(tree.root);
        System.out.println("\nPostorder traversal:");
        tree.postOrder(tree.root);
    }
}