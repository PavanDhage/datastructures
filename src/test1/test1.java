package test1;

public class test1 {

    static double quadaratic(String arg0, String arg1){
        double b = Double.parseDouble(arg0);
        double c = Double.parseDouble(arg1);
        double discriminant;
        discriminant = b*b-4.0*c;
        return discriminant;
    }

    public static int randomInt(){
        double r = Math.random(); // op btn 0-1
        // does this give 0 as op
        System.out.println("random op: " + r);
        return (int)(r*3);         // op btn 0, N-1
    }


    public static void main( ){
        System.out.println("dwnf");
        int i = 8939;
        String s = "Hellos";
        System.out.println(i+s);

        String cat1 = "1 ";
        String cat2 = cat1 + "2 " + cat1;
        String cat3 = cat2 + "3 " + cat2;
        String cat4 = cat3 + "4 " + cat3;

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);

        System.out.println("quadratic discriminant :" + quadaratic("3","6"));

        System.out.println("random Int : " + randomInt());
        Integer a = 20;
        Integer b = 24;
        Integer c = a;
        System.out.println(c);
    }
}
