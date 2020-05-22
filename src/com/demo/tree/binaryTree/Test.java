package com.demo.tree.binaryTree;

/**
 * @Author xhua
 * @Date 2020/5/22 16:20
 **/
public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = new Node(6);
        binaryTree.insert(root,5);
        binaryTree.insert(root,2);
        binaryTree.insert(root,3);
        binaryTree.insert(root,8);
        binaryTree.insert(root,7);
        binaryTree.insert(root,1);
        binaryTree.insert(root,10);
        binaryTree.insert(root,13);

        binaryTree.midSearch(root);
        System.out.println(" ------ ");

        binaryTree.preSearch(root);
        System.out.println(" ------ ");

        binaryTree.postSearch(root);
        System.out.println(" ------ ");

        Node node = binaryTree.search(root,8);
        System.out.println(node==null?"null":node.data);

    }
}
