package Math;

public class table1 {

    // Write a program FunctionGrowth that prints a table of the values logN,
    //N, N logN, N2, N3, and 2^N for N = 16,32,64,..., 2048. Usetabs (\t characters) to
    //line up columns

    static void main() {
//        int n = 10;

        for (int i=16; i<=2048 ;i=i*2){
            double x= Math.log(i);
            System.out.print(x + "\t");
            System.out.print(i+ "\t");
            System.out.print(i*x + "\t");
            System.out.print(i*i + "\t");
            System.out.print(i*i*i + "\t");
            System.out.println(Math.pow(2,1));
        }
    }
}
