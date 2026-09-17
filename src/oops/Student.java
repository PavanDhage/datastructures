package oops;

import java.util.Scanner;

public class Student {
    // class = template or datatype;

    // instance variables
    String name;
    int id;
    int[] marks = new int[5];

    public Student(String name, int id) {
        // constructor called at time of creating obj with new Student , A constructor defines
        //what occurs when an object of a class is created.
        this.id= id;
        this.name= name;

        //to refer to the object that invoked it, this keyword is used
    }

//    public Student() {
//
//    }


    double percentage(){
        // percentage(int[] marks) marks = parameter
        int sum=0;
        for(int i=0;i<5;i++){
            sum = sum +marks[i];

        }
        return sum/5.0;
    }

    static void main() {
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter name and id for student");
        String name = sc.next();
        int id = sc.nextInt();

        Student s1 ; // reference variable is created and assigned to s1 (by compiler)
        s1= new Student(name, id); //creates a obj and assigns to the reference variable
        // dynamic allocation happens (assigned obj during runtime) (by JVM)
        System.out.println("student id is: "+ s1.id);


        for(int i=1;i<=5;i++){
            System.out.println("enter the marks for subject "+ i);
            s1.marks[i-1]=sc.nextInt();
        }
        System.out.println("the avg marks scored by "+ s1.name+ " is : "+ s1.percentage());
        // percentage(marks) marks = argument
        // dot operator s1.name

       Student s2=s1;
        System.out.println();
        System.out.println(s1);
        System.out.println(s2); // these two give same o/p as they are pointing to same obj
        // just different reference variable

        System.out.println(s1.id+ " "+ s2.id);

    }
}
