package Shape;

public class Quadrilateral extends Point {
    public void kiemtra(){
    Point p = new Point();
       System.out.println("Nhap hoanh do va tung d  ");
       p.in();
       if(p.hoanhdo < 0 || p.tungdo < 0 )
       {
           p.hoanhdo = Math.abs(p.hoanhdo);
           p.tungdo = Math.abs(p.tungdo);
       }
       if(p.hoanhdo == p.tungdo && p.hoanhdo + p.tungdo == 180 )
       {
           System.out.println("\t la 1 tu giác va la tu giac noi tiep  ");
       }
       else 
       {
           System.out.println("\tKhong phai la 1 tu giac  ");
       }
    }
}