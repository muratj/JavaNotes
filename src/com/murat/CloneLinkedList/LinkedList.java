package com.murat.CloneLinkedList;

public class LinkedList {
    private Node first;
    private Node last;

    public void addFirst(int item) {
        var node = new Node(item);

        if (first == null){
            first = last = node;
        } else {
            node.setNext(first);
            first = node;
        }
    }

    public void addLast(int item) {
        var node = new Node(item);

        if (first == null) {
            first = last = node;
        } else {
            last.setNext(node);
            last = node;
        }
    }

    public void removeFirst() {
        first = first.getNext();
        if(first == null) {
            last = null;
        }
    }

    public void removeLast() {
        last = getPrevious(this.size());
        if(last == null) {
            first = null;
        } else {
            last.setNext(null);
        }
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.getValue() == item) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public int size() {
        int count = 0;
        var current = first;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }
    
    public Node getPrevious(int size) {
        var current = first;
        var prev = current;
        while (size-1 > 0){
            prev = current;
            current = current.getNext();
            size--;
        }
        if (prev == current) return null;
        return prev;
    }
}
