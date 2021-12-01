/**
 NodeProject
 The program will create a node to use in Queue
 Author: Mareks Zeile
 Collaborator(s): Henry Johnson
 Collaboration: Discussed concepts of a node
 Date: 9/29/21
 **/
public class QueueNode<T>{
    //instance data
    //two node project instances to store pointers
    //parent node
    private QueueNode node1;
    //child node
    private QueueNode node2;
    //store a way to assign values to the nodes
    private T value;

    //default constructor
    public QueueNode(){
        node1 = null;
        node2 = null;
        value = null;
    }
    //1 variable constructor
    public QueueNode(T value){
        node1 = null;
        node2 = null;
        this.value = value;
    }
    //3 variable constructor
    public QueueNode(T value, QueueNode node1, QueueNode node2){
        this.value = value;
        this.node1 = node1;
        this.node2 = node2;
    }
    //accessors and mutators

    //all mutators
    public void setValue(T value){
        this.value = value;
    }
    public void setNode1(QueueNode node1){
        this.node1 = node1;
        makeChild(node1);
    }
    public void setNode2(QueueNode node2){
        this.node2 = node2;
        makeParent(node2);
    }

    //make a child node
    private void makeChild(QueueNode node1){
        this.node2 = node1;
    }
    //make a parent node
    private void makeParent(QueueNode node2){
        this.node1 = node2;
    }
    //accessors
    public T getValue(){
        return value;
    }
    public QueueNode getNode1(){
        return node1;
    }
    public QueueNode getNode2(){
        return node2;
    }

    //toString method
    public String toString(){
        //check if value is null
        if(value == null){
            return "Node: null";
        }
        return "Node: " + value.toString();
    }

    //.equals method
    public boolean equals(QueueNode node){
        boolean b = this.value.equals(node.getValue());
        return b;
    }
}
