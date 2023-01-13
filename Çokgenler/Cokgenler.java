public class Cokgenler {
    private int kenarSayi;
    private String  isim;

    public Cokgenler(int kenarSay, String isim) {
        this.kenarSayi = kenarSay;
        this.isim = isim;
    }

    public int getKenarSayi() {
        return kenarSayi;
    }

    public void setKenarSayi(int kenarSay) {
        this.kenarSayi = kenarSay;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    int icAciBul(){
        return  (this.kenarSayi-2)*180;
    }

    int disAciBul(){
        return 360 / this.kenarSayi;
    }
}
