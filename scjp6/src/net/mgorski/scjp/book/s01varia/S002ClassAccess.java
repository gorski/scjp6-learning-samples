package net.mgorski.scjp.book.s01varia;

import net.mgorski.scjp.book.s01varia.subpackage.S002Subclass;

public class S002ClassAccess {
    public static void main(String[] args) {
        S002Subclass sub = new S002Subclass(); // requires import of subpackage
    }
}

// default access
class Ass {
    
}

class A {
    void method(){}
    void method2(){};// semicolon
    
}; // senucikib

final class B {
}

// private class C {} // wrong ( outside of the public class)
// protected class D {} // wrogn!!
strictfp final class E {
}; // IEEE 754 rules of floating point
// abstract final class E {}; // wrong!

class NotAbstract {
    // abstract method dupa(); // wrong!
}

abstract class CarAbstract {
    final void eatThis() {
    };

    private final void eatThis4() {
    }; // only warning!

    public final void eatThis2() {
    };
}
