import Shape.Point;
import Shape.Quadrilateral;
import Shape.Triangle;

import java.util.Scanner;
public class App2604 {
    public static void main(String[] args) throws Exception {
       Point p = new Point();
        Quadrilateral q = new Quadrilateral();
        Triangle t = new Triangle();

       System.out.print("Nhap su lua chon cua ban : \n");
         System.out.print("\t1. Nhap toa do mat phang oxy : \n");
         System.out.print("\t2. Nhap va check xem co phai la  tam giac khong : \n");
         System.out.print("\t3. Nhap và check xem co phai la tu giac khong  : \n");
         System.out.print("\t4. Thoat : ");

         try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\n Nhap su lua chon cua ban : ");
            int luachon = sc.nextInt();
            if( luachon == 1 )
            {
                p.nhapDiem();
                p.inDiem();
            }
            else if ( luachon == 2 )
            {
                t.Nhap();
                t.test();
            }
            else if ( luachon == 3 )
            {
                q.kiemtra();
            }
            else if ( luachon == 4 )
            {
                return;
            }
        }

    }
}