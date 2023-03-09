public class Snack4 {
    public static void main(String[] args) {
        /*
        * Snack 4 (Bonus)
    Crea due array che hanno un numero di elementi diversi.
    * Mostra a video dei nuovi elementi random finchè il numero di elementi presenti
    * nell’array che ne ha di meno + quelli mostrati a video non è uguale al numero di elementi
    * presenti nell’array che ne ha di più*/

        int[] numeri1 = new int[5];
        int[] numeri2 = new int[10];
        int min = 1;
        int max = 15;
        for (int i = 0; i < numeri2.length - numeri1.length; i++) {
            System.out.println((int)Math.ceil(Math.random() * (max - min) + min));
        }
    }
}
