public class mükemmelSayi {
    public static void main(String[] args){
        int sayi = 27;
        int toplam = 0;

        for (int i = 1; i < sayi; i++){
            if (sayi % i == 0)
                toplam += i;
        }
        if (toplam == sayi)
            System.out.println("Girilen Sayi Mükemmel Sayidir. !");
        else
            System.out.println("Girilen Sayi Mükemmel Değildir. !");
    }
}
