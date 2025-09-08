package lr;

import java.util.Map;
import java.util.HashMap;
    class LRUCache {

        //lets create a class called Node to save and take the values that are required
        private class Node{
            int key;
            int value;
            Node prev,next;//here we have given the prev and next which connect the previous and the next element that is the previous and the next elements of the current node.
            Node(int k,int v){
                //we are using constructors so that we can call it whenever there is an object created
                key=k;
                value=v;
            }
        }
        //lets write code  for LRUCache  and we are good to go
        private Map<Integer,Node> map;//here we use hash mapt to store the key
        private int capacity;//this gives the capacity
        private Node head,tail;//here we get the starting and previous class
        //and below conctructor is used called when the class is called
        public LRUCache(int capacity) {
            this.capacity=capacity;
            this.map=new HashMap<>();
            // we have created a dummy headh and tail for that
            head= new Node(0,0);
            tail= new Node(0,0);
            //and we are gonna connect this
            //from head to tail
            head.next=tail;
            tail.prev=head;
        }

        public int get(int key) {
            //here we have to return the value. if the the value exists other wise return the value -1
            Node n=map.get(key);//here we have using the hashmap we are getting the key
            //and we get the node that has the value
            if(n==null){
                //we check the information if that is not there we return -1
                return -1;
            }
            //now we gonna use the given node as per the key we have to move that we got to the top of the box
            //so we create a function called move to front
            //so that the the data  is moved to the top of the stack that we have
            movetofront(n);
            //after that we retun the value of the key that is being asked
            return n.value;
        }
        //this gets the element with o(1) time complexity to access the element.

        public void put(int key, int value) {
            //here as per the question we have update the value of the key(like position in the stack or the memory) and we have to move the position. Otherwise, add the key value pair to the cache. If the number of the keys exceeds the capacity from this operation. we need to remove the least recently used
            //here we need to get the value from the map that we have created
            Node node=map.get(key);//here we get the node value if that element is there in the satck it will be returned
            if(node!=null){
                //if the element is there in the stack
                node.value=value;// we make the node value as the value which reduces the confusion
                movetofront(node);//this will move the node to the front of the stack
            }
            //now if the element is not in the stack and we need to add the element in the stack
            else{
                Node newnode=new Node(key,value);
                //here we have created a new node as the node is not there in the stack
                map.put(key,newnode);//we keep the value into the map
                //and after that we have to add the element or the node after the head that we have already created.
                addafterhead(newnode);
                //now if the capacity is full and you want to add the element or the node into the stack
                // we need to remove the least rectly used element in the stack
                if(map.size()>capacity){
                    //we have to remove the element that is Least recently used element that is the element that is there infront or near the tail
                    Node lru=tail.prev;//this gets the element that is least recently used element
                    removenode(lru);
                    map.remove(lru.key);//this remove the element that is been not used from the hashmap
                }
            }
        }

        //here as we have used the move to front function and called it before in get funcion
        public void movetofront(Node node){
            removenode(node);
            addafterhead(node);
        }
        public void removenode(Node node){
            //now we have to remove the node from the current position in the stack if that
            //element in the stack
            node.prev.next=node.next;
            node.next.prev=node.prev;
            //this will remove the element from the stack and that is done
        }
        public void addafterhead(Node node){
            //here we need to add the element in the stack right after the head so that it
            //can be accessed this with O(1)
            node.prev=head;
            node.next=head.next;//we are not writing the tail as the we need to place right after the head.
            //now we need to connect the head.next that is ||head-A-tail||
            //head-x-a-tail||
            //so to connect the x to a we go to a  by head.next that is a
            //and head.next.prev=a
            head.next.prev=node;
            //now we have already connected x but not the head to x
            //for that we need to write the code
            head.next=node;
        }
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

