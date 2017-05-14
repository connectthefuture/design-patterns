package xyz.pinaki.designpattern.examples.structural.bridge;

/**
 * Created by pinaki on 5/14/17.
 */
class SynchronizedExpressionTree extends  ExpressionTree {

    SynchronizedExpressionTree(Node n) {
        super(n);
    }

    // TODO: add sync commands before all calls

}
