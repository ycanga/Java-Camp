public class SesliHafler {
    public static void main(String[] args) {
        char harf = 'u';
        boolean istrue = true;
        char[] harfler = {'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü'};

        switch (harf) {
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Girilen Harf Kalın Sesli Harftir. !");
                break;
            default:
                System.out.println("Girilen Harf İnce Sesli Harftir. !");
        }

        for (char sor : harfler) {
            if (sor == harf) {
                System.out.println("Girilen Harf Sesli Harftir. !");
                istrue = true;
                break;
            } else
                istrue = false;
        }
        if (istrue == false)
            System.out.println("Girilen Harf Sesli Harf Degildir. !");
    }
}
