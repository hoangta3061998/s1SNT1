public class PrimeNumber01 {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Tat ca so nguyen to nho hon 100 la : \n");
        for(int i = 2; i < 100; i++) {
            if (isPrimeNum(i)){
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isPrimeNum(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}