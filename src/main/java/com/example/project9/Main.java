package com.example.project9;

//Part 1
//1.1 Creating a new class and its object
class Class1 {
    public String name;
}

//1.2 Demonstrate a class with a public method and its call.
class myClassWithMethod {
    //public properties:
    public String name;
    public int age;
    //private properties:
    private String surname;
    private Boolean isStudent;

    //1.4 constructor
    public myClassWithMethod(String name, int age, String surname, Boolean isStudent) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.isStudent = isStudent;
        System.out.println("Constructor: object created successfully");
    }

    //1.7 setters and getters:
    //setters:
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIsStudent(boolean isStudent) {
        this.isStudent = isStudent;
    }
    //getters:
    public String getSurname(){
        return surname;
    }
    public boolean getIsStudent(){
        return isStudent;
    }

    public void print() {
        System.out.println("Full name: " + name + " " + surname + "\nAge: " + age);
        if (isStudent == true) {
            System.out.println("Is a student");
            return;
        }
        System.out.println("Is not a student");
    }


}

//1.3 Demonstrate a class with a private method
class PrivateMethodClass {
    //public properties:
    public String name;
    public int age;

    private PrivateMethodClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        //1.1 creating object
        Class1 obj = new Class1();
        //1.2 / 1.4 / 1.8 object creation and public method call and constructor with arguments
        myClassWithMethod obj2 = new myClassWithMethod("Oleksii", 18, "Ishchenko", true);
        /* 1.3 private method call outside the class
        PrivateMethodClass obj3 = new PrivateMethodClass("Oleksii", 18); */
        // 1.5 public properties of a various data types
        obj2.age = 19;
        obj2.name = "Oleksii";
        //1.5 & 1.6 access to these properties inside the class from the methods
        System.out.println("\nParts 1.5 & 1.6\nAccess to properties inside the class from the methods");
        obj2.print();
        /* 1.6 error of trying to access private property outside class through an object
        obj2.isStudent = false; */
        //1.7 setters and getters
        obj2.setSurname("Bochenko");
        obj2.setIsStudent(false);
        System.out.println("\nPart 1.7\nCheck of correct work of setters:");
        obj2.print();
        System.out.println("\nPart 1.7\nGetting private surname from obj2: " + obj2.getSurname());
        System.out.println("Getting private isStudent from obj2: " + obj2.getIsStudent());
    }
}