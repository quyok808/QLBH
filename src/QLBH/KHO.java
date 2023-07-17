package QLBH;
import java.util.*;
/**
 *
 * @author account
 */
public class KHO {
    private ArrayList<HANGHOA> kho = new ArrayList<>();
    private int tongkho,n=0;
    private int SLHH[] = new int[100];
//================================================ constructer
    public KHO() {
    }
//================================================ getter and setter
    public ArrayList<HANGHOA> getKho() {
        return kho;
    }

    public void setKho(ArrayList<HANGHOA> kho) {
        this.kho = kho;
    }

    public int getTongkho() {
        return tongkho;
    }

    public void setTongkho(int tongkho) {
        this.tongkho = tongkho;
    }
    //=============================================== method
    public void NhapKho(HANGHOA e, int soluong){        
        if (kho.isEmpty()){
            kho.add(e);
            SLHH[n++] = soluong;
        } else {
//            for (HANGHOA obj : kho){
//                if (obj.getMaHang().equals(e.getMaHang())){
//                    SLHH[kho.indexOf(obj)] += soluong;
//                } else {
//                    kho.add(e);
//                    SLHH[n++] = soluong;
//                }
//            }
                for (int i = 0 ; i < kho.size(); i++){
                    if (kho.get(i).getMaHang().equals(e.getMaHang())){
                        SLHH[i] += soluong;
                    } else {
                        kho.add(e);
                        SLHH[n++] = soluong;
                    }
                }
        }
          
    }
    
    public void ThongKe(){
        System.out.println("+-----+--------------------+----------+----------+-------+----------+----------+----------+--------+");
        System.out.println("|Mã   |Tên hàng            |Loai      |Xuất sứ   |ĐVT    |Giá bán   |NSX       |HSD       |So Luong|");
        for (HANGHOA obj : kho){
            System.out.println("|-----+--------------------+----------+----------+-------+----------+----------+----------+--------|");
            obj.output();
            System.out.printf("%8d|\n",SLHH[kho.indexOf(obj)]);
        }
        System.out.println("+-----+--------------------+----------+----------+-------+----------+----------+----------+--------+");
    }
    
    public void xuatkho(String e, int soluong){
        for (HANGHOA obj: kho){
            if (obj.getMaHang().equals(e)){
                SLHH[kho.indexOf(obj)] -= soluong;
            }
        }
    }
}
