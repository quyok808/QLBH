package QLBH;

import java.util.Scanner;

/**
 *
 * NGUYEN CONG QUY
 */
public class Date {
    private int ngay;
    private int thang;
    private int nam;

    public Date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public Date() {
    }
    
    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày: ");
        setNgay(sc.nextInt());
        System.out.println("Nhập tháng: ");
        setThang(sc.nextInt());
        System.out.println("Nhập năm: ");
        setNam(sc.nextInt());
    }
    public String output() {
//        System.out.print(ngay + "/" + thang + "/" + nam);
        return ngay + "/" + thang + "/" + nam;
    } 
}
