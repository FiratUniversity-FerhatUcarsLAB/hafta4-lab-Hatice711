import java.util.Scanner;

public class GeometrikHesap {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //yarıçap bilgisi al
         System.out.println("Daire yarıcapını girin (cm):");
         double yarıcap = input.nextDouble();

        //pi sayısını tanımla
        float pi = 3.1415f;

        //matematiksel islemler
         System.out.println("SONUCLAR: ");
         System.out.println("----------------");

         double alan = pi * yarıcap * yarıcap;
         System.out.printf("Daire Alanı :%.2f cm^2" , alan);

         double çevre = 2 * pi * yarıcap;
         System.out.printf("\nDaire Cevre :%.2f cm^2" , çevre);

         double cap = 2 * yarıcap;
         System.out.printf("\nDaire cap :%.2f cm" , cap);

         double kure_hacmi = (4.0/3.0) * pi * yarıcap * yarıcap * yarıcap;
         System.out.printf("\nKure Hacmi :%.2f cm^3" , kure_hacmi);

         double kure_yuzey_alanı = 4 * pi * Math.pow(yarıcap,2);
         System.out.printf("\nKüre Yüzey Alanı:%.2f cm^2",kure_yuzey_alanı);
    }
}
