package ca.jrvs.challenge.freq5;

import java.util.LinkedList;

public class Length_SingleLinkedList {
    /**
     * Find the length of a singly linked list
     *
     * @param s
     * @return
     */
    public long lengthOfSLL(LinkedList<Object> s) {
        return s.stream().count();
    }
}
