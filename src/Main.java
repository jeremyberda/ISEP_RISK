import edu.princeton.cs.introcs.StdDraw;
import java.awt.*;

public class Main {

        //static Game risk;


        private final static int X_MAX = 550;
        private final static int Y_MAX = 600;
        private final static float WIDTH = 1f;
        static Game Risk = new Game();

        public static void main(String[] args) throws InterruptedException {

            StdDraw.setCanvasSize(550, 600); // Taille de la fenêtre
            StdDraw.setXscale(0, X_MAX + WIDTH);
            StdDraw.setYscale(0, Y_MAX + WIDTH);

            StdDraw.picture(550 / 2, 600 / 2, "RiskCover.jpg", 540, 590);

            // Premier menu (joueurs)
            Sound music1 = new Sound("MusicMenu.wav");
            music1.loop();

            int joueurs = Menu.joueurs();
            //System.out.println("NB DE JOUEURS PUTE :" + joueurs);

            // Tableau de joueurs
            StdDraw.clear();
            //Player[] players = new Player[joueurs];
            Thread.sleep(200);

            // DeuxiËme menu (couleurs)

            // On crÈe un tableau de couleurs, et on appelle la fonction couleur pour chaque joueur qui choisit sa couleur
            // Une fois la couleur choisie, le tableau supprime la couleur, ainsi deux couleurs ne peuvent être selectionnées plusieurs fois

            String[] couleurs = {"bleu", "rouge", "vert", "magenta", "cyan", "gris"};
            for (int i = 0; i < joueurs; i++) {

                Player joueur = new Player("Bob"+i,i);
                Main.Risk.playersList.add(joueur);
                joueur.calculUnitNumberDeploy(true);
                Menu.affichage();
                Menu.couleur(joueur);
                Thread.sleep(200);
            }



            // On lance la map
            StdDraw.clear();

            Map map = new Map(Risk.listRectangles);




            Map.dessinerMap();
            Risk.territoriesInitialization();
            map.dessinerCercles();


            // Attribuer alÈatoirement les territoires aux joueurs
            //Risk.setRandomTerritories(players, joueurs); // A MODIFIER

            // Affecter les territoires (classe player arraylist)
        }
    }


