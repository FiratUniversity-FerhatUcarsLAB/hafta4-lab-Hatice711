import java.util.Scanner;
public class OgrenciBilgi {
    public static void main(String[] args) {

        //degiskenler aliniyor
        Scanner input = new Scanner(System.in);
        System.out.print("Adınızı giriniz: ");
        String ad = input.nextLine();

        System.out.print("Soyadınızı giriniz: ");
        String soyad = input.nextLine();

        System.out.print("Ögrenci Numaranız :" );
        int ogrenci_no = input.nextInt();H

        System.out.print("Yasınız: ");
        int yas = input.nextInt();

        System.out.print("GPA (0.00-4.00):");
        float gpa = input.nextFloat();

        //bilgiler ekrana bastiriliyor
        System.out.println("=== OGRENCİ BILGI SİSTEMİ ===");
        System.out.printf("Ad Soyad: %s %s \n", ad, soyad) ;
        System.out.printf("Ogrenci No: %d", ogrenci_no);
        System.out.printf("\nYas: %d", yas);
        System.out.printf("\nGPA: %.2f", gpa);
    }
}
