package com.jlcindia.demo3;
/*
* @Author : Srinivas Dande
* @Company: Java Learning Center
* */
public interface A {
default void m1() {
System.out.println("A- m1() ");
}
default void m2() {
System.out.println("A- m2() ");
m1();
}
/*
default boolean equals(Object obj) {
System.out.println("A- equuals() ");
}
*/
}