package xyz.pinaki.designpattern.examples.structural.composite;

/**
 * Created by pinaki on 5/12/17.
 */
public class UnaryNode extends Node {
    private Node right;
    UnaryNode(Node n) {
        right = n;
    }

    @Override
    Node right() {
        return right;
    }
}
