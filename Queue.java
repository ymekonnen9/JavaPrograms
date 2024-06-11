package chap01.sec01;

import java.util.NoSuchElementException;

public class Queue{

    public static class Node{
        String string;
        Node next;

        public Node(String string){
            this.string = string;
        }
    }

    private Node head;
    private Node tail;

    public Queue(){
        head = null;
        tail = null;
    }

    public void add(String string){
        Node node = new Node(string);

        if(head == null){
            head = node;
            tail = node;
        }

        tail.next = node;
        tail = node;
    }

    public String remove(){
        Node rmNode = tail;
        if(rmNode == null){
            throw new IllegalAccessError("The Queue is already empty");
        }
        tail = null;
        return rmNode.string;
    }

    public class Iterator {
        private Node current;
    
        public Iterator(Node head) {
            this.current = head;
        }
    
        public boolean hasNext() {
            return current != null && current.next != null;
        }
    
        public Node next() {
            if (hasNext()) {
                current = current.next;
                return current;
            } else {
                throw new NoSuchElementException("No next element available");
            }
        }
    }
    

}