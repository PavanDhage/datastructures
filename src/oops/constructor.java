package oops;

import java.util.Date;

public class constructor extends Student{

    private int Date ;
    final int deadline = Date + 2;

    public constructor(String name, int id) {
        super(name, id);
    }

    public constructor() {
        String name = "test";
        int id =0;
        super(name, id);
    }


    //    protected void finalize( ) {
//        System.out.println("gb collector called");
//    }
    static void main() {
        constructor c = new constructor();
        System.out.println(c.Date);
        System.out.println(c.deadline);
        System.out.println(c.name + " " + c.id);
    }


    // constructor while inheritance
    // Any class will have a default constructor, does not matter if we declare it in the class or not. If we inherit a class,
    //then the derived class must call its super class constructor. It is done by default in derived class.
    //If it does not have a default constructor in the derived class, the JVM will invoke its default constructor and call
    //the super class constructor by default. If we have a parameterised constructor in the derived class still it calls the
    //default super class constructor by default. In this case, if the super class does not have a default constructor,
    //instead it has a parameterised constructor, then the derived class constructor should call explicitly call the
    //parameterised super class constructor.
}
