public class Main {
    public static void main(String[] args) {
        char harf='A';

        switch (harf) {
            case 'A':
            case 'O':
            case 'I':
            case 'U':
                System.out.println("kalin sesli harf");
                break;
            default:
                System.out.println("ince sesli harf");

        }
    }
}