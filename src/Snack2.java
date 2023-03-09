public class Snack2 {
    public static void main(String[] args) {


        /*Snack 2
        Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
        e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.*/
        //Lista di nomi e cognomi
        String[] nomi = {"Mario", "Luigi", "Anna", "Luca", "Fabio"};
        String[] cognomi = {"Rossi", "Ferrari", "Russo", "Bianchi", "Romano"};
        //Limite per la generazione del numero random
        int min = 0;
        int max = 4;
        //Ad ogni ciclo prende un elemento a caso da ogni lista e li concatena.
        for (int i = 0; i < 5; i++) {
            String randomName = nomi[(int)Math.ceil(Math.random() * (max - min) + min)];
            String randomSurname = cognomi[(int)Math.ceil(Math.random() * (max - min) + min)];
            System.out.println(randomName + " " + randomSurname);
        }
    }

}
