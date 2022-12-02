public class sayiBulma {
    public static void main(String[] args){
        int[] sayilar = new int[] {1 , 5, 9 ,7 ,10 ,8};
        int aranan_sayi = 15;
        boolean istrue = false;

        for (int sor: sayilar){
            if (aranan_sayi == sor)
            {
                System.out.println("Aranan Sayi Bulundu. !");
                istrue = true;
                break;
            }
            else
                istrue = false;
        }
        if (istrue == false)
            System.out.println("Aranan Sayi Bulunamadi. !");
    }
}
