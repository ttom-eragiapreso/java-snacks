public class Snack3 {
    public static void main(String[] args) {
        /*
        * Snack 3
        Crea un array di numeri interi e fai la somma
        * di tutti gli elementi che sono in posizione dispari*/

        int[] numbers = {10,13,5,6,8,57,2,234,6,33};
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }

        System.out.println("La somma di tutti i numeri pari è " + sum);

    }
}
