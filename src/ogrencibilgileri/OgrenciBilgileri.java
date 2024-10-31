package ogrencibilgileri;

import java.util.Scanner;

public class OgrenciBilgileri {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            String[] tckim = {"11223344556", "12345665432", "98765567892", "13579975311", "65465432113"};
            String[] adi = {"Kamil", "Mehmet", "Fatih", "Salih"};
            String[] soyadi = {"Urer", "Urer", "Urer", "Urer"};
            String[] email = {"kamilurer1@gmail.com", "mehmeturer1@gmail.com", "fatihurer1@gmail.com", "salihurer1@gmail.com"};
            String[] telefon = {"532 544 89 99", "505 325 44 70", "537 888 23 00", "541 777 54 29"};
            String[] bolum = {"Bilgisayar", "Makina", "YBS", "Tıp"};
            String[] dyeri = {"İstanbul", "Artvin", "Aydın", "Denizli"};
            int[] vize = {55, 44, 76, 61, 84};
            int[] finsinav = {25, 40, 30, 50, 95};

            double ortalama[] = new double[vize.length];

            int secim;
            String istenenTc;

            while (true) {
                System.out.println("[1] Tum ogrencilerin listelenmesi\n[2] Istenilen bir ogrencinin listelenmesi\n[3] 0 - sifir” indise bir veri eklenmesi");

                System.out.print("Seciminiz: ");
                secim = scanner.nextInt();

                switch (secim) {
                    case 1:
                        for (int i = 0; i < tckim.length; i++) {
                            System.out.println("\n*****************************************");
                            System.out.println("T.C. Kimlik No: " + tckim[i]);
                            System.out.println("Isim Soyisim: " + adi[i] + " " + soyadi[i]);
                            System.out.println("Email: " + email[i]);
                            System.out.println("Telefon: " + telefon[i]);
                            System.out.println("Bolum: " + bolum[i]);
                            System.out.println("Dogum Yeri: " + dyeri[i]);
                            System.out.println("Vize notu: " + vize[i]);
                            System.out.println("Final notu: " + finsinav[i]);
                            ortalama[i] = ((double) vize[i] + (double) finsinav[i]) / 2;
                            System.out.println("Ortalama: " + ortalama[i]);
                            if (ortalama[i] >= 50) {
                                System.out.println("TEBRİKLER GEÇTİNİZ, Ortalamanız : " + ortalama[i]);
                            } else {
                                System.out.println("ÜZGÜNÜM KALDINIZ, Ortalamanız : " + ortalama[i]);
                            }
                            System.out.println("*****************************************\n");
                        }
                        break;

                    case 2:
                    System.out.print("Aranacak ogrencinin T.C. Kimlik Numarası: ");
                    istenenTc = scanner.next();
                    for (int i = 0; i < tckim.length; i++) {
                        if (tckim[i].equals(istenenTc)) {
                            System.out.println("\n*****************************************");
                            System.out.println("T.C. Kimlik No: " + tckim[i]);
                            System.out.println("Isim Soyisim: " + adi[i] + " " + soyadi[i]);
                            System.out.println("Email: " + email[i]);
                            System.out.println("Telefon: " + telefon[i]);
                            System.out.println("Bolum: " + bolum[i]);
                            System.out.println("Dogum Yeri: " + dyeri[i]);
                            System.out.println("Vize notu: " + vize[i]);
                            System.out.println("Final notu: " + finsinav[i]);
                            ortalama[i] = ((double) vize[i] + (double) finsinav[i]) / 2;
                            System.out.println("Ortalama: " + ortalama[i]);
                            if (ortalama[i] >= 50) {
                                System.out.println("TEBRİKLER GEÇTİNİZ, Ortalamanız : " + ortalama[i]);
                            } else {
                                System.out.println("ÜZGÜNÜM KALDINIZ, Ortalamanız : " + ortalama[i]);
                            }
                            System.out.println("*****************************************\n");
                            break;
                        }
                    }
                    break;

                    case 3:
                        String[] yeniTckim = new String[tckim.length + 1];
                        String[] yeniAdi = new String[adi.length + 1];
                        String[] yeniSoyadi = new String[soyadi.length + 1];
                        String[] yeniEmail = new String[email.length + 1];
                        String[] yeniTelefon = new String[telefon.length + 1];
                        String[] yeniBolum = new String[bolum.length + 1];
                        String[] yeniDyeri = new String[dyeri.length + 1];
                        int[] yeniVize = new int[vize.length + 1];
                        int[] yeniFinsinav = new int[finsinav.length + 1];
                        double[] yeniOrtalama = new double[ortalama.length + 1];

                        System.out.println("\n*****************************************");
                        System.out.print("T.C. Kimlik No: ");
                        yeniTckim[0] = scanner.next();
                        System.out.print("Isim: ");
                        yeniAdi[0] = scanner.next();
                        System.out.print("Soyisim: ");
                        yeniSoyadi[0] = scanner.next();
                        System.out.print("Email: ");
                        yeniEmail[0] = scanner.next();
                        System.out.print("Telefon: ");
                        yeniTelefon[0] = scanner.next();
                        System.out.print("Bolum: ");
                        yeniBolum[0] = scanner.next();
                        System.out.print("Dogum Yeri: ");
                        yeniDyeri[0] = scanner.next();
                        System.out.print("Vize notu: ");
                        yeniVize[0] = scanner.nextInt();
                        System.out.print("Final notu: ");
                        yeniFinsinav[0] = scanner.nextInt();
                        yeniOrtalama[0] = (yeniVize[0] + yeniFinsinav[0]) / 2;

                        for (int i = 0; i < adi.length; i++) {
                            yeniTckim[i + 1] = tckim[i];
                            yeniAdi[i + 1] = adi[i];
                            yeniSoyadi[i + 1] = soyadi[i];
                            yeniEmail[i + 1] = email[i];
                            yeniTelefon[i + 1] = telefon[i];
                            yeniBolum[i + 1] = bolum[i];
                            yeniDyeri[i + 1] = dyeri[i];
                            yeniVize[i + 1] = vize[i];
                            yeniFinsinav[i + 1] = finsinav[i];
                            yeniOrtalama[i + 1] = ortalama[i];
                        }

                        tckim = yeniTckim;
                        adi = yeniAdi;
                        soyadi = yeniSoyadi;
                        email = yeniEmail;
                        telefon = yeniTelefon;
                        bolum = yeniBolum;
                        dyeri = yeniDyeri;
                        vize = yeniVize;
                        finsinav = yeniFinsinav;
                        ortalama = yeniOrtalama;
                        break;
                    default:
                        throw new AssertionError();
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

}
