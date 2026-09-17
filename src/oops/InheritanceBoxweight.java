package oops;



 class Box{
    int width;
    int height;
    int length;

    Box(){
        width = -1;
        height = -1;
        length = -1;
    }
    Box(int length,int width, int height){
        this.length=length;
        this.width = width;
        this.height = height;
    }

     int volume(int length, int width, int height){
         return length * height * width;
     }

    int volume(){
        return this.length* this.width * this.height;
    }
}

class Boxweight extends Box{
        int weight ;

        Boxweight(int l, int w, int h, int we){
            width = w;
            height = h;
            length = l;
            weight = we;
        }
        Boxweight(){
            width = -1;
            height = -1;
            length = -1;
            weight = -1;
        }
}

public class InheritanceBoxweight {
    static void main() {
        Boxweight bw = new Boxweight();
        System.out.println(bw);
        System.out.println(bw.volume(3,4,6));

    }


}