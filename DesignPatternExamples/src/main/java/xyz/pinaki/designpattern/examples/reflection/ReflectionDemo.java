package xyz.pinaki.designpattern.examples.reflection;

/**
 * Created by pinaki on 5/12/17.
 */
public class ReflectionDemo {
    private final int val = 10;
    public ReflectionDemo() {

    }
    private void mockPrivateMethod() {
        System.out.println("invoked mock private method");
    }

    public void mockPublicMethod() {
        System.out.println("invoked mock public method");
    }
}
