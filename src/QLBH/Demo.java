package QLBH;

import java.util.Scanner;
/**
 *
 * @author account
 */
public class Demo {
	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HANGHOA hh;
        KHO kho = new KHO();
        CTHD hd = null;
        int chon;
        do {
            System.out.println("0: thoat");
            System.out.println("1: Ban Hang");
            System.out.println("2: Quan li");
            System.out.println("Chuc nang ban chon la: ");
            chon = sc.nextInt();
            switch(chon){
                case 1:
                    int chon_banHang;
                    do {
                        System.out.println("0: thoat");
                        System.out.println("1: Chon mon");
                        System.out.println("2: Thanh toan");
                        System.out.println("Chuc nang ban chon la: ");
                        chon_banHang = sc.nextInt();
                        switch(chon_banHang){
                            case 1:
                                hd = new CTHD();
                                System.out.println("Chọn -1 để hoàn thành order!");
                                int chon_menu;
                                do{
                                    kho.menu();                                   
                                    chon_menu = sc.nextInt();
                                    
                                    if (chon_menu == -1) 
                                        break;
                                    System.out.println("Số lượng: ");
                                    int soluong = sc.nextInt();
                                    HANGHOA t;
                                    t = kho.getKho().get(chon_menu);
                                    
//                                    if (kho.Tim_MaHang(t.getMaHang()) == -1) {
//                                    	System.out.println("Không có hàng này trong kho!");
//                                    } else {
//                                    	int check;
//	                                    check = kho.xuatkho(kho.getKho().get(chon_menu).getMaHang(), soluong);
//	                                    if (check == 1) {
	                                    	hd.input_CTHD(t, soluong);
//	                                    } 
//                                    }
                                }while(chon_menu != -1);
                                break;
                            case 2:
                                hd.output();
                                hd.Tru();
                                break;
                            default:
                                chon_banHang = 0;
                                break;
                        }
                    }while (chon_banHang != 0);
                    break;
                case 2:
                    int chon_QuanLy;
                    do {
                        System.out.println("0: Thoat");
                        System.out.println("1: Nhap kho");
                        System.out.println("2: Xuat kho");
                        System.out.println("3: Thong ke kho");
                        System.out.println("4: QL Nhan vien");
                        System.out.println("Chức năng bạn chọn là: ");
                        chon_QuanLy = sc.nextInt();
                        switch(chon_QuanLy){
                            case 1:
                                System.out.println("-------------Nhập kho---------------");
                                hh = new HANGHOA();
                                hh.input();
                                kho.NhapKho(hh);
                                break;
                            case 2:
                                System.out.println("-------------Huỷ hàng---------------");
                                sc.nextLine();
                                System.out.println("Nhập mã hàng: ");
                                String mahang_huy = sc.nextLine();
                                System.out.println("Nhập số lượng: ");
                                int sl_huy = sc.nextInt();
                                kho.xuatkho(mahang_huy, sl_huy);
                                break;
                            case 3:
                                System.out.println("Thống kê kho:");
                                kho.ThongKe();
                                break;
                                
                            case 4:
                                
                                break;
                            default: 
                                chon_QuanLy = 0;
                                break;
                        }
                    } while(chon_QuanLy != 0);
                    break;
                default:
                    chon = 0;
                    break;
            }
        } while(chon != 0);
        
    }
    
}
