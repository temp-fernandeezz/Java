public class DecimalParaBinario {
    public static void dec2Bin(int n) {
        if (n > 0) {
            dec2Bin(n / 2);
            System.out.print(n % 2);
        }
    }
    public static void main(String[] args) {
        int decimal = 12;
        System.out.print("Representação binária de " + decimal + ": ");
        dec2Bin(decimal);
    }
}
