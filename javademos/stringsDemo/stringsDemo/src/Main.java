public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugun hava cok guzel.";
        System.out.println(mesaj);

        /*System.out.println("Element sayi :" + mesaj.length());
        System.out.println("5. element : " + mesaj.charAt(4));
        System.out.println(mesaj.concat("yasasin! "));
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0,5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));*/


        String yeniMesaj = mesaj.replace(' ' , '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,7));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}