package shapes;
import java.util.Scanner;
public class HinhTru extends HinhTron{
    public float chieuCao;
  public HinhTru(){
    ten = "Hình Trụ";
  }
  public void nhapChieuCao(){
    nhapBanKinh();
    System.out.println("Chiều cao = ");
    try (Scanner sc = new Scanner(System.in)) {
        chieuCao=sc.nextFloat();
    }
  }
  public void tinhTheTich(){
    tinhDienTich();
    theTich = dienTich * chieuCao;
  }
  public void xuatThongTin()
  {
    System.out.println("Đây là hình trụ ");
  }
}
