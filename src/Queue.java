/**
 Queue
 The program will create queue data structure
 Author: Mareks Zeile
 Collaborator(s):
 Collaboration:
 Date: 11/30/21
 **/
public class Queue <T>{
    //instance data
    private int counter;
    private NodeProject firstNode;
    private NodeProject lastNode;

    //default constructor
    public Queue(){
        counter = 0;
        //no first and last node so set to null
        firstNode = null;
        lastNode = null;
    }

    //enqueue method
    public void enqueue(T data){
        //add the data to a node to add to the queue
        NodeProject addNode = new NodeProject(data);
        //check if first and last nodes are empty
        //if first node is empty then add to first node
        //if last node is empty and first is full then add to last node
        if(firstNode == null){
            firstNode = addNode;
        }else if(lastNode == null){
            lastNode = addNode;
        }
        //if first and last node are full then link the new node to the last node and set it to be the new last node
        else{
            addNode.setNode1(lastNode);
            lastNode = addNode;
        }
        //node has been added so add to the counter
        counter++;
    }

    //dequeue method
    public T dequeue(){
        //edge case
        if(isEmpty()){
            return null;
        }
        //store the first node to return it
        NodeProject topNode = firstNode;
        //find the 2nd furthest up node to set as the new top node
        NodeProject currentNode = lastNode;
        for(int i = counter-2; i > 0; i--){
            currentNode = currentNode.getNode1();
        }
        currentNode.setNode1(null);
        firstNode = currentNode;
        //remove one from the size if size is greater than zero
        if(counter>0){
            counter--;
        }

        //return the value in the removed node
        return (T) topNode.getValue();

    }

    //isEmpty method
    public boolean isEmpty(){
        boolean b = counter>0;
        return !b;
    }

    //size method
    public int size(){
        return counter;
    }

    //peek method
    public T peek(){
        //edge case
        if(isEmpty()){
            return null;
        }
        return (T)firstNode.getValue();
    }
}
