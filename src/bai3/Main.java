package bai3;

public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.hoTen = "Son";
        sv.namSinh = 2005;
        sv.sdt = "019283091823";
        System.out.println(sv.hoTen + ", " + sv.namSinh + ", " + sv.sdt);
        System.out.println(sv);
    }
}
