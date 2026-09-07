package Math;

public class RulerFunction {
    static void main() {
        int n = 10;
        String x = "";
        for (int i=1;i<=n;i++){
            String c = Integer.toString(i);
            x = x + " " + c+ " " + x;
            System.out.print(x + " " );
            System.out.println(x.length());

        }
    }
}
