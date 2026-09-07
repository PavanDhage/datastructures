package test1;

public class numberseries1 {

    // fibonccci number to trace code learn

    public static void main(String[] args){
        int f = 0, g =1;
        for (int i=0;i<=15 ;i++){
            System.out.println(f);
            f= f+g;
            g = f-g;
        }
    }
}

