package QLBH;

import java.util.*;
/**
 *
 * NGUYEN CONG QUY
 */
public class CTHD{
//================================= Properties ======================
    private ArrayList<HANGHOA> cthd = new ArrayList<>();
    private KHO kho = new KHO();
    private double Thanhtien = 0;
    private HOADON hd = new HOADON();
    
//================================= Constructer =====================
    public CTHD() {
        hd.init_HD();
    }
//================================= Getter and setter ===============

    public ArrayList<HANGHOA> getCthd() {
        return cthd;
    }

    public void setCthd(ArrayList<HANGHOA> cthd) {
        this.cthd = cthd;
    }

    public KHO getKho() {
        return kho;
    }

    public HOADON getHd() {
        return hd;
    }

    public void setHd(HOADON hd) {
        this.hd = hd;
    }

    public void setKho(KHO kho) {
        this.kho = kho;
    }

    public double getThanhtien() {
        return Thanhtien;
    }

    public void setThanhtien(double Thanhtien) {
        this.Thanhtien = Thanhtien;
    }


    
//================================= Methods ===============
    public void input(int i){
        Scanner sc = new Scanner(System.in);
        HANGHOA e = kho.get_MaHangFromMenu(i);
        cthd.add(e);
        System.out.println("Số lượng: ");
        int soluong = sc.nextInt();
        setThanhtien(getThanhtien() + ((double)soluong * e.getGiaBan()));
   }
    
    public void show_CT(){
        for (HANGHOA obj : cthd){
            obj.output();
        }
    }
    
    public void output(){
        hd.output();
        hd.setThanhtien(getThanhtien());
        show_CT();  
    }
}
