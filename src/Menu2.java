import edu.princeton.cs.introcs.StdDraw;
import java.util.ArrayList;

import java.awt.*;

public class Menu2 {

    private final static int X_MAX = 550;
    private final static int Y_MAX = 600;
    private final static float WIDTH = 1f;
    //Game risk = Main.risk;


    public static int joueurs() {

        ;

        Font font = new Font("Baskerville Old Face", Font.BOLD, 30);
        StdDraw.setFont(font);
        StdDraw.setPenRadius(0.008);
        StdDraw.setPenColor(Color.white);

        StdDraw.rectangle(100, 280, 70, 20);
        StdDraw.text(100, 280, "1 vs IA");

        StdDraw.rectangle(100, 200, 70, 20);
        StdDraw.text(100, 200, "2 Joueurs");

        StdDraw.rectangle(100, 120, 70, 20);
        StdDraw.text(100, 120, "3 Joueurs");

        StdDraw.rectangle(450, 280, 70, 20);
        StdDraw.text(450, 280, "4 Joueurs");

        StdDraw.rectangle(450, 200, 70, 20);
        StdDraw.text(450, 200, "5 Joueurs");

        StdDraw.rectangle(450, 120, 70, 20);
        StdDraw.text(450, 120, "6 Joueurs");

        while (true) {
            double a = StdDraw.mouseX();
            double b = StdDraw.mouseY();

            // test bouton 1
            if (a > 29 && a < 171 && b > 259 && b < 301) {
                if (StdDraw.isMousePressed()) {
                    System.out.println("1 joueur");
                    Main.Risk.setPlayersNumber(1);
                    return Main.Risk.playersNumber;
                }
            }
            // test bouton 2
            if (a > 29 && a < 171 && b > 179 && b < 221) {
                if (StdDraw.isMousePressed()) {
                    System.out.println("2 joueurs");
                    Main.Risk.setPlayersNumber(2);
                    return Main.Risk.playersNumber;
                }
            }
            // test bouton 3
            if (a > 29 && a < 171 && b > 99 && b < 141) {
                if (StdDraw.isMousePressed()) {
                    System.out.println("3 joueurs");
                    Main.Risk.setPlayersNumber(3);
                    return Main.Risk.playersNumber;
                }
            }
            // test bouton 4
            if (a > 379 && a < 521 && b > 259 && b < 301) {
                if (StdDraw.isMousePressed()) {
                    System.out.println("4 joueurs");
                    Main.Risk.setPlayersNumber(4);
                    return Main.Risk.playersNumber;
                }
            }
            // test bouton 5
            if (a > 379 && a < 521 && b > 179 && b < 221) {
                if (StdDraw.isMousePressed()) {
                    System.out.println("5 joueurs");
                    Main.Risk.setPlayersNumber(5);
                    return Main.Risk.playersNumber;
                }
            }
            // test bouton 6
            if (a > 379 && a < 521 && b > 99 && b < 141) {
                if (StdDraw.isMousePressed()) {
                    System.out.println("6 joueurs");
                    Main.Risk.setPlayersNumber(6);
                    return Main.Risk.playersNumber;
                }
            }
        }
    }

    // Assigne une couleur à un joueur

    /*  RAJOUTER LE NOM DU JOUEUR SUR LA PAGE DANS LA FONCTION couleur */

    public static String couleur(String[] colorArray) {

        StdDraw.picture(550 / 2, 600 / 2, "RiskCover.jpg", 540, 590);

        Font font = new Font("Baskerville Old Face", Font.BOLD, 30);
        StdDraw.setFont(font);
        StdDraw.setPenRadius(0.008);

        StdDraw.setPenColor(Color.blue);
        StdDraw.filledRectangle(100, 280, 70, 20);

        StdDraw.setPenColor(Color.red);
        StdDraw.filledRectangle(100, 200, 70, 20);

        StdDraw.setPenColor(Color.green);
        StdDraw.filledRectangle(100, 120, 70, 20);

        StdDraw.setPenColor(Color.magenta);
        StdDraw.filledRectangle(450, 280, 70, 20);

        StdDraw.setPenColor(Color.cyan);
        StdDraw.filledRectangle(450, 200, 70, 20);

        StdDraw.setPenColor(Color.gray);
        StdDraw.filledRectangle(450, 120, 70, 20);

        while (true) {
            double a = StdDraw.mouseX();
            double b = StdDraw.mouseY();

            for (int i =0; i<Main.Risk.playersList.size();i++) {

            // bleu
            if (a > 29 && a < 171 && b > 259 && b < 301) {
                if (StdDraw.isMousePressed()) {
                    if(colorArray[0] != null) {
                        System.out.println("Couleur bleue choisie");
                        Main.Risk.playersList.get(i).setPlayerColor(Color.blue);
                        return "bleu";
                    }
                }
            }
            // rouge
            else if (a > 29 && a < 171 && b > 179 && b < 221) {
                if (StdDraw.isMousePressed()) {
                    if(colorArray[1] != null) {
                        System.out.println("Couleur rouge choisie");
                        Main.Risk.playersList.get(i).setPlayerColor(Color.red);
                        return "rouge";
                    }
                }
            }
            // vert
            else if (a > 29 && a < 171 && b > 99 && b < 141) {
                if (StdDraw.isMousePressed()) {
                    if (colorArray[2] != null) {
                        System.out.println("Couleur verte choisie");
                        Main.Risk.playersList.get(i).setPlayerColor(Color.green);
                        return "vert";
                    }
                }
            }
            // magenta
            else if (a > 379 && a < 521 && b > 259 && b < 301) {
                if (StdDraw.isMousePressed()) {
                    if (colorArray[3] != null) {
                        System.out.println("Couleur magenta choisie");
                        Main.Risk.playersList.get(i).setPlayerColor(Color.magenta);
                        return "magenta";
                    }
                }
            }
            // cyan
            else if (a > 379 && a < 521 && b > 179 && b < 221) {
                if (StdDraw.isMousePressed()) {
                    if (colorArray[4] != null) {
                        System.out.println("Couleur cyan choisie");
                        Main.Risk.playersList.get(i).setPlayerColor(Color.cyan);
                        return "cyan";
                    }
                }
            }
            // gris
            else if (a > 379 && a < 521 && b > 99 && b < 141) {
                if (StdDraw.isMousePressed()) {
                    if (colorArray[5] != null) {
                        System.out.println("Couleur gris choisie");
                        Main.Risk.playersList.get(i).setPlayerColor(Color.gray);
                        return "gris";
                    }
                }
            }
        }


    }

    /*public static void main(String[] args) throws InterruptedException {

        StdDraw.setCanvasSize(550, 600); // Taille de la fenÍtre
        StdDraw.setXscale(0, X_MAX + WIDTH);
        StdDraw.setYscale(0, Y_MAX + WIDTH);

        StdDraw.picture(550 / 2, 600 / 2, "RiskCover.jpg", 540, 590);

    }*/

}

}