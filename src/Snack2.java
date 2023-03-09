import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {


        /*Snack 2
        Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
        e da queste vuole mostrare a video una falsa lista d'invitati con nome e cognome.*/
        //Lista di nomi e cognomi
        String[] nomi = {"Mario", "Luigi", "Anna", "Luca", "Fabio"};
        String[] cognomi = {"Rossi", "Ferrari", "Russo", "Bianchi", "Romano"};
        //Limite per la generazione del numero random
        int max = 4;


        Random rnd = new Random();

        //A ogni ciclo prende un elemento a caso da ogni lista e li concatena.
        for (int i = 0; i < 5; i++) {
            String randomName = nomi[rnd.nextInt(max)];
            String randomSurname = cognomi[rnd.nextInt(max)];
            System.out.println(randomName + " " + randomSurname);
        }
    }

}
