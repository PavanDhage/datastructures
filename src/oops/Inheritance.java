package oops;



public class Inheritance {
    //A Superclass Variable Can Reference a Subclass Object
    static void main() {
    Boxweight bw1 = new Boxweight(2,4,3,43);
    Box p1 = new Box();

//    p1 = bw1;
        System.out.println(bw1.volume());

        System.out.println(p1.volume(2,3,2));
//        System.out.println(p1.weight);
        System.out.println(p1.width);

    }


    //Member Access and Inheritance
    // private members cannot be accessed by the sub class
    // but can be initialised by constructor and can call super calls methods to work on it


}
