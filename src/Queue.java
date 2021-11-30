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
    private int size;
    private NodeProject firstNode;
    private NodeProject lastNode;
    private NodeProject parentNode;

    //default constructor
    public Queue(){
        size = 0;
        //no first and last node so set to null
        firstNode = null;
        lastNode = null;
        parentNode = new NodeProject();
    }
}
