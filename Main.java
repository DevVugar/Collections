/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.util.LinkedList;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
      
        methodLinkedList();
    }

    private static void methodArrayList() {
          MyArrayList<String> a=new MyArrayList<>();
        
          a.add("Orxan");
          a.add("Murad");
          a.add("Akif");
          a.add("Veli");
          a.add("Eli");
          a.add("Namik");
    
      a.remove(2);
      
        for (int i = 0; i < a.lenght(); i++) {
            System.out.println(a.get(i));
        }
    }
    
    
    
    
    private static void methodLinkedList() {     
MyLinkedList l=new MyLinkedList();
l.add(4);
l.add(1);
l.add(2);
l.add(3);
l.remove(2);
        System.out.println(l.get(2));
    }
    
}
