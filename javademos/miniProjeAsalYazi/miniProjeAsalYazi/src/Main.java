public class Main {
    public static void main(String[] args) {
        int number = 1;
        int remainder = number % 2;

        if (number == 1) {
            System.out.println("sayi asal degildir");
        }

        if (number < 1) {
            System.out.println("rakami degistirin");
        }

        for (int i=2; i<number; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}