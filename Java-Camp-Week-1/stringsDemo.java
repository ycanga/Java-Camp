public class stringsDemo {
    public static void main(String[] args){
        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı: " + mesaj.length());// metnin karakter uzunluğunu geri döndürür.
        System.out.println("5.eleman : " + mesaj.charAt(4)); // metnin içerisindeki 4.karakteri yazdırır.
        System.out.println(mesaj.concat(" istanbulda"));// mesajımızın sonuna içerisine girdiğimiz stringi ekler.
        System.out.println(mesaj.startsWith("B"));// mesajımızın/metnimizin hangi karakterle başladığını sorgular ve geri dönüş olarak boolean veri döner.
        System.out.println(mesaj.endsWith("l"));// mesajımızın/metnimizin hangi son karakterle başladığını sorgularız geri dönüş değeri boolean tipindedir.
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler, 0);// stringimizin başlangıç ve bitiş noktalarını belirttiğimiz aralıktaki karakterleri char array içine atar.
        for (char karakter: karakterler) {
            System.out.println(karakter);
        }
        System.out.println(mesaj.indexOf("e"));// mesajın/stringin içerisindeki index konumunu geri döndürür.
        System.out.println(mesaj.lastIndexOf("e"));// stringin içerisindeki index konumunu sağdan başlayarak arar ve index konumunu geri döndürür.


    }
}
