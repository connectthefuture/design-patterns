package xyz.pinaki.designpattern.examples.reflection;

import sun.jvm.hotspot.utilities.Assert;

import java.lang.reflect.*;
import java.util.Arrays;

/**
 * Created by pinaki on 5/12/17.
 */
public class ReflectionMain {
    public static void main(String[] args) {
        // write your code here
        Class demoClass = ReflectionDemo.class;
        System.out.println(demoClass.getName());

        int m = demoClass.getModifiers();
        System.out.println(Modifier.isAbstract(m) + ", " + Modifier.isPublic(m) + ", " + Modifier.isSynchronized(m) +
                ", " + Modifier.isFinal(m) + ", " + Modifier.isVolatile(m));

        Class[]interfaces = demoClass.getInterfaces();
        System.out.println("interfaces: " + Arrays.asList(interfaces));

        Method[] classMethods = demoClass.getMethods();
//        System.out.println("methods: " + Arrays.asList(classMethods));
        for (Method method : classMethods) {
            System.out.println(method.getName());
            Class[] parameterTypes = method.getParameterTypes();
        }

        // call the constructor and instantiate object
        try {
            Constructor constructor = demoClass.getConstructor();
            ReflectionDemo demoObj =  (ReflectionDemo)constructor.newInstance();
            demoObj.mockPublicMethod();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        try {
            // get a private field member
            Field privateFieldName = ReflectionDemo.class.getDeclaredField("val");
            privateFieldName.setAccessible(true);
            ReflectionDemo demoObj = new ReflectionDemo();
            int v = (int) privateFieldName.get(demoObj);
            System.out.println(v);
            Assert.that(v == 10, "private field val mismatch");

            // call a private method
            Method method = ReflectionDemo.class.getDeclaredMethod("mockPrivateMethod");
            method.setAccessible(true);
            method.invoke(demoObj);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
