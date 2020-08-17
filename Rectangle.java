 //                                                   Question - 2

 import java.util.Scanner;

 public class Rectangle {
      int width,height;
      void display()
      {
          System.out.println("Width :"+width+",  Height :"+height);
      }
}

class RectangleArea extends Rectangle{

     public  void read_Input(int wid,int hei){
            this.width=wid;
            this.height=hei;
     }

    public void display(){
         super.display();;
        System.out.println( this.width*this.height);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RectangleArea rect1 = new RectangleArea();
        int wid = scan.nextInt();
        int hei = scan.nextInt();
        rect1.read_Input(wid,hei);
        rect1.display();
        scan.close();

    }
 }


