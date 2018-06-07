import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.util.ArrayList;

public class Map {

    public final static int X_MAX = 1200;
    public final static int Y_MAX = 620;
    public final static float WIDTH = 1f;

    private ArrayList<Rectangle> rectangles;
    private Player player;

    public Map(ArrayList<Rectangle> rectangles) {
        this.rectangles = rectangles;
    }

    public static void dessinerMap() {
        StdDraw.setCanvasSize(1200,620); // Taille fenÍtre
        StdDraw.setXscale(0, X_MAX + WIDTH);
        StdDraw.setYscale(0, Y_MAX + WIDTH);

        StdDraw.picture(1200 / 2, 620 / 2, "WorldMapID.jpg", 1180, 600); //Taille de l'image ‡ l'intÈrieur de la fenÍtre
        StdDraw.setPenRadius(0.005); //Epaisseur des cercles
        Font fontRegionsNames = new Font("Baskerville Old Face",Font.BOLD, 23);//Police pour les noms de rÈgions

        StdDraw.setFont(fontRegionsNames);//On dÈfinit la police comme Ètant xxx

        System.out.println("DESSINER MAP");
    }

    public void dessinerCercles() {

        System.out.println("RECT SIZE DESSINER CERCLES : " + this.rectangles.size());

        /*for (int i = 0; i < this.rectangles.size(); i++) {
            System.out.println("ICI");
            this.rectangles.get(i).DrawRectangle();
        }*/

        // AMERIQUE DU NORD
        StdDraw.setPenColor(Color.black);
        StdDraw.text(130,575, "Amérique du Nord");


        //StdDraw.filledRectangle(65,515,32,17); //Alaska
        /*StdDraw.filledRectangle(170,525,32,17); //Territoire du Nord-Ouest
        StdDraw.filledRectangle(365,555,32,17); //Groenland
        StdDraw.filledRectangle(300,462,32,17); //QuÈbec
        StdDraw.filledRectangle(225,462,32, 17); //Ontario
        StdDraw.filledRectangle(153,470,32,17); //Alberta
        StdDraw.filledRectangle(160,410,32,17); //Etats-Unis de l'Ouest
        StdDraw.filledRectangle(240,382,32,17); //Etats-Unis de l'Est
        StdDraw.filledRectangle(175,320,32,17); //Amerique Centrale*/



        // AMERIQUE DU SUD

        StdDraw.text(340,72, "Amérique");
        StdDraw.text(340,50, "du Sud");

        /*StdDraw.filledRectangle(255,270,32,17); //Venezuela
        StdDraw.filledRectangle(250,190,32,17); //PÈrou
        StdDraw.filledRectangle(270,115,32,17); //Argentine
        StdDraw.filledRectangle(330,210,32,17); //BrÈsil*/



        // AFRIQUE

        StdDraw.text(470,130, "Afrique");



        /*StdDraw.filledRectangle(480,230,32,17); //Afrique du Nord
        StdDraw.filledRectangle(562,152,32,17); //Congo
        StdDraw.filledRectangle(570,85,32,17); //Afrique du Sud
        StdDraw.filledRectangle(670,65,32,17); //Madagascar
        StdDraw.filledRectangle(630,190,32,17); //Afrique de l'Est
        StdDraw.filledRectangle(585,258,32,17); //Egypte*/



        // EUROPE

        StdDraw.text(540,560, "Europe");

        /*StdDraw.filledRectangle(532,360,32,17); //Europe du Sud
        StdDraw.filledRectangle(530,407,32,17); //Europe du Nord
        StdDraw.filledRectangle(445,325,32,17); //Europe de l'Ouest
        StdDraw.filledRectangle(417,414,32,17); //Grande-Bretagne
        StdDraw.filledRectangle(460,500,32,17); //Islande
        StdDraw.filledRectangle(535,495,32,17); //Scandinavie
        StdDraw.filledRectangle(630,460,32,17); //Ukraine*/



        // ASIE

        StdDraw.text(955,335, "Asie");

        /*StdDraw.filledRectangle(740,470,32,17); //Oural
        StdDraw.filledRectangle(780,520,32,17); //SibÈrie
        StdDraw.filledRectangle(870,545,32,17); //Yakoutie
        StdDraw.filledRectangle(855,460,32,17); //Tchita
        StdDraw.filledRectangle(960,535,32,17); //Kamchatka
        StdDraw.filledRectangle(970,385,32,17); //Japon
        StdDraw.filledRectangle(860,405,32,17); //Mongolie
        StdDraw.filledRectangle(833,340,32,17); //Chine
        StdDraw.filledRectangle(720,390,32,17); //Afghanistan
        StdDraw.filledRectangle(660,310,32,17); //Moyen-Orient
        StdDraw.filledRectangle(780,300,32,17); //Inde
        StdDraw.filledRectangle(860,260,32,17); //Siam*/

        // Australie

        StdDraw.text(825,110, "Australie");

        /*StdDraw.filledRectangle(870,167,32,17); //IndonÈsie
        StdDraw.filledRectangle(910,70,32,17); //Australie de l'Ouest
        StdDraw.filledRectangle(1010,100,32,17); //Australie de l'Est
        StdDraw.filledRectangle(970,190,32,17); //Nouvelle-GuinÈe*/


        //Interface de gestion de jeu

        Font fontInterface = new Font("Baskerville Old Face", Font.BOLD, 16);//Police pour l'interface de jeu
        Font fontSigns = new Font("Arial", Font.BOLD, 19);
        Font fontTerritories = new Font ("Baskerville Old Face", Font.BOLD, 12);
        Font fontConfirmer = new Font ("Baskerville Old Face", Font.BOLD, 20);
        Font fontVictoire = new Font ("Baskerville Old Face", Font.BOLD, 90);

        StdDraw.setFont(fontTerritories);

        StdDraw.rectangle(1095, 330, 85, 165);//gros rectangle


        StdDraw.rectangle(1052.5,397.5,42.5,12);
        StdDraw.text(1052.5, 397.5, "Territoire 1");
        StdDraw.rectangle(1137.5,397.5,42.5,12);
        StdDraw.text(1137.5, 397.5, "Territoire 2");
        StdDraw.rectangle(1052.5,372.5,42.5,12);
        StdDraw.rectangle(1137.5,372.5,42.5,12);
        StdDraw.rectangle(1052.5,347.5,42.5,12);
        StdDraw.text(1052.5, 347.5, "SÈlectionner");
        StdDraw.rectangle(1137.5,347.5,42.5,12);
        StdDraw.text(1137.5, 347.5, "SÈlectionner");
        StdDraw.rectangle(1095, 220, 85, 15);
        StdDraw.setFont(fontConfirmer);
        StdDraw.text(1095, 220, "Confirmer");
        StdDraw.text(1095, 185, "Phase suivante");



        //UNITES

        //Soldats
        StdDraw.setFont(fontInterface);
        StdDraw.text(1045,315,"Soldats");
        StdDraw.setFont(fontSigns);
        StdDraw.text(1125,311,"+");
        StdDraw.square(1125,315,10);
        StdDraw.text(1160,313,"-");
        StdDraw.square(1160,315,10);

        //Cavaliers
        StdDraw.setFont(fontInterface);
        StdDraw.text(1048,285,"Cavaliers");
        StdDraw.setFont(fontSigns);
        StdDraw.text(1125,281,"+");
        StdDraw.square(1125,285,10);
        StdDraw.text(1160,283,"-");
        StdDraw.square(1160,285,10);

        //Canons
        StdDraw.setFont(fontInterface);
        StdDraw.text(1045,255,"Canons");
        StdDraw.setFont(fontSigns);
        StdDraw.text(1125,251,"+");
        StdDraw.square(1125,255,10);
        StdDraw.text(1160,253,"-");
        StdDraw.square(1160,255,10);


        StdDraw.rectangle(120,90,105,75);//Gros rectangle en bas ‡ gauche

        StdDraw.rectangle(120,140,105,25);
        StdDraw.setFont(fontConfirmer);
        StdDraw.text(120, 150, "Joueur X");
        StdDraw.text(120, 130, "Solde : X");

        StdDraw.setFont(fontInterface);
        StdDraw.text(50,103,"Soldat");
        StdDraw.text(120,103,"Cavalier");
        StdDraw.text(190,103,"Canon");

        StdDraw.rectangle(50, 80, 35,35);//Partie Soldat
        StdDraw.setFont(fontSigns);
        StdDraw.square(27.5, 57.5, 7.5);
        StdDraw.text(26.5,54,"+");
        StdDraw.square(72.5, 57.5, 7.5);
        StdDraw.text(72.5, 56.5,"-");

        StdDraw.rectangle(120,80, 35,35);//Partie Cavalier
        StdDraw.setFont(fontSigns);
        StdDraw.square(97.5, 57.5, 7.5);
        StdDraw.text(96.5,54,"+");
        StdDraw.square(142.5, 57.5, 7.5);
        StdDraw.text(142.5, 56.5,"-");

        StdDraw.rectangle(190, 80, 35,35);//Partie Canon
        StdDraw.setFont(fontSigns);
        StdDraw.square(167.5, 57.5, 7.5);
        StdDraw.text(166.5,54,"+");
        StdDraw.square(212.5, 57.5, 7.5);
        StdDraw.text(212.5, 56.5,"-");

        StdDraw.rectangle(120,30,105,15);
        StdDraw.setFont(fontConfirmer);
        StdDraw.text(120,30, "Convertir");

        /*StdDraw.rectangle(120,90,105,75);//Gros rectangle en bas ‡ gauche

        StdDraw.rectangle(120,140,105,25);
        StdDraw.setFont(fontConfirmer);
        StdDraw.text(120, 150, "Territoire X");
        StdDraw.setFont(fontInterface);
        StdDraw.text(120, 130, "So : X / Cv : X / Ca : X");

        StdDraw.setFont(fontInterface);
        StdDraw.text(50,103,"Soldat");
        StdDraw.text(120,103,"Cavalier");
        StdDraw.text(190,103,"Canon");

        StdDraw.rectangle(50, 80, 35,35);//Partie Soldat
        StdDraw.setFont(fontSigns);
        StdDraw.square(27.5, 57.5, 7.5);
        StdDraw.text(26.5,54,"+");
        StdDraw.square(72.5, 57.5, 7.5);
        StdDraw.text(72.5, 56.5,"-");

        StdDraw.rectangle(120,80, 35,35);//Partie Cavalier
        StdDraw.setFont(fontSigns);
        StdDraw.square(97.5, 57.5, 7.5);
        StdDraw.text(96.5,54,"+");
        StdDraw.square(142.5, 57.5, 7.5);
        StdDraw.text(142.5, 56.5,"-");

        StdDraw.rectangle(190, 80, 35,35);//Partie Canon
        StdDraw.setFont(fontSigns);
        StdDraw.square(167.5, 57.5, 7.5);
        StdDraw.text(166.5,54,"+");
        StdDraw.square(212.5, 57.5, 7.5);
        StdDraw.text(212.5, 56.5,"-");

        StdDraw.rectangle(120,30,105,15);
        StdDraw.setFont(fontConfirmer);
        StdDraw.text(120,30, "Placer");*/


        //BOUTONS PREVISIONS

        while (true) {


            double a = StdDraw.mouseX();
            double b = StdDraw.mouseY();

            //AmÈrique du Nord

            if (a > 32 && a < 98 && b > 497 && b < 533) {//Alaska
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 137 && a < 203 && b > 492 && b < 558) {//Territoires du Nord-Ouest
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 332 && a < 398 && b > 537 && b < 573) {//Groenland
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 267 && a < 333 && b > 444 && b < 480) {//QuÈbec
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 192 && a < 258 && b > 444 && b < 480) {//Ontario
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 120 && a < 186 && b > 452 && b < 488) {//Alberta
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 127 && a < 193 && b > 392 && b < 428) {//Etats-Unis de l'Ouest
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 207 && a < 273 && b > 364 && b < 398) {//Etats-Unis de l'Est
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 142 && a < 208 && b > 302 && b < 338) {//AmÈrique Centrale
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            //AmÈrique du Sud

            if (a > 222 && a < 288 && b > 252 && b < 288) {//Venezuela
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 217 && a < 283 && b > 172 && b < 208) {//PÈrou
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 237 && a < 303 && b > 97 && b < 133) {//Argentine
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 297 && a < 363 && b > 192 && b < 228) {//BrÈsil
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }


            //Afrique

            if (a > 447 && a < 513 && b > 212 && b < 248) {//Afrique du Nord
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 529 && a < 595 && b > 134 && b < 170) {//Congo
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 537 && a < 603 && b > 67 && b < 103) {//Afrique du Sud
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 637 && a < 703 && b > 47 && b < 83) {//Madagascar
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 597 && a < 663 && b > 172 && b < 208) {//Afrique de l'Est
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 552 && a < 618 && b > 240 && b < 276) {//Egypte
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }


            //Europe


            if (a > 499 && a < 565 && b > 342 && b < 378) {//Europe du Sud
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 497 && a < 563 && b > 389 && b < 425) {//Europe du Nord
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 412 && a < 478 && b > 307 && b < 343) {//Europe de l'Ouest
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 384 && a < 450 && b > 396 && b < 432) {//Grande-Bretagne
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 427 && a < 493 && b > 482 && b < 518) {//Islande
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 502 && a < 568 && b > 477 && b < 513) {//Scandinavie
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 597 && a < 663 && b > 432 && b < 478) {//Ukraine
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }


            //Asie
            if (a > 707 && a < 773 && b > 452 && b < 488){//Oural
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 747 && a < 813 && b > 502 && b < 538){//SibÈrie
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 837 && a < 903 && b > 527 && b < 563){//Yakoutie
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 822 && a < 888 && b > 442 && b < 478){//Tchita
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 927 && a < 993 && b > 517 && b < 553){//Kamchatka
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 937 && a < 1003 && b > 367 && b < 403){//Japon
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 827 && a < 893 && b > 387 && b < 423){//Mongolie
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 800 && a < 866 && b > 322 && b < 358){//Chine
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 687 && a < 753 && b > 372 && b < 408){//Afghanistan
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 627 && a < 693 && b > 292 && b < 328){//Moyen-Orient
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 747 && a < 813 && b > 282 && b < 318){//Inde
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 827 && a < 893 && b > 242 && b < 278){//Siam
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            //Australie


            if (a > 837 && a < 903 && b > 149 && b < 185){//IndonÈsie
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 937 && a < 1003 && b > 172 && b < 208){//Nouvelle-GuinÈe
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 877 && a < 943 && b > 52 && b < 88){//Australie de l'Ouest
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 977 && a < 1043 && b > 82 && b < 118){//Australie de l'Est
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }


            //BOUTONS INTERFACE

            if (a > 1009 && a < 1094 && b > 335.5 && b < 359.5){//Bouton SÈlectionner Territoire 1
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 1096 && a < 1181 && b > 335.5 && b < 359.5){//Bouton SÈlectionner Territoire 2
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 1114 && a < 1136 && b > 304 && b < 326){//Bouton + Soldat
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 1149 && a < 1171 && b > 304 && b < 326){//Bouton - Soldat
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 1114 && a < 1136 && b > 274 && b < 296){//Bouton + Cavalier
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 1149 && a < 1171 && b > 274 && b < 296){//Bouton - Cavalier
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 1114 && a < 1136 && b > 244 && b < 266){//Bouton + Canon
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 1149 && a < 1171 && b > 244 && b < 266){//Bouton - Canon
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 1009 && a < 1181 && b > 204 && b < 236){//Bouton Confirmer
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            if (a > 1009 && a < 1181 && b > 165 && b < 205){//Bouton Phase suivante
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }


            //BOUTONS INTERFACE CONVERSION RENFORTS

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

            if (a > 14 && a < 226 && b > 14 && b < 46){//Bouton Confirmer
                if (StdDraw.isMousePressed()) {
                    System.out.println("ok");
                }
            }

            /*//BOUTONS INTERFACE PLACER RENFORTS

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




}
