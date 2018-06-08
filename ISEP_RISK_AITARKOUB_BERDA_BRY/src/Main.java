import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

public class Main {


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
        Sound music1 = new Sound("MusicMenu.wav");//on définit un son
        music1.loop();//on joue le son en boucle (loop)

        int joueurs = Menu.joueurs();

        // Tableau de joueurs
        StdDraw.clear();

        Thread.sleep(200);

        // Deuxième menu (couleurs)

        // On crÈe un tableau de couleurs, et on appelle la fonction couleur pour chaque joueur qui choisit sa couleur
        String[] couleurs = {"bleu", "rouge", "vert", "magenta", "cyan", "gris"};
        for (int i = 0; i < joueurs; i++) {

            Player joueur = new Player("Bob" + i, i);
            Main.Risk.playersList.add(joueur);
            joueur.calculUnitNumberDeploy(true);
            Menu.affichage();
            Menu.couleur(joueur);
            Thread.sleep(200);
        }

        System.out.println("ESKE CA MARCHE WESH" + Risk.playersList.get(1).getName());


        Risk.territoriesInitialization();


        // On lance la map
        StdDraw.clear();
        Map map = new Map(Risk.listRectangles);

        Map.dessinerMap();
        map.drawInterfaceConversion();
        map.drawInterfaceMoveAttacks();
        map.dessinerCercles();

    }
}


