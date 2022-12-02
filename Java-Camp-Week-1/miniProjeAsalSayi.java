public class miniProjeAsalSayi {
    public static void asalmi(int sor){
        if (sor == 0)
            System.out.println("Girilen Sayi Asaldir. !");
        else
            System.out.println("Girilen Sayi Asal Degildir. !");
    }

    public static void main(String[] args){
        int number = 0;
        boolean istrue = true;

        if (number == 1){
            asalmi(0);
            return;
        }
        if (number < 1)
        {
            System.out.println("Geçersiz Sayi. !");
            return;
        }

        for (int i = 2; i < number; i++){
            if (number % i == 0)
            {
                istrue = false;
                asalmi(1);
                break;
            }
        }
        if (istrue == true)
            asalmi(0);
    }
}
