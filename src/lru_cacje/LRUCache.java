package lru_cacje;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

//now we need to create a class that is nodes
    public class Node{
        int key;
        int value;
        //now we need  the next and previous Nodes for each node to make it connected
        Node prev,next;
        Node(int k,int v){
            //after we have create a constructor for the class of
            //Node and
            key=k;
            value=v;
            //here we created the
        }
    }
//we have to save the element into a Hashmap that will be easy to access the element
    private Map<Integer,Node> map;
    //here we give the capacity of the LRU cache as per indication
    private int capacity;
    //and now we need to create a dummy node like head and tail
    //so that head next is tail and tail.prev is head
    private Node head,tail;
    public  LRUCache(int capacity){
        this.capacity=capacity;
        this.map=new HashMap<>();//her we have created a hashmap object
        //and now we use head and tail for the sum as we need a reference
        head= new Node(0,0);
        tail=new Node(0,0);
        //now we need to connect the first node to the next and that can
        head.next=tail;
        tail.prev=head;


}


public int get(int key){
        //here as per the question we have to return the value that is associateed with the key and
    Node n=map.get(key);//here we get the value of the node that has the key in the map

    if(n==null){
        return -1;
    }//if that is not there in the map it is returned as -1

    movetofront(n);//here we move the node to the front as it is recently used

    return n.value;
}


    public void put (int key, int value){
        //here as per the question we have to add the element or key value pair into the stack
        Node node=map.get(key);
        //we check weather the key is there in the node or not
        if(node!=null){
            //this element or node is there in the key that is 
        }
}
    private void movetofront(Node node) {
        //here we have tp move the node n to front
        removenode(node);//here this function is used to remove the node from the current position
        //and place this after the head
        addafterhead(node);
    }

    private void addafterhead(Node node) {
        //here we need to add the node right after the head
        node.prev=head;
        //and we have to conncet the next element
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
        //i am connecting node with each other

    }

    private void removenode(Node node) {
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }



}
