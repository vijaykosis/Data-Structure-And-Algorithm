package org.vijaykoshis.Mcq;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee e = new Employee(1, "Vijay");
        System.out.println(e.getId()+","+e.getName());

        Employee e1 = new Employee(1, "Vijay");

        System.out.println(e.hashCode() + "\t" + e1.hashCode());
        System.out.println(e.getId() == e1.getId());


    }
}
