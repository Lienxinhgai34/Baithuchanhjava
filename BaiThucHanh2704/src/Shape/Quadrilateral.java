package Shape;

public class Quadrilateral extends Point {
    private double hoanhdodiemthunhat;
    private double hoanhdodiemthuhai;
    private double hoanhdodiemthuba;
    private double hoanhdodiemthutu;
    private double tungdodiemthunhat;
    private double tungdodiemthuhai;
    private double tungdodiemthuba;
    private double tungdodiemthutu;

    public void nhapDiem()
    {
        System.out.println("---Nhap diem thu nhat---");
        System.out.print("Nhap hoanh do: ");
        hoanhdodiemthunhat = sc.nextDouble();
        System.out.print("Nhap tung do: ");
        tungdodiemthunhat = sc.nextDouble();
        System.out.println("---Nhap diem thu hai---");
        System.out.print("Nhap hoanh do: ");
        hoanhdodiemthuhai = sc.nextDouble();
        System.out.print("Nhap tung do: ");
        tungdodiemthuhai = sc.nextDouble();
        System.out.println("---Nhap diem thu ba---");
        System.out.print("Nhap hoanh do: ");
        hoanhdodiemthuba = sc.nextDouble();
        System.out.print("Nhap tung do: ");
        tungdodiemthuba = sc.nextDouble();
        System.out.println("---Nhap diem thu tu---");
        System.out.print("Nhap hoanh do: ");
        hoanhdodiemthutu = sc.nextDouble();
        System.out.print("Nhap tung do: ");
        tungdodiemthutu = sc.nextDouble();
    }
    public void kiemtra(){
        Double a; // Độ dài điểm thứ nhất đến thứ hai
        Double b; // Độ dài điểm thứ hai đến thứ ba
        Double c; // Độ dài điểm thứ ba đến thứ tư
        Double d; // Độ dài điểm thứ tư đến thứ nhất
        Double e; // Độ dài điểm thứ nhất đến thứ ba;
        Double f; // Độ dài điểm thứ hai đến thứ tu;
        a = Math.sqrt(
            Math.pow((hoanhdodiemthuhai - hoanhdodiemthunhat), 2) + Math.pow((tungdodiemthuhai - tungdodiemthunhat), 2));
        b = Math
            .sqrt(Math.pow((hoanhdodiemthuba - hoanhdodiemthuhai), 2) + Math.pow((tungdodiemthuba - tungdodiemthuhai), 2));
        c = Math
            .sqrt(Math.pow((hoanhdodiemthutu - hoanhdodiemthuba), 2) + Math.pow((tungdodiemthutu - tungdodiemthuba), 2));
        d = Math.sqrt(
            Math.pow((hoanhdodiemthunhat - hoanhdodiemthutu), 2) + Math.pow((tungdodiemthunhat - tungdodiemthutu), 2));
        e = Math.sqrt(
            Math.pow((hoanhdodiemthuba - hoanhdodiemthunhat), 2) + Math.pow((tungdodiemthuba - tungdodiemthunhat), 2));
        f = Math
            .sqrt(Math.pow((hoanhdodiemthutu - hoanhdodiemthuhai), 2) + Math.pow((tungdodiemthutu - tungdodiemthuhai), 2));
        if (a + b == e || b + c == f || c + d == e || a + d == f)
          System.out.println("Bon diem khong tao thanh tu giac");
        else {
          if (a == b && b == c && c == d) {
            if ((a * a + b * b - e * e) / (2 * a * b) == 0 || (b * b + c * c - f * f) / (2 * b * c) == 0
                || (c * c + d * d - e * e) / (2 * c * d) == 0 || (d * d + a * a - f * f) / (2 * d * a) == 0)
              System.out.println("Day la hinh vuong");
            else
              System.out.println("Day la hinh thoi");
          } else if (a == c && b == d) {
            if ((a * a + b * b - e * e) / (2 * a * b) == 0 || (b * b + c * c - f * f) / (2 * b * c) == 0
                || (c * c + d * d - e * e) / (2 * c * d) == 0 || (d * d + a * a - f * f) / (2 * d * a) == 0)
              System.out.println("Day la hinh chu nhat");
            else
              System.out.println("Day la hinh binh hanh");
          } else
            System.out.println("Day la tu giac thuong");
        }  

    }
}
//        System.out.println("Nhap hoanh do va tung do  ");
//        p.inDiem();
//        if(p.hoanhDo < 0 || p.tungDo < 0 )
//        {
//            p.hoanhDo = Math.abs(p.hoanhDo);
//            p.tungDo = Math.abs(p.tungDo);
//        }
//        if(p.hoanhDo == p.tungDo && p.hoanhDo + p.tungDo == 180 )
//        {
//            System.out.println("\t day la mot tu giac  ");
//        }
//        else 
//        {
//            System.out.println("\tKhong phai la 1 tu giac  ");
//        }
//     }
// }