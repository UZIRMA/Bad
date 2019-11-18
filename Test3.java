import java.util.Scanner;

public class Test3 {

    public static void main(String[] args){

        Player[] players = new Player[9];
        players[0] = new Player(1, "Jésus", "Lakers", "2", "simple");
        players[1] = new Player(2, "Akbar", "Castors", "2", "simple");
        players[2] = new Player(3, "Dieu", "Bruge", "1", "simple");
        players[3] = new Player(4, "Zirma", "Castors", "2", "simple");
        players[4] = new Player(5, "Allah", "Bruge", "1", "simple");
        players[5] = new Player(6, "Rambo", "Castors", "1", "simple");
        players[6] = new Player(7, "Satan", "Lakers", "2", "simple");
        players[7] = new Player(8, "Bouda", "Castors", "1", "simple");
        players[8] = new Player(9, "Mustafar", "Bruge", "2", "simple");

        System.out.println("players length : " + players.length);

        int nbr_matchs_div_1 = getNbrMatchs(players, 1)/2;

        System.out.println(nbr_matchs_div_1);

        Match[] matchs_div_1 = new Match[nbr_matchs_div_1];

        for(Player joueur : players){
            System.out.println(joueur.nom); // bug si il n'y a pas le nombre d'elements qui est défini, ici 9

        }



        System.out.println("Ajoutez un joueur");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Nom du joueur:");
        String pnom = myObj.nextLine();  // Read user input

        System.out.println("Club du joueur:");
        String pclub = myObj.nextLine();  // Read user input

        System.out.println("division du joueur:");
        String pdivision = myObj.nextLine();  // Read user input

        System.out.println("simple ou double:");
        String pcategorie = myObj.nextLine();  // Read user input

        // players[9] = new Player(10, pnom, pclub, pdivision, pcategorie);

        // System.out.println(players[9].nom + ", " + players[9].club + ", " + players[9].division + ", " + players[9].categorie);

    }

    public static int getNbrMatchs(Player[] liste, int division){
        // compte le nombre de joueurs faisant partie d'une division
        int nombre = 0;
        for(Player joueur : liste){
            if(joueur.division == "1"){
                nombre += 1;
            }
        }
        return(nombre);
    }

}
