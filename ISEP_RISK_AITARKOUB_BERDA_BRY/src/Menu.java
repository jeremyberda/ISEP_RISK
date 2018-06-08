import edu.princeton.cs.introcs.StdDraw;

import java.util.ArrayList;

import java.awt.*;

public class Menu {

    private final static int X_MAX = 550;
    private final static int Y_MAX = 600;
    private final static float WIDTH = 1f;


    public static int joueurs() {


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

            //bouton 1 joueur
            if (a > 29 && a < 171 && b > 259 && b < 301) {
                if (StdDraw.isMousePressed()) {
                    System.out.println("1 joueur");
                    Main.Risk.setPlayersNumber(1);
                    return Main.Risk.playersNumber;
                }
            }
            //bouton 2 joueurs
            else if (a > 29 && a < 171 && b > 179 && b < 221) {
                if (StdDraw.isMousePressed()) {
                    System.out.println("2 joueurs");
                    Main.Risk.setPlayersNumber(2);
                    return Main.Risk.playersNumber;
                }
            }
            //bouton 3 joueurs
            else if (a > 29 && a < 171 && b > 99 && b < 141) {
                if (StdDraw.isMousePressed()) {
                    System.out.println("3 joueurs");
                    Main.Risk.setPlayersNumber(3);
                    return Main.Risk.playersNumber;
                }
            }
            //bouton 4 joueurs
            else if (a > 379 && a < 521 && b > 259 && b < 301) {
                if (StdDraw.isMousePressed()) {
                    System.out.println("4 joueurs");
                    Main.Risk.setPlayersNumber(4);
                    return Main.Risk.playersNumber;
                }
            }
            //bouton 5 joueurs
            else if (a > 379 && a < 521 && b > 179 && b < 221) {
                if (StdDraw.isMousePressed()) {
                    System.out.println("5 joueurs");
                    Main.Risk.setPlayersNumber(5);
                    return Main.Risk.playersNumber;
                }
            }
            //bouton 6 joueurs
            else if (a > 379 && a < 521 && b > 99 && b < 141) {
                if (StdDraw.isMousePressed()) {
                    System.out.println("6 joueurs");
                    Main.Risk.setPlayersNumber(6);
                    return Main.Risk.playersNumber;
                }
            }
        }
    }

    // Assigne une couleur à un joueur


    public static void affichage() {

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
    }

    public static void couleur(Player joueur) {

        Color[] colorArray = {Color.blue, Color.red, Color.green, Color.magenta, Color.cyan, Color.lightGray};
        Color color = null;

        while (color == null) {
            double a = StdDraw.mouseX();
            double b = StdDraw.mouseY();

            // bleu
            if (a > 29 && a < 171 && b > 259 && b < 301) {
                if (StdDraw.isMousePressed()) {
                    if (colorArray[0] != null) {
                        System.out.println("Couleur bleue choisie");
                        color = colorArray[0];
                    }
                }
            }
            // rouge
            else if (a > 29 && a < 171 && b > 179 && b < 221) {
                if (StdDraw.isMousePressed()) {
                    if (colorArray[1] != null) {
                        System.out.println("Couleur rouge choisie");
                        color = colorArray[1];
                    }
                }
            }
            // vert
            else if (a > 29 && a < 171 && b > 99 && b < 141) {
                if (StdDraw.isMousePressed()) {
                    if (colorArray[2] != null) {
                        System.out.println("Couleur verte choisie");
                        color = colorArray[2];
                    }
                }
            }
            // magenta
            else if (a > 379 && a < 521 && b > 259 && b < 301) {
                if (StdDraw.isMousePressed()) {
                    if (colorArray[3] != null) {
                        System.out.println("Couleur magenta choisie");
                        color = colorArray[3];
                    }
                }
            }
            // cyan
            else if (a > 379 && a < 521 && b > 179 && b < 221) {
                if (StdDraw.isMousePressed()) {
                    if (colorArray[4] != null) {
                        System.out.println("Couleur cyan choisie");
                        color = colorArray[4];
                    }
                }
            }
            // gris
            else if (a > 379 && a < 521 && b > 99 && b < 141) {
                if (StdDraw.isMousePressed()) {
                    if (colorArray[5] != null) {
                        System.out.println("Couleur gris choisie");
                        color = colorArray[5];
                    }
                }
            }
        }

        joueur.setPlayerColor(color);


    }
}
