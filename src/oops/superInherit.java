package oops;


class Boxcolor extends Boxweight{
    String color;
    Boxcolor(int w, int h, int l, String c){
        System.out.println(super.weight);
        color = c;
    }
    Boxcolor(){
        super();
        color = null;
    }
}
public class superInherit {

    //super has two general forms. The first calls the superclass’ constructor. The
    //second is used to access a member of the superclass that has been hidden by a
    //member of a subclass.
    static void main() {
    Boxcolor bc = new Boxcolor();
        System.out.println(bc.volume());
        System.out.println(bc.volume(3,2,2));
        System.out.println(bc.color);
    }
}
