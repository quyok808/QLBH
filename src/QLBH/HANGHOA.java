package QLBH;

import java.util.Scanner;

/**
 *
 * NGUYEN CONG QUY
 */
public class HANGHOA {
    private String MaHang, TenHang, Loai, XuatXu, DVT;
    private double GiaBan;
    private Date NSX = new Date();
    private Date HSD = new Date();

    public HANGHOA() {
    }

    public HANGHOA(String MaHang, String TenHang, String Loai, String XuatXu, String DVT, double GiaBan,int ngaysx, int thangsx, int namsx,int ngayhsd, int thanghsd, int namhsd) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.Loai = Loai;
        this.XuatXu = XuatXu;
        this.DVT = DVT;
        this.GiaBan = GiaBan;
        this.NSX = new Date(ngaysx, thangsx, namsx);
        this.HSD = new Date(ngayhsd, thanghsd, namhsd);
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public String getXuatXu() {
        return XuatXu;
    }

    public void setXuatXu(String XuatXu) {
        this.XuatXu = XuatXu;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(double GiaBan) {
        this.GiaBan = GiaBan;
    }

    public Date getNSX() {
        return NSX;
    }

    public void setNSX(Date NSX) {
        this.NSX = NSX;
    }

    public Date getHSD() {
        return HSD;
    }

    public void setHSD(Date HSD) {
        this.HSD = HSD;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã hàng: ");
        setMaHang(sc.nextLine());
        System.out.println("Nhập tên hàng: ");
        setTenHang(sc.nextLine());
        System.out.println("Nhập loại hàng: ");
        setLoai(sc.nextLine());
        System.out.println("Nhập xuất sứ: ");
        setXuatXu(sc.nextLine());
        System.out.println("Nhập dvt: ");
        setDVT(sc.nextLine());
        System.out.println("Nhập giá bán: ");
        setGiaBan(sc.nextDouble());
        System.out.println("Nhập NSX: ");
        NSX.input();
        System.out.println("Nhập HSD: ");
        HSD.input();
    }
    
    public void output(){
        System.out.printf("|%5s|%20s|%10s|%10s|%7s|%10f|%10s|%10s|",MaHang,TenHang,Loai,XuatXu,DVT,GiaBan,NSX.output(),HSD.output());
    }   
}
