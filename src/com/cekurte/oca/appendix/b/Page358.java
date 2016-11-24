package com.cekurte.oca.appendix.b;

/**
 * Run with successfully if you declare the method "something" that are defined in Page358InterfaceA and Page358InterfaceB.
 */
public class Page358 implements Page358InterfaceA, Page358InterfaceB {
    public static void main(String[] args) {
        Page358 page = new Page358();
        page.something();
    }

    public void something() {
        System.out.println("Page358::something()");
    }
}
