package xyz.pinaki.designpattern.examples.structural.bridge;

/**
 * Created by pinaki on 5/12/17.
 */
/* package */ abstract class Node {
    int data() {
        throw new UnsupportedOperationException("Not Implemented Yet");
    }
    Node left() {
        return null;
    }
    Node right() {
        return null;
    }

}
