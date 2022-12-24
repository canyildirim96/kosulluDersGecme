import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = inp.nextInt();
        if (mat < 0 || mat > 100){
            mat = 0;
        }

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = inp.nextInt();
        if (fizik < 0 || fizik > 100){
            fizik = 0;
        }
        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = inp.nextInt();
        if (turkce  < 0 || turkce > 100){
            turkce = 0;
        }

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = inp.nextInt();
        if (kimya < 0 || kimya > 100){
            kimya = 0;
        }

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = inp.nextInt();
        if (muzik < 0 || muzik > 100){
            muzik = 0;
        }

        double ortalama = (mat + fizik + turkce + kimya + muzik) / 5;
        System.out.println("Ortalamanız: " + ortalama);
        if (ortalama <= 55){
            System.out.print("Ortalamadan Kaldınız, Seneye Görüşürüz.");
        }else {
            System.out.print("Tebrikler. Yılı Başarıyla Tamamladınız.");
        }

    }
}