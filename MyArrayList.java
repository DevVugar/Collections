/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

/**
 *
 * @author user
 */
public class MyArrayList<E> {

    private Object[] array = (E[]) new Object[10];
    private int addedElementRange;

    public void add(E element) {

        if (addedElementRange == array.length) {
            Object[] array2 = (E[]) new Object[array.length + array.length / 2];
            for (int i = 0; i < array.length; i++) {
                array2[i] = array[i];
            }
            array = array2;

        }

        array[addedElementRange++] = element;
    }

    
    
    public E get(int i) {

        return (E) array[i];
    }

    
    
    
    
    
    public void remove(int a) {
        Object[] array2 = (E[]) new Object[array.length - 1];
        for (int i = 0; i < a; i++) {
            array2[i] = array[i];
        }

        for (int i = a; i < array2.length; i++) {
            array2[i] = array[i + 1];
        }

        array = array2;

    }

    
    
    
    public int lenght() {

        return array.length;
    }
}
