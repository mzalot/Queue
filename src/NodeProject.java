/**
 NodeProject
 The program will create a node to use in Queue
 Author: Mareks Zeile
 Collaborator(s): Henry Johnson
 Collaboration: Discussed concepts of a node
 Date: 9/29/21
 **/
public class NodeProject <T>{
    //instance data
    //two node project instances to store pointers
    //parent node
    private NodeProject node1;
    //child node
    private NodeProject node2;
    //store a way to assign values to the nodes
    private T value;

    //default constructor
    public NodeProject(){
        node1 = null;
        node2 = null;
        value = null;
    }
    //1 variable constructor
    public NodeProject(T value){
        node1 = null;
        node2 = null;
        this.value = value;
    }
    //3 variable constructor
    public NodeProject(T value, NodeProject node1, NodeProject node2){
        this.value = value;
        this.node1 = node1;
        this.node2 = node2;
    }
    //accessors and mutators

    //all mutators
    public void setValue(T value){
        this.value = value;
    }
    public void setNode1(NodeProject node1){
        this.node1 = node1;
        makeChild(node1);
    }
    public void setNode2(NodeProject node2){
        this.node2 = node2;
        makeParent(node2);
    }

    //make a child node
    private void makeChild(NodeProject node1){
        this.node2 = node1;
    }
    //make a parent node
    private void makeParent(NodeProject node2){
        this.node1 = node2;
    }
    //accessors
    public T getValue(){
        return value;
    }
    public NodeProject getNode1(){
        return node1;
    }
    public NodeProject getNode2(){
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
    public boolean equals(NodeProject node){
        boolean b = this.value.equals(node.getValue());
        return b;
    }
}
