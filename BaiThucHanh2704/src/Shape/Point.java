package Shape;
import java.util.Scanner;
public class Point {
    //nhap set,get
    public void get()
    {

    }
    public void set()
    {
        
    }
    // nhap cac phuong thuc
    public String ten;
    public float hoanhdo,tungdo;
    Scanner sc = new Scanner(System.in);
    public void nhap() {
   
        System.out.print("Nhap ten toa do : ");
            ten = sc.nextLine();
        System.out.print("Nhap hoanh do : ");
            hoanhdo = sc.nextFloat();
        System.out.print("Nhap tung do  : ");
            tungdo = sc.nextFloat();
    }
    
    public void in()
    {
        System.out.printf("Diem co toa do : %s(%f,%f) " ,hoanhdo,tungdo );
    }
}