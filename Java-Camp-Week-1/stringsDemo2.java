public class stringsDemo2 {
    public static void main(String[] args){
        String mesaj = " Bugün hava çok güzel. ";
        System.out.println(mesaj);

        System.out.println(mesaj.replace(" ", "_"));// metin içerisinde değiştirilmek istenen karakter ve değişecek olan karakter belirtilir. Metin içerisindeki tüm karakterli deiştirir.
        System.out.println(mesaj.substring(0,5));// string içerisindeki ilk verilen index ile ikinci index arasındaki stringi geri döndürür.
        System.out.println("------------------------");
        for (String ayir: mesaj.split(" ")) {
            System.out.println(ayir);
        }
        System.out.println("-------------------------");
        System.out.println(mesaj.toLowerCase());
        System.out.println("-------------------------");
        System.out.println(mesaj.toUpperCase());
        System.out.println("-------------------------");
        System.out.println(mesaj.trim());
    }
}
