import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.util.ArrayList;

public class Map {

    public final static int X_MAX = 1200;
    public final static int Y_MAX = 620;
    public final static float WIDTH = 1f;

    int selectedTerritoryID;

    private ArrayList<Rectangle> rectangles;

    public Map(ArrayList<Rectangle> rectangles) {
        this.rectangles = rectangles;
    }

    public static void dessinerMap() {
        StdDraw.setCanvasSize(1200, 620); // Taille fenetre
        StdDraw.setXscale(0, X_MAX + WIDTH);
        StdDraw.setYscale(0, Y_MAX + WIDTH);

        StdDraw.picture(1200 / 2, 620 / 2, "WorldMapID.jpg", 1180, 600); //Taille de l'image à l'intÈrieur de la fenetre
        StdDraw.setPenRadius(0.005); //Epaisseur des cercles
        Font fontRegionsNames = new Font("Baskerville Old Face", Font.BOLD, 23);//Police pour les noms de régions

        StdDraw.setFont(fontRegionsNames);//On définit la police comme Ètant xxx


    }

    public void dessinerCercles() throws InterruptedException {


        for (int i = 0; i < this.rectangles.size(); i++) {
            System.out.println("ICI");
            this.rectangles.get(i).DrawRectangle();
        }


        Font fontRegionsNames = new Font("Baskerville Old Face", Font.BOLD, 23);//Police pour les noms de rÈgions
        StdDraw.setPenColor(Color.black);

        // AMERIQUE DU NORD

        StdDraw.text(130, 575, "Amérique du Nord");

        // AMERIQUE DU SUD

        StdDraw.text(340, 72, "Amérique");
        StdDraw.text(340, 50, "du Sud");

        // AFRIQUE

        StdDraw.text(470, 130, "Afrique");

        // EUROPE

        StdDraw.text(540, 560, "Europe");

        // ASIE

        StdDraw.text(955, 335, "Asie");

        // AUSTRALIE

        StdDraw.text(825, 110, "Australie");


        //BOUTONS

        while (true) {


            double a = StdDraw.mouseX();
            double b = StdDraw.mouseY();

            //Chaque bouton correspond à un territoire, lorsqu'on clique sur un des rectangle, cela affiche dans l'interface d'attaques/déplacement le nom du territoire cliqué

            //AmÈrique du Nord

            if (a > 32 && a < 98 && b > 497 && b < 533) {//Alaska
                if (StdDraw.isMousePressed()) {

                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(0).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 0;
                    showUnitsNumber();
                }
            }

            if (a > 137 && a < 203 && b > 492 && b < 558) {//Territoires du Nord-Ouest
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(1).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(1).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 1;
                }
            }

            if (a > 332 && a < 398 && b > 537 && b < 573) {//Groenland
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(2).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(2).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 2;
                }
            }

            if (a > 267 && a < 333 && b > 444 && b < 480) {//QuÈbec
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(3).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(3).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 3;
                }
            }

            if (a > 192 && a < 258 && b > 444 && b < 480) {//Ontario
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(4).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(4).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 4;
                }
            }

            if (a > 120 && a < 186 && b > 452 && b < 488) {//Alberta
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(5).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(5).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 5;
                }
            }

            if (a > 127 && a < 193 && b > 392 && b < 428) {//Etats-Unis de l'Ouest
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(6).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(6).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 6;
                }
            }


            if (a > 207 && a < 273 && b > 364 && b < 398) {//Etats-Unis de l'Est
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(7).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(7).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 7;
                }
            }

            if (a > 142 && a < 208 && b > 302 && b < 338) {//AmÈrique Centrale
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(8).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(8).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 8;
                }
            }

            //AmÈrique du Sud

            if (a > 222 && a < 288 && b > 252 && b < 288) {//Venezuela
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(9).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(9).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 9;
                }
            }

            if (a > 217 && a < 283 && b > 172 && b < 208) {//PÈrou
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(10).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(10).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 10;
                }
            }

            if (a > 237 && a < 303 && b > 97 && b < 133) {//Argentine
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(11).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(11).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 11;
                }
            }

            if (a > 297 && a < 363 && b > 192 && b < 228) {//BrÈsil
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(12).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(12).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 12;
                }
            }


            //Afrique

            if (a > 447 && a < 513 && b > 212 && b < 248) {//Afrique du Nord
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(13).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(13).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 13;
                }
            }

            if (a > 529 && a < 595 && b > 134 && b < 170) {//Congo
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(14).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(14).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 14;
                }
            }

            if (a > 537 && a < 603 && b > 67 && b < 103) {//Afrique du Sud
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(15).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(15).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 15;
                }
            }

            if (a > 637 && a < 703 && b > 47 && b < 83) {//Madagascar
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(16).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(16).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 16;
                }
            }

            if (a > 597 && a < 663 && b > 172 && b < 208) {//Afrique de l'Est
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(17).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(17).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 17;
                }
            }

            if (a > 552 && a < 618 && b > 240 && b < 276) {//Egypte
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(18).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(18).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 18;
                }
            }


            //Europe


            if (a > 499 && a < 565 && b > 342 && b < 378) {//Europe du Sud
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(19).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(19).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 19;
                }
            }

            if (a > 497 && a < 563 && b > 389 && b < 425) {//Europe du Nord
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(20).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(20).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 20;
                }
            }

            if (a > 412 && a < 478 && b > 307 && b < 343) {//Europe de l'Ouest
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(21).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(21).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 21;
                }
            }

            if (a > 384 && a < 450 && b > 396 && b < 432) {//Grande-Bretagne
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(22).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(22).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 22;
                }
            }

            if (a > 427 && a < 493 && b > 482 && b < 518) {//Islande
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(23).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(23).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 23;
                }
            }

            if (a > 502 && a < 568 && b > 477 && b < 513) {//Scandinavie
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(24).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(24).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 24;
                }
            }

            if (a > 597 && a < 663 && b > 432 && b < 478) {//Ukraine
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(25).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(25).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 25;
                }
            }


            //Asie
            if (a > 707 && a < 773 && b > 452 && b < 488) {//Oural
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(26).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(26).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 26;
                }
            }

            if (a > 747 && a < 813 && b > 502 && b < 538) {//SibÈrie
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(27).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(27).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 27;
                }
            }

            if (a > 837 && a < 903 && b > 527 && b < 563) {//Yakoutie
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(28).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(28).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 28;
                }
            }

            if (a > 822 && a < 888 && b > 442 && b < 478) {//Tchita
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(29).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(29).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 29;
                }
            }

            if (a > 927 && a < 993 && b > 517 && b < 553) {//Kamchatka
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(30).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(30).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 30;
                }
            }

            if (a > 937 && a < 1003 && b > 367 && b < 403) {//Japon
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(31).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(31).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 31;
                }
            }

            if (a > 827 && a < 893 && b > 387 && b < 423) {//Mongolie
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(32).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(32).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 32;
                }
            }

            if (a > 800 && a < 866 && b > 322 && b < 358) {//Chine
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(33).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(33).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 33;
                }
            }

            if (a > 687 && a < 753 && b > 372 && b < 408) {//Afghanistan
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(34).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(34).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 34;
                }
            }

            if (a > 627 && a < 693 && b > 292 && b < 328) {//Moyen-Orient
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(35).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(35).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 35;
                }
            }

            if (a > 747 && a < 813 && b > 282 && b < 318) {//Inde
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(36).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(36).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 36;
                }
            }

            if (a > 827 && a < 893 && b > 242 && b < 278) {//Siam
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(37).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(37).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 37;
                }
            }

            //Australie


            if (a > 837 && a < 903 && b > 149 && b < 185) {//IndonÈsie
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(38).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(38).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 38;
                }
            }


            if (a > 877 && a < 943 && b > 52 && b < 88) {//Australie de l'Ouest
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(39).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(39).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 39;
                }
            }

            if (a > 977 && a < 1043 && b > 82 && b < 118) {//Australie de l'Est
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(40).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(40).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 40;
                }
            }

            if (a > 937 && a < 1003 && b > 172 && b < 208) {//Nouvelle-GuinÈe
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    System.out.println(Main.Risk.listRectangles.get(0).getTerritory().getNameTerritory());
                    resetSelectedTerritory();
                    StdDraw.text(1095, 470, "" + Main.Risk.listRectangles.get(41).getTerritory().getNameTerritory());
                    StdDraw.text(1095, 430, "Joueur  " + Main.Risk.listRectangles.get(41).getTerritory().getOwner().getIdPlayer());
                    selectedTerritoryID = 41;
                }
            }

            //BOUTONS INTERFACE

            if (a > 1009 && a < 1094 && b > 335.5 && b < 359.5) {//Bouton SÈlectionner Territoire 1
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    resetTerritory1();
                    StdDraw.text(1052.5, 370, "" + selectedTerritoryID);
                }
            }

            if (a > 1096 && a < 1181 && b > 335.5 && b < 359.5) {//Bouton SÈlectionner Territoire 2
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    resetTerritory2();
                    StdDraw.text(1137.5, 370, "" + selectedTerritoryID);

                }
            }

            if (a > 1114 && a < 1136 && b > 304 && b < 326) {//Bouton + Soldat
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    drawInterfaceMoveAttacks();
                }
            }

            if (a > 1149 && a < 1171 && b > 304 && b < 326) {//Bouton - Soldat
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                    drawInterfaceMoveAttacks();
                }
            }

            if (a > 1114 && a < 1136 && b > 274 && b < 296) {//Bouton + Cavalier
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 1149 && a < 1171 && b > 274 && b < 296) {//Bouton - Cavalier
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 1114 && a < 1136 && b > 244 && b < 266) {//Bouton + Canon
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 1149 && a < 1171 && b > 244 && b < 266) {//Bouton - Canon
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 1009 && a < 1181 && b > 204 && b < 236) {//Bouton Confirmer
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 1009 && a < 1181 && b > 165 && b < 205) {//Bouton Phase suivante
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }


            //BOUTONS INTERFACE CONVERSION RENFORTS

            if (a > 19 && a < 36 && b > 49 && b < 66) {//Bouton + 1 Soldat
                if (StdDraw.isMousePressed()) {
                    if (Main.Risk.playersList.get(0).getTroopNumberDeploy() >= 1) {

                        Thread.sleep(300);
                        Main.Risk.playersList.get(0).setSoldiersNumberDeploy(Main.Risk.playersList.get(0).getSoldiersNumberDeploy() + 1);
                        Main.Risk.playersList.get(0).setTroopNumberDeploy(Main.Risk.playersList.get(0).getTroopNumberDeploy() - 1);
                        drawInterfaceConversion();
                        System.out.println("ok");
                    }

                }
            }


            if (a > 64 && a < 81 && b > 49 && b < 66) {//Bouton - 1 Soldat
                if (StdDraw.isMousePressed()) {
                    if (Main.Risk.playersList.get(0).getTroopNumberDeploy() > -1 && Main.Risk.playersList.get(0).getSoldiersNumberDeploy() >= 1) {

                        Thread.sleep(300);
                        Main.Risk.playersList.get(0).setSoldiersNumberDeploy(Main.Risk.playersList.get(0).getSoldiersNumberDeploy() - 1);
                        Main.Risk.playersList.get(0).setTroopNumberDeploy(Main.Risk.playersList.get(0).getTroopNumberDeploy() + 1);
                        drawInterfaceConversion();
                        System.out.println("ok");
                    }
                }
            }

            if (a > 89 && a < 106 && b > 49 && b < 66) {//Bouton + 1 Cavalier
                if (StdDraw.isMousePressed()) {
                    if (Main.Risk.playersList.get(0).getTroopNumberDeploy() >= 3) {

                        Thread.sleep(300);
                        Main.Risk.playersList.get(0).setRidersNumberDeploy(Main.Risk.playersList.get(0).getRidersNumberDeploy() + 1);
                        Main.Risk.playersList.get(0).setTroopNumberDeploy(Main.Risk.playersList.get(0).getTroopNumberDeploy() - 3);
                        drawInterfaceConversion();
                        System.out.println("ok");
                    }
                }
            }

            if (a > 134 && a < 151 && b > 49 && b < 66) {//Bouton - 1 Cavalier
                if (StdDraw.isMousePressed()) {
                    if (Main.Risk.playersList.get(0).getTroopNumberDeploy() > -1 && Main.Risk.playersList.get(0).getRidersNumberDeploy() >= 1) {

                        Thread.sleep(300);
                        Main.Risk.playersList.get(0).setRidersNumberDeploy(Main.Risk.playersList.get(0).getRidersNumberDeploy() - 1);
                        Main.Risk.playersList.get(0).setTroopNumberDeploy(Main.Risk.playersList.get(0).getTroopNumberDeploy() + 3);
                        drawInterfaceConversion();
                        System.out.println("ok");
                    }
                }
            }

            if (a > 159 && a < 176 && b > 49 && b < 66) {//Bouton + 1 Canon
                if (StdDraw.isMousePressed()) {
                    if (Main.Risk.playersList.get(0).getTroopNumberDeploy() >= 7) {

                        Thread.sleep(300);
                        Main.Risk.playersList.get(0).setCannonsNumberDeploy(Main.Risk.playersList.get(0).getCannonsNumberDeploy() + 1);
                        Main.Risk.playersList.get(0).setTroopNumberDeploy(Main.Risk.playersList.get(0).getTroopNumberDeploy() - 7);
                        drawInterfaceConversion();
                        System.out.println("ok");
                    }
                }
            }

            if (a > 204 && a < 221 && b > 49 && b < 66) {//Bouton - 1 Canon
                if (StdDraw.isMousePressed()) {
                    if (Main.Risk.playersList.get(0).getTroopNumberDeploy() > -1 && Main.Risk.playersList.get(0).getCannonsNumberDeploy() >= 1) {

                        Thread.sleep(300);
                        Main.Risk.playersList.get(0).setCannonsNumberDeploy(Main.Risk.playersList.get(0).getCannonsNumberDeploy() - 1);
                        Main.Risk.playersList.get(0).setTroopNumberDeploy(Main.Risk.playersList.get(0).getTroopNumberDeploy() + 7);
                        drawInterfaceConversion();
                        System.out.println("ok");
                    }
                }
            }

            if (a > 14 && a < 226 && b > 14 && b < 46) {//Bouton Confirmer (affiche interface de placement ssi solde == 0
                if (StdDraw.isMousePressed()) {
                    if (Main.Risk.playersList.get(0).getTroopNumberDeploy() == 0) {
                        drawInterfacePlacement();
                    }

                }
            }

            StdDraw.text(50, 80, "" + Main.Risk.playersList.get(0).getSoldiersNumberDeploy());
            StdDraw.text(120, 80, "" + Main.Risk.playersList.get(0).getRidersNumberDeploy());
            StdDraw.text(190, 80, "" + Main.Risk.playersList.get(0).getCannonsNumberDeploy());

            /*//BOUTONS INTERFACE PLACER RENFORTS NON TRACES POUR LE MOMENT

            if (a > 19 && a < 36 && b > 49 && b < 66){//Bouton + Soldat
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 64 && a < 81 && b > 49 && b < 66){//Bouton - Soldat
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 89 && a < 106 && b > 49 && b < 66){//Bouton + Cavalier
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 134 && a < 151 && b > 49 && b < 66){//Bouton - Cavalier
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 159 && a < 176 && b > 49 && b < 66){//Bouton + Canon
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 204 && a < 221 && b > 49 && b < 66){//Bouton - Canon
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 14 && a < 226 && b > 14 && b < 46){//Bouton Placer
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            */

            /*StdDraw.setFont(fontVictoire);
            StdDraw.text(600,310,"Victoire Joueur X");*/
        }
    }

    public void drawInterfaceConversion() {//Dessine l'interface de conversion d'unités

        Font fontInterface = new Font("Baskerville Old Face", Font.BOLD, 16);//Police pour l'interface de jeu
        Font fontSigns = new Font("Arial", Font.BOLD, 19);
        Font fontTerritories = new Font("Baskerville Old Face", Font.BOLD, 12);
        Font fontConfirmer = new Font("Baskerville Old Face", Font.BOLD, 20);
        Font fontVictoire = new Font("Baskerville Old Face", Font.BOLD, 90);

        StdDraw.setPenColor(Color.white);
        StdDraw.filledRectangle(120, 90, 105, 75);//Gros rectangle en bas à gauche
        StdDraw.setPenColor(Color.black);
        StdDraw.rectangle(120, 140, 105, 25);
        StdDraw.setFont(fontConfirmer);
        StdDraw.text(120, 150, "Joueur " + Main.Risk.getPlayersList().get(0).getIdPlayer());
        StdDraw.text(120, 130, "Solde : " + Main.Risk.playersList.get(0).getTroopNumberDeploy());

        StdDraw.setFont(fontInterface);
        StdDraw.text(50, 103, "Soldat");
        StdDraw.text(120, 103, "Cavalier");
        StdDraw.text(190, 103, "Canon");

        StdDraw.rectangle(50, 80, 35, 35);//Partie Soldat
        StdDraw.setFont(fontSigns);
        StdDraw.square(27.5, 57.5, 7.5);
        StdDraw.text(26.5, 54, "+");
        StdDraw.square(72.5, 57.5, 7.5);
        StdDraw.text(72.5, 56.5, "-");

        StdDraw.rectangle(120, 80, 35, 35);//Partie Cavalier
        StdDraw.setFont(fontSigns);
        StdDraw.square(97.5, 57.5, 7.5);
        StdDraw.text(96.5, 54, "+");
        StdDraw.square(142.5, 57.5, 7.5);
        StdDraw.text(142.5, 56.5, "-");

        StdDraw.rectangle(190, 80, 35, 35);//Partie Canon
        StdDraw.setFont(fontSigns);
        StdDraw.square(167.5, 57.5, 7.5);
        StdDraw.text(166.5, 54, "+");
        StdDraw.square(212.5, 57.5, 7.5);
        StdDraw.text(212.5, 56.5, "-");

        StdDraw.rectangle(120, 30, 105, 15);
        StdDraw.setFont(fontConfirmer);
        StdDraw.text(120, 30, "Convertir");

    }

    public void drawInterfacePlacement() {//Dessine l'interface de placement d'unités NON FONCTIONNELLE POUR LE MOMENT

        Font fontInterface = new Font("Baskerville Old Face", Font.BOLD, 16);//Police pour l'interface de jeu
        Font fontSigns = new Font("Arial", Font.BOLD, 19);
        Font fontTerritories = new Font("Baskerville Old Face", Font.BOLD, 12);
        Font fontConfirmer = new Font("Baskerville Old Face", Font.BOLD, 20);
        Font fontVictoire = new Font("Baskerville Old Face", Font.BOLD, 90);

        StdDraw.setPenColor(Color.white);
        StdDraw.filledRectangle(120, 90, 105, 75);//Gros rectangle en bas à gauche
        StdDraw.setPenColor(Color.black);

        StdDraw.rectangle(120, 140, 105, 25);
        StdDraw.setFont(fontConfirmer);
        StdDraw.text(120, 150, "Territoire X");
        StdDraw.setFont(fontInterface);
        StdDraw.text(120, 130, "So : X / Cv : X / Ca : X");

        StdDraw.setFont(fontInterface);
        StdDraw.text(50, 103, "Soldat");
        StdDraw.text(120, 103, "Cavalier");
        StdDraw.text(190, 103, "Canon");

        StdDraw.rectangle(50, 80, 35, 35);//Partie Soldat
        StdDraw.setFont(fontSigns);
        StdDraw.square(27.5, 57.5, 7.5);
        StdDraw.text(26.5, 54, "+");
        StdDraw.square(72.5, 57.5, 7.5);
        StdDraw.text(72.5, 56.5, "-");

        StdDraw.rectangle(120, 80, 35, 35);//Partie Cavalier
        StdDraw.setFont(fontSigns);
        StdDraw.square(97.5, 57.5, 7.5);
        StdDraw.text(96.5, 54, "+");
        StdDraw.square(142.5, 57.5, 7.5);
        StdDraw.text(142.5, 56.5, "-");

        StdDraw.rectangle(190, 80, 35, 35);//Partie Canon
        StdDraw.setFont(fontSigns);
        StdDraw.square(167.5, 57.5, 7.5);
        StdDraw.text(166.5, 54, "+");
        StdDraw.square(212.5, 57.5, 7.5);
        StdDraw.text(212.5, 56.5, "-");

        StdDraw.rectangle(120, 30, 105, 15);
        StdDraw.setFont(fontConfirmer);
        StdDraw.text(120, 30, "Placer");


    }

    public void drawInterfaceMoveAttacks() { //Dessine l'interface de mouvements/attaques

        Font fontInterface = new Font("Baskerville Old Face", Font.BOLD, 16);//Police pour l'interface de jeu
        Font fontSigns = new Font("Arial", Font.BOLD, 19);
        Font fontTerritories = new Font("Baskerville Old Face", Font.BOLD, 12);
        Font fontConfirmer = new Font("Baskerville Old Face", Font.BOLD, 20);


        StdDraw.setFont(fontTerritories);

        StdDraw.setPenColor(Color.white);
        StdDraw.filledRectangle(1095, 330, 85, 165);//gros rectangle
        StdDraw.setPenColor(Color.black);
        StdDraw.rectangle(1095, 330, 85, 165);


        StdDraw.rectangle(1052.5, 397.5, 42.5, 12);
        StdDraw.text(1052.5, 397.5, "Territoire 1");
        StdDraw.rectangle(1137.5, 397.5, 42.5, 12);
        StdDraw.text(1137.5, 397.5, "Territoire 2");
        StdDraw.rectangle(1052.5, 372.5, 42.5, 12);
        StdDraw.rectangle(1137.5, 372.5, 42.5, 12);
        StdDraw.rectangle(1052.5, 347.5, 42.5, 12);
        StdDraw.text(1052.5, 347.5, "Sélectionner");
        StdDraw.rectangle(1137.5, 347.5, 42.5, 12);
        StdDraw.text(1137.5, 347.5, "Sélectionner");
        StdDraw.rectangle(1095, 220, 85, 15);
        StdDraw.setFont(fontConfirmer);
        StdDraw.text(1095, 220, "Confirmer");
        StdDraw.text(1095, 185, "Phase suivante");


        //UNITES

        //Soldats
        StdDraw.setFont(fontInterface);
        StdDraw.text(1045, 315, "Soldats");
        StdDraw.setFont(fontSigns);
        StdDraw.text(1125, 311, "+");
        StdDraw.square(1125, 315, 10);
        StdDraw.text(1160, 313, "-");
        StdDraw.square(1160, 315, 10);

        //Cavaliers
        StdDraw.setFont(fontInterface);
        StdDraw.text(1048, 285, "Cavaliers");
        StdDraw.setFont(fontSigns);
        StdDraw.text(1125, 281, "+");
        StdDraw.square(1125, 285, 10);
        StdDraw.text(1160, 283, "-");
        StdDraw.square(1160, 285, 10);

        //Canons
        StdDraw.setFont(fontInterface);
        StdDraw.text(1045, 255, "Canons");
        StdDraw.setFont(fontSigns);
        StdDraw.text(1125, 251, "+");
        StdDraw.square(1125, 255, 10);
        StdDraw.text(1160, 253, "-");
        StdDraw.square(1160, 255, 10);

    }

    public void resetSelectedTerritory() {//clear le nom du territoire affiché dans l'interface de mouvements/attaques
        StdDraw.setPenColor(Color.white);
        StdDraw.filledRectangle(1095, 452.25, 85, 42.75);
        StdDraw.setPenColor(Color.black);
        StdDraw.rectangle(1095, 452.25, 85, 42.75);
    }


    public void resetTerritory1() {//clear le nom du premier territoire
        StdDraw.setPenColor(Color.white);
        StdDraw.filledRectangle(1052.5, 372.5, 42.5, 12);
        StdDraw.setPenColor(Color.black);
        StdDraw.rectangle(1052.5, 372.5, 42.5, 12);
    }

    public void resetTerritory2() {//clear le nom du second territoire
        StdDraw.setPenColor(Color.white);
        StdDraw.filledRectangle(1137.5, 372.5, 42.5, 12);
        StdDraw.setPenColor(Color.black);
        StdDraw.rectangle(1137.5, 372.5, 42.5, 12);

    }

    public void showUnitsNumber() { //Affiche le nombre d'unités sur chaque territoire, appelée uniquement via le bouton Alaska pour l'instant

        Font fontTerritories = new Font("Arial", Font.BOLD, 8);
        StdDraw.setPenColor(Color.white);

        //Amérique du Nord

        StdDraw.text(65, 515, Main.Risk.listRectangles.get(0).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(0).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(0).getTerritory().getCannonsNumber());
        StdDraw.text(170, 525, Main.Risk.listRectangles.get(1).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(1).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(1).getTerritory().getCannonsNumber());
        StdDraw.text(365, 555, Main.Risk.listRectangles.get(2).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(2).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(2).getTerritory().getCannonsNumber());
        StdDraw.text(300, 462, Main.Risk.listRectangles.get(3).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(3).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(3).getTerritory().getCannonsNumber());
        StdDraw.text(225, 462, Main.Risk.listRectangles.get(4).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(4).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(4).getTerritory().getCannonsNumber());
        StdDraw.text(153, 470, Main.Risk.listRectangles.get(5).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(5).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(5).getTerritory().getCannonsNumber());
        StdDraw.text(160, 410, Main.Risk.listRectangles.get(6).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(6).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(6).getTerritory().getCannonsNumber());
        StdDraw.text(240, 382, Main.Risk.listRectangles.get(7).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(7).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(7).getTerritory().getCannonsNumber());
        StdDraw.text(175, 320, Main.Risk.listRectangles.get(8).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(8).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(8).getTerritory().getCannonsNumber());

        //Amérique du Sud

        StdDraw.text(255, 270, Main.Risk.listRectangles.get(9).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(9).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(9).getTerritory().getCannonsNumber());
        StdDraw.text(250, 190, Main.Risk.listRectangles.get(10).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(10).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(10).getTerritory().getCannonsNumber());
        StdDraw.text(270, 115, Main.Risk.listRectangles.get(11).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(11).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(11).getTerritory().getCannonsNumber());
        StdDraw.text(330, 210, Main.Risk.listRectangles.get(12).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(12).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(12).getTerritory().getCannonsNumber());

        //Afrique

        StdDraw.text(480, 230, Main.Risk.listRectangles.get(13).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(13).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(13).getTerritory().getCannonsNumber());
        StdDraw.text(562, 152, Main.Risk.listRectangles.get(14).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(14).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(14).getTerritory().getCannonsNumber());
        StdDraw.text(570, 85, Main.Risk.listRectangles.get(15).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(15).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(15).getTerritory().getCannonsNumber());
        StdDraw.text(670, 65, Main.Risk.listRectangles.get(16).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(16).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(16).getTerritory().getCannonsNumber());
        StdDraw.text(630, 190, Main.Risk.listRectangles.get(17).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(17).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(17).getTerritory().getCannonsNumber());
        StdDraw.text(585, 258, Main.Risk.listRectangles.get(18).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(18).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(18).getTerritory().getCannonsNumber());


        //Europe

        StdDraw.text(532, 360, Main.Risk.listRectangles.get(19).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(19).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(19).getTerritory().getCannonsNumber());
        StdDraw.text(530, 407, Main.Risk.listRectangles.get(20).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(20).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(20).getTerritory().getCannonsNumber());
        StdDraw.text(445, 325, Main.Risk.listRectangles.get(21).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(21).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(21).getTerritory().getCannonsNumber());
        StdDraw.text(417, 414, Main.Risk.listRectangles.get(22).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(22).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(22).getTerritory().getCannonsNumber());
        StdDraw.text(460, 500, Main.Risk.listRectangles.get(23).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(23).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(23).getTerritory().getCannonsNumber());
        StdDraw.text(535, 495, Main.Risk.listRectangles.get(24).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(24).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(24).getTerritory().getCannonsNumber());
        StdDraw.text(630, 460, Main.Risk.listRectangles.get(25).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(25).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(25).getTerritory().getCannonsNumber());

        //Asie

        StdDraw.text(740, 470, Main.Risk.listRectangles.get(26).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(26).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(26).getTerritory().getCannonsNumber());
        StdDraw.text(780, 520, Main.Risk.listRectangles.get(27).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(27).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(27).getTerritory().getCannonsNumber());
        StdDraw.text(870, 545, Main.Risk.listRectangles.get(28).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(28).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(28).getTerritory().getCannonsNumber());
        StdDraw.text(855, 460, Main.Risk.listRectangles.get(29).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(29).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(29).getTerritory().getCannonsNumber());
        StdDraw.text(960, 535, Main.Risk.listRectangles.get(30).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(30).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(30).getTerritory().getCannonsNumber());
        StdDraw.text(970, 385, Main.Risk.listRectangles.get(31).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(31).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(31).getTerritory().getCannonsNumber());
        StdDraw.text(860, 405, Main.Risk.listRectangles.get(32).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(32).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(32).getTerritory().getCannonsNumber());
        StdDraw.text(833, 340, Main.Risk.listRectangles.get(33).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(33).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(33).getTerritory().getCannonsNumber());
        StdDraw.text(720, 390, Main.Risk.listRectangles.get(34).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(34).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(34).getTerritory().getCannonsNumber());
        StdDraw.text(660, 310, Main.Risk.listRectangles.get(35).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(35).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(35).getTerritory().getCannonsNumber());
        StdDraw.text(780, 300, Main.Risk.listRectangles.get(36).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(36).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(36).getTerritory().getCannonsNumber());
        StdDraw.text(860, 260, Main.Risk.listRectangles.get(37).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(37).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(37).getTerritory().getCannonsNumber());

        //Australie

        StdDraw.text(870, 167, Main.Risk.listRectangles.get(38).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(38).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(38).getTerritory().getCannonsNumber());
        StdDraw.text(910, 70, Main.Risk.listRectangles.get(39).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(39).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(39).getTerritory().getCannonsNumber());
        StdDraw.text(1010, 100, Main.Risk.listRectangles.get(40).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(40).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(40).getTerritory().getCannonsNumber());
        StdDraw.text(970, 190, Main.Risk.listRectangles.get(41).getTerritory().getSoldiersNumber() + " / " + Main.Risk.listRectangles.get(41).getTerritory().getRidersNumber() + " / " + Main.Risk.listRectangles.get(41).getTerritory().getCannonsNumber());


    }

}
