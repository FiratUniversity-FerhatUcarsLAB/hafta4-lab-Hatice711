import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bilgi girişi
        System.out.print("Çalışan adı soyadı: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylık brüt maaş (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalık çalışma saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai saati sayısı: ");
        int mesaiSaat = input.nextInt();

        // 1. Gelirler
        double mesaiUcreti = (brutMaas /160) * mesaiSaat * 1.5;
        double ToplamGelir = brutMaas + mesaiUcreti;

        // 2. Kesintiler
        double sgk = ToplamGelir * 0.14;
        double gelirVergisi = ToplamGelir * 0.15;
        double damgaVergisi = ToplamGelir * 0.00759;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        // 3. Net Maaş
        double netMaas = ToplamGelir - toplamKesinti;

        // 4. İstatistikler
        double kesintiOrani = (toplamKesinti / ToplamGelir) * 100 ;
        double saatlikNet = netMaas / 176;
        double gunlukNet = netMaas / 22;

        // Sonuçlar
        System.out.println("\n--- Maaş Bordrosu --- ");
        System.out.println("Ad Soyad: " + adSoyad);
        System.out.printf("Brüt Maaş : %.2f TL%n", brutMaas);
        System.out.printf("Mesai Ücreti : %.2f TL%n", mesaiUcreti);
        System.out.printf("Toplam Gelir : %.2f TL%n",ToplamGelir);
        System.out.printf("Toplam Kesinti : %.2f TL%n",toplamKesinti);
        System.out.printf("Net Maaş : %.2f TL%n",netMaas);
        System.out.printf("Kesinti Oranı : %.2f%%%n",kesintiOrani);
        System.out.printf("Saatlik Net Kazanç : %.2f TL%n",saatlikNet);
        System.out.printf("Günlük Net Kazanç : %.2f TL%n",gunlukNet);

        input.close();
    }
}
