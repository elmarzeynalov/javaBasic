public class Main {
    public static void main(String[] args) {
        int [] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 5;


        for(int i : sayilar ) {
            if (i==aranacak){
                System.out.println("aradigimiz sayi bulundu");
                return;
            }else{
                System.out.println("yok");
            }
        }

    }
}