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
    private HOADON hd = new HOADON();
    private int[] SLOrder = new int[100];
    private int n = 0;
    
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

    public int[] getSLOrder() {
        return SLOrder;
    }

    public void setSLOrder(int[] SLOrder) {
        this.SLOrder = SLOrder;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
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

//================================= Methods ===============
    
    public void input(HANGHOA e){
        Scanner sc = new Scanner(System.in);
        System.out.println("Số lượng: ");
        int soluong = sc.nextInt();
        int check = kho.xuatkho(e.getMaHang(), soluong);
        if ( check == 0){
            return;
        }
        if (n == 0 && cthd.isEmpty()){
            cthd.add(e);
            SLOrder[n++] = soluong;
        } else {
            int flag = -1;
            for (int i = 0; i < cthd.size(); i++){
                if (cthd.get(i).getMaHang().equals(e.getMaHang())){
                    flag = i;
                    break;
                }  
            }
            if (flag == -1) {
                cthd.add(e);
                SLOrder[n++] = soluong;
            } else {
                SLOrder[flag] += soluong;
            }
        }  
    }
    
    public double thanhtien(){
        double tongtien = 0;
        for (int i = 0; i < cthd.size(); i++){
            tongtien += (cthd.get(i).getGiaBan() * SLOrder[i]);
        }
        return tongtien;
    }
    
    public void output(){
        System.out.println("+-------------------------------------+");
        hd.setThanhtien(thanhtien());
        hd.output();
        System.out.println("+--------------------+----------+-----+");
        System.out.println("|Tên hàng hoá        |Giá bán   |SL   |");
        for (HANGHOA obj : cthd){
            System.out.println("|--------------------+----------+-----+");
            System.out.printf("|%20s|%10f|%5d|\n",obj.getTenHang(),obj.getGiaBan(),SLOrder[cthd.indexOf(obj)]);
        }
        System.out.println("+--------------------+----------+-----+");
    }
}
