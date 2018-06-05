import edu.princeton.cs.introcs.StdDraw;
import java.awt.*;

public class Main {

        //static Game risk;


        private final static int X_MAX = 550;
        private final static int Y_MAX = 600;
        private final static float WIDTH = 1f;
        static Game Risk = new Game();

        public static void main(String[] args) throws InterruptedException {

            StdDraw.setCanvasSize(550, 600); // Taille de la fenÍtre
            StdDraw.setXscale(0, X_MAX + WIDTH);
            StdDraw.setYscale(0, Y_MAX + WIDTH);

            StdDraw.picture(550 / 2, 600 / 2, "RiskCover.jpg", 540, 590);

            // Premier menu (joueurs)
            int joueurs = Menu2.joueurs();

            // Tableau de joueurs
            StdDraw.clear();
            //Player[] players = new Player[joueurs];
            Thread.sleep(200);

            // DeuxiËme menu (couleurs)

            // On crÈe un tableau de couleurs, et on appelle la fonction couleur pour chaque joueur qui choisit sa couleur
            // Une fois la couleur choisie, le tableau supprime la couleur, ainsi deux couleurs ne peuvent être selectionnées plusieurs fois
            String[] couleurs = {"bleu", "rouge", "vert", "magenta", "cyan", "gris"};
            for (int i = 0; i < joueurs; i++) {
                // Affichage des couleurs restantes dans la console
                for (int j = 0; j < couleurs.length; j++) {
                    System.out.print(couleurs[j] + " ");
                }
                //players[i] = new Player("", i, Color.white);
                Player joueur = new Player("Bob"+i,i,Color.white);
                Main.Risk.playersList.add(joueur);
                String color = Menu2.couleur(couleurs);
                couleurs[java.util.Arrays.asList(couleurs).indexOf(color)] = null;
                Thread.sleep(200);
            }

            System.out.println(Risk.playersList.get(1).getName());

            Risk.territoriesInitialization();
            Main.Risk.setRandomTerritories(Main.Risk.playersNumber);

            // On lance la map
            StdDraw.clear();
            Map map = new Map(Risk.listRectangles);



            System.out.println("MAIN");
            Map.dessinerMap();
            map.dessinerCercles();
            System.out.println("POST MAIN");

            // Attribuer alÈatoirement les territoires aux joueurs
            //Risk.setRandomTerritories(players, joueurs); // A MODIFIER

            // Affecter les territoires (classe player arraylist)
        }
    }


