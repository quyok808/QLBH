package QLBH;
import java.util.*;
/**
 *
 * @author account
 */
public class KHO {
    private ArrayList<HANGHOA> kho = new ArrayList<>();
    private int tongkho,n=0;
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
    public void NhapKho(HANGHOA e){        
        if (kho.isEmpty()){
            kho.add(e);
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
            } else {
                kho.get(flag).setSoluong(kho.get(flag).getSoluong()+e.getSoluong());
            }
        }   
        Sort_MaHang();
    }
    
    public void Sort_MaHang(){
        Collections.sort(kho, new Comparator<HANGHOA>() {
            @Override
            public int compare(HANGHOA o1, HANGHOA o2) {
                return o1.getMaHang().compareTo(o2.getMaHang());
            }
        });
    }
   
    public void ThongKe(){
        System.out.println("+-----+--------------------+----------+----------+-------+----------+----------+----------+--------+");
        System.out.println("|Mã   |Tên hàng            |Loai      |Xuất sứ   |ĐVT    |Giá bán   |NSX       |HSD       |So Luong|");
        for (HANGHOA obj : kho){
            System.out.println("|-----+--------------------+----------+----------+-------+----------+----------+----------+--------|");
            obj.output();
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
            if (kho.get(flag).getSoluong() >= soluong){
                kho.get(flag).setSoluong(kho.get(flag).getSoluong()-soluong);
            } else {
                System.out.println("Không đủ số lượng trong kho để xuất!");
            }
        }
    }
    
    public void menu(){
        System.out.println("+--------------------+----------+");
        System.out.println("|Tên hàng hoá        |Giá bán   |");
        for (HANGHOA obj : kho){
            System.out.println("|--------------------+----------|");
            System.out.printf("|%20s|%10f|\n",obj.getTenHang(),obj.getGiaBan());
        }
        System.out.println("+--------------------+----------+");
    }
    
    public HANGHOA get_MaHangFromMenu(int i){
        HANGHOA e = null;
        System.out.println(kho.get(0).getTenHang());
        e = kho.get(i);
        return e;
    }
}
