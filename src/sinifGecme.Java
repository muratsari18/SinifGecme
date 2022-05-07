import java.util.Scanner;

public class sinifGecme {
    public static void main(String[] args) {
        double mat, fizik, turkce, kimya, muzik, ortalama;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Ders notunu giriniz: ");
        mat = inp.nextDouble();
        
        System.out.print("Fizik Ders notunu giriniz: ");
        fizik = inp.nextDouble();
        
        System.out.print("Turkce Ders notunu giriniz: ");
        turkce = inp.nextDouble();
        
        System.out.print("Kimya Ders notunu giriniz: ");
        kimya = inp.nextDouble();
        
        System.out.print("Muzik Ders notunu giriniz: ");
        muzik = inp.nextDouble();

        double toplam = (mat + fizik + turkce + kimya + muzik);
        ortalama = toplam / 5;

        if (ortalama >= 55)
            System.out.println("Tebrikler Sınıfı Gectiniz");
        else
            System.out.println("Sinif Tekrari");

        System.out.println("Ders Ortalamaniz : " + ortalama);


    }
}

