package org.example;

public interface ArrayCollection {
    void add(int element); //add element
    int get(int index); //find element for index
    void remove(int index); //remove for index
    int findIndex(int element); //find endex of element
    boolean contains(int element); // check, is element in array?
    int size(); //return size of collection
}
