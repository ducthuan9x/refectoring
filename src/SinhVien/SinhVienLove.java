package SinhVien;

public class SinhVienLove {
    private String ten;
    private  int tuoi;
    private String maSo;

    public SinhVienLove(String ten, int tuoi, String maSo) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.maSo = maSo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public SinhVienLove() {

    }

    @Override
    public String toString() {
        return "SinhVienLove{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", maSo='" + maSo + '\'' +
                '}';
    }
}
