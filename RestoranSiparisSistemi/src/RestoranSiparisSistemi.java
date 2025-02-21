import java.util.Scanner;

public class RestoranSiparisSistemi {
        public static void main(String[] args) {
            // Fiyatlar
            double yemek1Fiyat = 15.0;
            double yemek2Fiyat = 25.0;
            double yemek3Fiyat = 35.0;
            double toplamHesap = 0.0;


            Scanner scanner = new Scanner(System.in);


            int secim;

            do {

                System.out.println("\nMenü:");
                System.out.println("1 - Pizza (15 TL)");
                System.out.println("2 - Spaghetti (25 TL)");
                System.out.println("3 - Burger (35 TL)");
                System.out.println("0 - Siparişi Tamamla");


                System.out.print("Bir yemek seçin (1-3) veya siparişi tamamlamak için 0'a basın: ");
                secim = scanner.nextInt();


                switch (secim) {
                    case 1:
                        toplamHesap += yemek1Fiyat;
                        System.out.println("Pizza seçildi. Fiyat: 15 TL Afiyet Olsun");
                        break;
                    case 2:
                        toplamHesap += yemek2Fiyat;
                        System.out.println("Spaghetti seçildi. Fiyat: 25 TL Afiyet Olsun");
                        break;
                    case 3:
                        toplamHesap += yemek3Fiyat;
                        System.out.println("Burger seçildi. Fiyat: 35 TL Afiyet Olsun");
                        break;
                    case 0:
                        System.out.println("Sipariş tamamlandı. Siparişiniz Hazırlanıyor...");
                        break;
                    default:
                        System.out.println("Geçersiz seçim, lütfen 1, 2, 3 veya 0 girin.");
                        break;
                }
            } while (secim != 0);


            System.out.println("\nToplam hesap: " + toplamHesap + " TL");


            scanner.close();
        }


}
