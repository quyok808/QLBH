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
            int flag = -1;
            for (int i = 0 ; i < kho.size(); i++){
                if (kho.get(i).getMaHang().equals(e.getMaHang())){
                    flag = i;
                    break;
                }              
            }
            if (flag == -1){
                kho.add(e);
                SLHH[n++] = soluong;
            } else {
                SLHH[flag] += soluong;
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
        int flag = -1;
        
            
            for (int i = 0 ; i < kho.size(); i++){
                if (kho.get(i).getMaHang().equals(e)){
                    flag = i;
                    break;
                }              
            }
            if (flag == -1){
                System.out.println("Không có sản phẩm trong kho!");
            } else {
                if (SLHH[flag] >= soluong){
                    SLHH[flag] -= soluong;
                } else {
                    System.out.println("Không đủ số lượng trong kho để huỷ!");
                }
            }
        
    }
}
