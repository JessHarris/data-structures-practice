/* Linked List is both a List and Double Ended Queue.
It is a linear data structure which
contains a sequence of elements each represented by
a node which contains a pointer to the next.
LinkedList implements List, and Dequeue interfaces
which means you can add/remove elements from either the
head or tail of the structure.
Other characteristics -
It can contain nulls (although not recommended when using as a queue)
It can contain duplicates.
It keeps insertion order of elements.
FIFO-First in, First out
Below is an example of implementing a LinkedList
*/

import java.util.NoSuchElementException;

public class MyLinkedList<E> {

    private static class Node<E> {
        private Node next;
        private E data;

        public Node(E data) {
            this.data = data;
        }
    }

    private Node<E> head;

    //Adds an element to the end of the line
    public void append(E data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node<E> current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(data);
    }

    //Adds an element to the front of the line
    public void prepend(E data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node<E> newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //Removes a specific element from the list
    public void remove(E data) {
        if (head == null) {
            return;
        }
        Node<E> current = head;

        if (current.data == data && current.next == null) {
            head = null;
            return;
        }

        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    //Returns the element that is first in line
    public E getHead() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.data;
    }

    //Returns the element that is last in line
    public E getTail() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        Node<E> current = head;

        while (current.next != null) {
            current = current.next;
        }

        return current.data;
    }

    //Checks to see if a specific element is in the list
    public boolean contains(E data) {
        if (head == null) {
            return false;
        }

        Node<E> current = head;

        while (current.data != data) {
            if (current.next == null) {
                return false;
            }
            current = current.next;
        }
        return true;
    }
}
