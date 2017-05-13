package xyz.pinaki.designpattern.examples.structural.composite;

/**
 * Created by pinaki on 5/12/17.
 */
public abstract class Node {
    int data() {
        throw new UnsupportedOperationException("Not Implemented Yet");
    }
    Node  left() {
        return null;
    }
    Node right() {
        return null;
    }

}
