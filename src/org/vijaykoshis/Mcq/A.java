package org.vijaykoshis.Mcq;

class A {
    int i;

    static {
        System.out.println("Class A static block");
    }

    {
        System.out.println("class A Instance Initialization Block");
    }

    {
        System.out.println("class A Instance Initialization Block II");
    }

    A() {
        System.out.println("Class A Constructor");
    }
}

class B extends A {
    int j;

    static {
        System.out.println("Class B static block");
    }


    {
        System.out.println("class B Instance Initialization Block II");
    }

    B() {
        System.out.println("Class B Constructor");

    }
}

class MainClass {
    public static void main(String[] args) {
        B b = new B();
    }
}