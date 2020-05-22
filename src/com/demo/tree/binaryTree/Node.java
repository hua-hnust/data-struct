package com.demo.tree.binaryTree;

/**  节点
 * @Author xhua
 * @Date 2020/5/22 15:13
 **/
public class Node {

    /** 数据 **/
    public int data;
    /** 左节点 **/
    public Node left;
    /** 右节点 **/
    public Node right;

    /**
     *  构造节点
     * @param key
     */
    public Node(int key){
        data = key;
    }

}
