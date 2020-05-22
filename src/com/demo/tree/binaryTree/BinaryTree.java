package com.demo.tree.binaryTree;

/** 二叉树结构及遍历
 * @Author xhua
 * @Date 2020/5/22 15:06
 **/
public class BinaryTree {

    private Node root;

    /**
     *  二叉树有序插入
     * @param root
     * @param key
     */
    public void insert(Node root,int key) {
        //如果根节点为空
        if (root == null) {
            root = new Node(key);
        }
        if (key == root.data){
            //do nothing
        }
        //如果插入数据比根节点小
        else if (key < root.data){
            //如果左节点为空
            if (root.left == null){
                root.left = new Node(key);
            }else {
                //递归判断左节点
                insert(root.left,key);
            }
        }else {
            //如果右节点为空
            if (root.right == null){
                root.right = new Node(key);
            }else {
                insert(root.right,key);
            }
        }
    }

    /**
     *  根据值遍历查找
     * @param root
     * @param key
     * @return
     */
    public Node search(Node root,int key){
        if (root.data == key){
            return root;
        }else if (key < root.data){
            if (root.left != null){
                return search(root.left,key);
            }else {
                return null;
            }
        }else {
            if (root.right != null){
                return search(root.right,key);
            }else {
                return null;
            }
        }
    }

    /**
     *  中序遍历（递归方式）
     * @param root
     */
    public void midSearch(Node root){
        if (root != null){
            midSearch(root.left);
            System.out.println(root.data);
            midSearch(root.right);
        }
    }

    /**
     *  先序遍历（递归方式）
     * @param root
     */
    public void preSearch(Node root){
        if (root != null){
            System.out.println(root.data);
            preSearch(root.left);
            preSearch(root.right);
        }
    }

    /**
     *  后续遍历（递归方式）
     * @param root
     */
    public void postSearch(Node root){
        if (root != null){
            postSearch(root.left);
            postSearch(root.right);
            System.out.println(root.data);
        }
    }

}
