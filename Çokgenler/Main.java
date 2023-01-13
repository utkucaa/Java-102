import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kenarSayisi;
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.print("Kenar sayısı giriniz: ");
        kenarSayisi = sc.nextInt();

        System.out.print("isim giriniz: ");
        name = sc.next();

        Cokgenler cokgen = new Cokgenler(kenarSayisi,name);

        System.out.println(cokgen.icAciBul());
        System.out.print(cokgen.disAciBul());

    }
}
