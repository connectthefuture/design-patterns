package xyz.pinaki.designpattern.examples.structural.composite;

/**
 * Created by pinaki on 5/12/17.
 */
public class LeafNode extends Node {
    private final int data;

    LeafNode(int d) {
        data = d;
    }

    @Override
    int data() {
        return data;
    }
}
