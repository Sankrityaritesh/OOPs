package com.ritesh;

public class NonParameterized {
    class Student {
        String name;
        int age;

        public void printInfo() {
            System.out.println(this.name);
            System.out.println(this.age);
        }

        Student() {
            System.out.println("constructor called");
        }
    }

    public static void main(String[] args) {
        NonParameterized nonParameterized = new NonParameterized(); // Create an instance of the outer class.
        Student s1 = nonParameterized.new Student(); // Create an instance of the inner class.
        s1.name = "Ritesh";
        s1.age = 20;
        s1.printInfo();
    }
}
