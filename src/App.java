class App {
    public static void main(String[] args) {

        int[] a = { 1, 0, 5, -2, -5, 7 };

        int soma = 0;

        soma = a[0] + a[1] + a[5];
        System.out.println("Valor da soma: " + soma);
        System.out.println();

        a[3] = 100;

        System.out.println("Os valores do array são: ");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}