import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k;
        int toplam=0;
        int adet=0;
        boolean ilk = false;

        System.out.print("Sayı giriniz: ");
        k = sc.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                if (!ilk) {
                    toplam = i;
                    adet = 1;
                    ilk = true;
                } else {
                    toplam += i;
                    adet++;
                }
            }
        }

        if (ilk) {
            double ortalama = (double) toplam / adet;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        }
    }
}













