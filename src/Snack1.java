import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {

        /*Snack 1
        Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println(n % 2 == 0? n : n+1);

        sc.close();
    }
}