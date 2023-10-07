/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

/**
 *
 * @author user
 */
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    
    
    public boolean remove(int index) {
        if (index < 0 || head == null) {
            return false; 
        }

        if (index == 0) {
            head = head.next;
            return true;
        }

        Node current = head;
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            return false;
        }

        current.next = current.next.next;
        return true;
    }


    public int get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        Node current = head;
        int count = 0;

        while (current != null) {
            if (count == index) {
                return current.data;
            }
            current = current.next;
            count++;
        }

        throw new IndexOutOfBoundsException("Index is out of bounds");
    }
}
